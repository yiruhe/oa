
<html>
<head>
    <title>用户列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <#include "../common/common.ftl"/>
    <script type="text/javascript" src="/js/ztree/js/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="/js/ztree/js/jquery.ztree.exedit.js"></script>
    <script type="text/javascript" src="/js/ztree/js/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="/js/privilege.js"></script>
    <link rel="stylesheet" href="/js/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="/css/images/title_arrow.gif"/> 用户管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle" id="table">
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id=TableTitle>
            	<td><input type="checkbox" id="selectAll" name="allcheck"/>全选</td>
                <td width="100">用户名</td>
                <td width="100">所属部门</td>
                <td>岗位</td>
                <td>相关操作</td>
            </tr>
        </thead>
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="userList">
        	<#if result??>
                <#list result as item>
                    <tr class="TableDetail1 template">
                        <input type="hidden" id="userId" value="${(item.id)!""}" />
                        <td><input type="checkbox" name="userCheckBox"/></td>
                        <td class="username">${(item.name)!}</td>
                       <td>${(item.department.name)!''}</td>
                        <td>
                           <#if item.posts??>
                               <#list item.posts as p>
                                    ${p.name}&nbsp;
                                </#list>
                            </#if>
                        </td>
                        <td>
                            <a href="/employee/delete/e/${(item.id)!''}">删除</a>
                            <a href="/employee/update?id=${(item.id)!''}">修改</a>
                            <a class="privilege" href="javascript:;">设置权限</a>
                        </td>
                    </tr>
                </#list>
            </#if>
        </tbody>
    </table>
    
     <div id="TableTail">
        <div id="TableTail_inside">
            <a href="/employee/update"><img src="/css/images/createNew.png" /></a>
        </div>
    </div>
    
    <div class="ItemBlock_Title1" id="userTitle" style="display: none;"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="/css/blue/images/item_point.gif"/>用户:
        	<div id="userImage"></div>
        </div>
    <div class="ItemBlock_Title1" id="privilegeTitle" style="display: none;"><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="/css/blue/images/item_point.gif" />选择权限</div>
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder" style="display: none;"  id="privilegeContent">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
					<!--表头-->
					<thead>
						<tr align="LEFT" valign="MIDDLE" id="TableTitle">
							<td width="300px" style="padding-left: 7px;">
								<!-- 如果把全选元素的id指定为selectAll，并且有函数selectAll()，就会有错。因为有一种用法：可以直接用id引用元素 -->
								<input type="checkbox" id="allchecked"/>
								<label for="cbSelectAll">全选</label>
							</td>
						</tr>
					</thead>
                   
			   		<!--显示数据列表-->
					<tbody id="TableData">
						<tr class="TableDetail1">
							<!-- 显示权限树 -->
							<td>
                                <ul id="privilegeTree" class="ztree"></ul>
							</td>
						</tr>
					</tbody>
                </table>
            </div>
        </div>
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <image id="savePrivilege"  src="/css/images/save.png"/>
        </div>
</div>

</body>
</html>
