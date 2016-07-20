 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="code/css/bootstrap.min.css">
<title>他人信息</title>
</head>
<body>
<div align="center"> <font color="#333333">他人信息查询</font></div>
<form method="post" name="myform" action="show2">
<table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr  bgcolor="EEF2FD" >
 <p>
  <div class="input-group">
   <div class="input-group-addon">选择查询</div>
<select name="select" class="form-control">
  <option value="all">全部</option>
  <option value="dept">部门</option>
</select>
   </div>
 <div class="input-group">
      <div class="input-group-addon">查询条件(部门)：</div>
<input type="text" name="texts" class="form-control" placeholder="具体查询条件："/>
  </div>
 </div>
 <table class="table" width="780" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="100%" ><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="B1BCEC">
            <tr> 
              <td bgcolor="#FFFFFF"><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
                  <tr> 
                    <td height="6"   bgcolor="#D3E3F5" ><img src="../image/a666nniu020.jpg" width="1" height="1"></td>
                  </tr>
                </table>
   <button class="btn btn-default" type="submit" name="button"  value="查询" >查询</button>
   <table border="1" align="center"  style="border-collapse:collapse">
    <tr  bgcolor="EEF2FD" >
        <td><strong>员工编号</strong></td>
        <td><strong>姓名</strong></td>
        <td><strong>性别</strong></td>
        <td><strong>年龄</strong></td>
        <td><strong>所属部门</strong></td>
        <td><strong>职位</strong></td>
        <td><strong>电子邮件</strong></td>
        <td><strong>办公电话</strong></td>
        <td><strong>移动电话</strong></td>
        <td><strong>住址</strong></td>
        <td><strong>操作</strong></td>
   </tr>
    <c:forEach items="${staff1}" var="staff">
    <tr bgcolor="#FFFFFF">
       <td>${staff.getId()}</td>
       <td>${staff.getName()}</td>
       <td>${staff.getSex()}</td>
       <td>${staff.getAge()}</td>
       <td>${staff.getDept()}</td>
       <td>${staff.getJob()}</td>
       <td>${staff.getEmail()}</td>
       <td>${staff.getTel()}</td>
       <td>${staff.getMob()}</td>
       <td>${staff.getAdd()}</td>
       <td><a href="detail?stid=${staff.getId()}">详情</a></td>
    </tr>
   </c:forEach>
   </table>
</form>
<ul class="pager">
<p align="center">第${page1} 页 共${page2} 页 首页

<li>
<c:if test="${page gt 1}">
 <a href="show?page=${page1-1}" >上一页</a>
</c:if>
</li>

<li>
<c:if test="${page lt page2}">
 <a href="show?page=${page1+1}">下一页</a> 
 </c:if>
</li>

<li>
  <a href="show?page=${page2}">尾页</a>
</li>
</ul>

</body>
</html>