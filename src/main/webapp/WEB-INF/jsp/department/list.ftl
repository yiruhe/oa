<html>
<head>
    <title>部门列表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <#include "../common/common.ftl"/>
</head>
<body>
 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="/css/images/title_arrow.gif"/> 部门管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id=TableTitle>
            	<td width="150px">部门名称</td>
				<td width="200px">职能说明</td>
				<td>相关操作</td>
            </tr>
        </thead>

		<!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="departmentList">
        	<!-- 
        		iterator说明
        		  *  当前正在迭代的元素在栈顶
        		  *  如果value属性不写，则默认迭代栈顶的元素
        		  *  value值如果为top,则也是迭代栈顶的元素
        	 -->

            <#if result??>
                <#list result as item>
                <tr class="TableDetail1 template">
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>
                    <#--<s:a action="">删除</s:a>-->
                        <a href="saveUI.html">修改</a>
                    </td>
                </tr>
                </#list>
            </#if>


        </tbody>
    </table>
    
    <!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <a href="saveUI.html"><img src="/css/images/createNew.png" /></a>
        </div>
    </div>
</div>

</body>
</html>
