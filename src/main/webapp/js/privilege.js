/**
 * Created by Administrator on 30/11/2017.
 */
var privilege = {
        zTreeObj:{},
        data:{
            username:"",
            uid:""
        },
        init:{
            //ztree初始化设置
            setting:{
                data: {
                    simpleData: {
                        enable: true,
                        pIdKey: "parentId"
                    }
                },
                check: {
                    enable: true
                }
            },
            //初始化所有的权限标签事件
            event:function () {

                //权限A链接标签事件绑定
                $("#TableData .privilege").each(function () {

                    this.checked = true;

                    $(this).unbind("click");
                    $(this).bind("click",function () {


                        if(this.checked){

                            //显示相关的模块
                            $("#userTitle").show();
                            $("#privilegeTitle").show();
                            $("#privilegeContent").show();

                            //把用户点击的用户名加载到privilege.data.username中
                            privilege.pFunction.loadUserToObj.call(this);
                            //给要显示的div设置用户名
                            privilege.pFunction.showUserName($("#userImage"));
                            //加载Ztree
                            privilege.pFunction.loadTreeData();
                        }else{

                            $("#userTitle").hide();
                            $("#privilegeTitle").hide();
                            $("#privilegeContent").hide();

                        }

                        this.checked = !this.checked;


                    });

                });

                //全选事件绑定:
                $("#allchecked").unbind("click");
                $("#allchecked").bind("click",function () {


                    if (this.checked === true){

                        privilege.zTreeObj .checkAllNodes(true);

                    }else{

                        privilege.zTreeObj .checkAllNodes(false);

                    }
                });


                $("#savePrivilege").unbind("click");
                $("#savePrivilege").bind("click",function () {

                    privilege.pFunction.saveTreeData();

                });


            }

        },
        //功能相关的方法
        pFunction:{
            showUserName:function (dom) {

                $(dom).text(privilege.data.username);
            },
            loadUserToObj:function () {

                privilege.data.username =  $(this).closest("tr").find(".username").text();
                privilege.data.uid = $("#userId").val();
            },
            loadTreeData:function () {

                    $.ajax({
                        url:"/employee/privilege",
                        type:"post",
                        data:{
                            id:privilege.data.uid
                        },
                        success:function (data) {



                            privilege.zTreeObj  =  $.fn.zTree.init($("#privilegeTree"), privilege.init.setting, data);

                            console.log(privilege.zTreeObj);
                        },
                        error:function () {
                            console.log("错误");
                        }
                    });

            },
            saveTreeData:function () {

                 var arr =  privilege.zTreeObj.getCheckedNodes(true);

                 console.log(arr);
                 var nodeIdArray ={
                     id: privilege.data.uid,
                     ids:[]
                 };

                for (var i=0;i<arr.length;i++){

                        nodeIdArray.ids.push(arr[i].id);

                }


                $.ajax({
                    url:"/employee/save/privilege",
                    type:"post",
                    data:nodeIdArray,
                    traditional: true,//这里设置为true
                    success:function (data) {

                        alert("保存成功");
                    },
                    error:function (x) {

                        console.log(x);

                    }


                });

            }
        }



};

$(function(){

    privilege.init.event();

});