<html>
<head>
	<title>部门更新</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <#include "../common/common.ftl"/>
</head>
<body>

<!-- 标题显示 --> 
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="/css/images/title_arrow.gif"/> 部门信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
    <form action="/department/update/depart" method="post">
        <input type="hidden" name="id" value="${(dInfo.id)!''}" />
        <div class="ItemBlock_Title1">
        	<IMG BORDER="0" WIDTH="4" HEIGHT="7" SRC="/css/blue/images/item_point.gif" /> 部门信息 </DIV>
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td>部门名称</td>
                        <td>
                            <input type="text" name="name" value="${(dInfo.name)!''}" class="InputStyle"/>
                        </td>
                    </tr>
                    <tr><td>职能说明</td>
                        <td>
                            <textarea name="description" class="TextareaStyle">${(dInfo.description)!''}</textarea>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
        
        <!-- 表单操作 -->
        <div id="InputDetailBar">
            <input type="image" src="/css/images/save.png"/>
            <a href="javascript:history.go(-1);"><img src="/css/images/goBack.png"/></a>
        </div>
    </form>

</div>
</body>
</html>
