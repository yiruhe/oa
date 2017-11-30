var menu = {
	setting:{
		data:{
            simpleData: {
                enable: true,
                pIdKey: "parentId",

            },
        	showLine: true
		}

	},
	loadMenuTree:function(){

		$.post("/menu/list",null,function(data){


            for (var i=0;i<data.length;i++){

                data[i].target = "right";

                console.log(data[i]);
            }

			$.fn.zTree.init($("#menuTree"),menu.setting,data);

		});
	}
};
$().ready(function(){
	menu.loadMenuTree();



});
