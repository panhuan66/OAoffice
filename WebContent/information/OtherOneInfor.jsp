 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="code/css/bootstrap.min.css">
<title>个人信息</title>
</head>
<body>
<form method="post" name="myform2" action="">
 <table class="table" align="center" border="1" width="600">
     <tr align="center" bgcolor="#cccccc">
     <td colspan="4"><strong>个人信息查询—他人信息</strong></td>
     </tr>
     <c:forEach items="${staffs }" var="stf">
     <tr>
     <td>员工号</td>
     <td colspan="3"><input readonly="readonly" type="text" name="id" value="${stf.getId() }"></td>
     </tr>
     <tr>
     <td>姓名</td><td><input readonly="readonly" type="text" name="name" value="${stf.getName() }"></td>
     <td>性别</td><td><input readonly="readonly" type="text" name="sex" value="${stf.getSex() }"></td>
     </tr>
     <tr>
     <td>所属部门</td><td><input readonly="readonly" type="text" name="dept" value="${stf.getDept() }"></td>
     <td>年龄</td><td><input readonly="readonly" type="text" name="age" value="${stf.getAge() }"></td>
     </tr>
     <tr>
     <td>电子邮件</td><td><input readonly="readonly" type="text" name="email" value="${stf.getEmail() }"></td>
     <td>职位</td><td><input readonly="readonly" type="text" name="job" value="${stf.getJob() }"></td>
     </tr>
     <tr>
     <td>办公电话</td><td><input readonly="readonly" type="text" name="tel" value="${stf.getTel() }"></td>
     <td>移动电话</td><td><input readonly="readonly" type="text" name="mob" value="${stf.getMob() }"></td>
     </tr>
     <tr>
     <td>住址</td><td><input readonly="readonly" type="text" name="add" value="${stf.getAdd() }"></td>
     <td>系统角色</td><td><input readonly="readonly" type="text" name="role" value="${stf.getRole() }"></td>
     </tr>
      <tr>
     <td>兴趣爱好</td>
     <td colspan="3"><input readonly="readonly" type="text" name="hob" value="${stf.getHob() }"></td>
     </tr>
      <tr>
     <td>个人介绍</td>
     <td colspan="3"><textarea readonly="readonly" type="text" name="intro" >${stf.getIntro() }</textarea></td>
     </tr>
     </c:forEach>
 </table>
</form>
</html>