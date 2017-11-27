<html>
<head>
	<title>用户信息</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <#include "../common/common.ftl"/>
    <script src="/js/select_all.js" ></script>
</head>
<body>

<!-- 标题显示 -->
<div id="Title_bar">
    <div id="Title_bar_Head">
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="/css/images/title_arrow.gif"/> 用户信息
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<!--显示表单内容-->
<div id=MainArea>
    <form action="/employee/update/e" id="user-form">
    	<input type="hidden" name="id" value=""/>
        <div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="/css/blue/images/item_point.gif" /> 用户信息 </div>
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr><td width="100">所属部门</td>

                        <td>
                            <select name="department.id" class="SelectStyle">
                            <#if departments??>
                                <#list departments as d>
                                    <option value="${(d.id)!}">${(d.name)!}</option>
                                </#list>
                            </#if>
                            </select>
                        </td>
                    </tr>
                    <tr><td>用户名</td>
                        <td>
                            <input name="name" class="InputStyle" />
							（登录名要唯一）
						</td>
                    </tr>
					<tr><td>性别</td>
                        <td>
                            <label ><input type="radio" name="sex" value="1" />男</label>
                            <label><input type="radio" name="sex" value="2" />女</label>
						</td>
                    </tr>
					<tr><td>联系电话</td>
                        <td><input name="phone" class="InputStyle" /></td>
                    </tr>
                    <tr><td>E-mail</td>
                        <td><input name="email" class="InputStyle" /></td>
                    </tr>
                </table>
            </div>
        </div>
        
		<div class="ItemBlock_Title1"><!-- 信息说明 --><div class="ItemBlock_Title1">
        	<img border="0" width="4" height="7" src="/css/blue/images/item_point.gif" /> 岗位设置 </div>
        </div>
        
        <!-- 表单内容显示 -->
        <div class="ItemBlockBorder">
            <div class="ItemBlock">
                <table cellpadding="0" cellspacing="0" class="mainForm">
                    <tr>
						<td width="100">岗位</td>
						
                        <td>
                            <select  name="pId"  class="SelectStyle"  multiple="true" size="10">
                            <#if posts??>
                                <#list posts as p>
                                    <option value="${(p.id)!}">${(p.name)!}</option>
                                </#list>
                            </#if>
                            </select>
                            按住Ctrl键可以多选或取消选择
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
