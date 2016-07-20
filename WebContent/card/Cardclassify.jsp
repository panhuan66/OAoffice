<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="code\css\bootstrap.min.css">
<title></title>
</head>
<body>
<table class="table">
 <caption>名片夹分类</caption>
 <tr bgcolor="#cccccc">
  <th>分类名称</th>
  <th colspan=2>操作</th>
 </tr>
 
 <c:forEach var="card" items="${cardkind1}" >
 <tr align=center>
   <td>${card.getCk_name()}</td>
   <td><a href="Showupdate?cid=${card.getCk_id()}"onclick="return confirm('确认修改吗？')">修改</a></td>
   <td><a href="CardDeleteAction?cid=${card.getCk_id()}"  onclick="return confirm('确认删除吗？')">删除</a></td>
   </tr>
 </c:forEach>

</table>
</body>
</html>