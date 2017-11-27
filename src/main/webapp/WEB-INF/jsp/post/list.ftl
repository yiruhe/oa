<html>
<head>
    <title>岗位列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<#include "../common/common.ftl"/>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="/css/images/title_arrow.gif"/> 岗位管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align="CENTER" valign="MIDDLE" id="TableTitle">
            	<td width="200px">岗位名称</td>
                <td width="300px">岗位说明</td>
                <td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="roleList">
        	<#if result??>
                <#list result as item>
                <tr class="TableDetail1 template">
                    <td>${(item.name)!''}</td>
                    <td>${(item.description!'')}</td>
                    <td>
                        <a href="/post/delete/p/${item.id}">删除</a>
                        <a href="/post/update?id=${(item.id)!}">修改</a>
                    </td>
                </tr>
                </#list>
        	</#if>


        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <a href="/post/update"><img src="/css/images/createNew.png" /></a>
        </div>
    </div>
</div>
</body>
</html>
