var zTreeObj = {
    //ztree的相关初始配置
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

    loadTreeData:function () {

        $.ajax({
            url:"/menu/list",
            type:"post",
            success:function (data) {

                $.fn.zTree.init($("#privilegeTree"), zTreeObj.setting, data);
            },
            error:function () {
                console.log("错误");
            }
        });

    }





};

$(function () {

    zTreeObj.loadTreeData();

});
