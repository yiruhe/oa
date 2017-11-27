
$(function(){

    var userForm = $("#user-form ");
    var usernameSelectDom =userForm.find("select[name='department.id']");
    var postSelectDom = userForm.find("select[name = 'posts.id']");


    userForm.submit(function(){

       if(usernameSelectDom.val() === ""){

          alert("请输入用户名");

          return false;
       }

       if(postSelectDom.val() === "" || postSelectDom.val() === null){

          alert("请选择部门");

          return false;
       }

       return true;
    });

});

