<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <link rel="stylesheet" type="text/css" href="code/css/bootstrap.min.css">
<title></title>
</head>
<body>
<div align="center"> <font color="#333333">公司通讯录</font></div>
 <p>
 <form action="selectcompany" method="post">
 <table width="780" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr  bgcolor="EEF2FD" >
   <td>
   <div class="input-group">
   <div class="input-group-addon">选择查询</div>
        <select name="select" class="form-control">
          <option value="all">全部</option>
          <option value="dept">部门</option>
        </select>  
    </div>
  <div class="input-group">
      <div class="input-group-addon">查询条件</div>
     <input type="text"  class="form-control" name="text1" placeholder="具体查询条件："/>
   </div>
   <button class="btn btn-default" type="submit" name="Submit1" value="查询" >查询</button>
   </td>
  </tr>
</table>
</form>
<p>
<center>
<table class="table" width="780" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="100%" ><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="B1BCEC">
            <tr> 
              <td bgcolor="#FFFFFF"><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
                  <tr> 
                    <td height="6"   bgcolor="#D3E3F5" ><img src="../image/a666nniu020.jpg" width="1" height="1"></td>
                  </tr>
                </table>
<table  border="1" align="center"  style="border-collapse:collapse">
    <tr  bgcolor="EEF2FD" >
    <th width="68" scope="row">员工编号 </th>
    <td width="85">姓名</td>
    <td width="35">性别</td>
    <td width="53">年龄</td>
    <td width="70">所属部门</td>
    <td width="71">职位</td>
    <td width="142">电子邮件</td>
    <td width="142">办公电话</td>
    <td width="145">移动电话</td>
    <td width="192">住址</td>
  </tr>
  
   <c:forEach var="staff" items="${staff1}" >
  <tr bgcolor="#FFFFFF">
    <th scope="row">${staff.getStaff_id()}</th>
    <td>${staff.getStaff_name()}</td>
    <td>${staff.getStaff_sex()}</td>
    <td>${staff.getStaff_age()}</td>
    <td>${staff.getStaff_dept()}</td>
    <td>${staff.getStaff_job()}</td>
    <td>${staff.getStaff_email()}</td>
    <td>${staff.getStaff_mob()}</td>
    <td>${staff.getStaff_tel()}</td>
    <td>${staff.getStaff_add()}</td>
  </tr>
 </c:forEach>
</table>
</table>
<p align="center">第${page} 页 共${page2} 页 首页
<ul class="pager">
<li>
<c:if test="${pagenow gt 1}">
 <a href="companyAction?pagenow=${page-1}" >上一页</a>
</c:if>
</li>
<li>
<c:if test="${pagenow lt page2}">
 <a href="companyAction?pagenow=${page+1}">下一页</a> 
 </c:if>
 </li>
 <li>
  <a href="companyAction?pagenow=${page2}">尾页</a>
 </li>
</ul>
</body>
</html>