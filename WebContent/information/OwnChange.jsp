 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="code/css/bootstrap.min.css">
<title>本人信息</title>
</head>
<body>
<form method="post" name="changeform" action="change">
 <table class="table" align="center" border="1" width="600">
     <tr align="center" bgcolor="#cccccc">
     <td colspan="4"><strong>个人信息查询—本人信息</strong></td>
     </tr>
     <c:forEach items="${sta }" var="stas">
     <tr>
     <td>员工号</td>
     <td colspan="3"><input readonly="readonly" type="text" name="sid" value="${stas.getId() }"></td>
     </tr>
     <tr>
     <td>姓名</td><td><input readonly="readonly" type="text" name="sname" value="${stas.getName() }"></td>
     <td>性别</td><td><input type="text" name="ssex" value="${stas.getSex() }"></td>
     </tr>
     <tr>
     <td>所属部门</td><td><input type="text" name="sdept" value="${stas.getDept() }"></td>
     <td>年龄</td><td><input type="text" name="sage" value="${stas.getAge() }"></td>
     </tr>
     <tr>
     <td>电子邮件</td><td><input type="text" name="semail" value="${stas.getEmail() }"></td>
     <td>职位</td><td><input type="text" name="sjob" value="${stas.getJob() }"></td>
     </tr>
     <tr>
     <td>办公电话</td><td><input type="text" name="stel" value="${stas.getTel() }"></td>
     <td>移动电话</td><td><input type="text" name="smob" value="${stas.getMob() }"></td>
     </tr>
     <tr>
     <td>住址</td><td><input type="text" name="sadd" value="${stas.getAdd() }"></td>
     <td>系统角色</td><td><input type="text" name="srole" value="${stas.getRole() }"></td>
     </tr>
      <tr>
     <td>兴趣爱好</td>
     <td colspan="3"><input type="text" name="shob" value="${stas.getHob() }"></td>
     </tr>
      <tr>
     <td>个人介绍</td>
     <td colspan="3"><textarea name="sintro"> ${stas.getIntro() }</textarea></td>
     </tr>
     </c:forEach>
     <tr>
     <td colspan="4" align="center"><button type="submit" name="button2" value="提交">提交</button></td>
     </tr>
 </table>
</form>
</body>
</html>