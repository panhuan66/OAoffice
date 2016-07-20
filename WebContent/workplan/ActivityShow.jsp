<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<body leftmargin="0" topmargin="0">
<div align="center"> 
  
    <table width="300" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td height="38">  <div align="center">全部工作列表</a></div>
          <div align="center"></div></td>
      </tr>
    </table>
   
    <table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="100%" ><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="B1BCEC">
            <tr> 
              <td bgcolor="#FFFFFF">
     
                <table width="100%" border="0" cellpadding="2" cellspacing="1" bgcolor="#CCCCCC">
                  <tr bgcolor="EEF2FD"> 
                    <td width="30%" height="23"><div align="center">工作安排</div></td>
                    <td width="25%"><div align="center">工作日期</div></td>
                    <td width="23%"> <div align="center">工作时间</div></td>
                    <td width="22%"><div align="center">安排人</div></td>
                  </tr>
                   <c:forEach var="activity" items="${activity1}" >
                       <tr bgcolor="#FFFFFF">
                       <th scope="row" ><a href="selectActivity?aid=${activity.getActivity_id()}">${activity.getActivity_name()}</a></th>
                       <td>${activity.getActivity_begintime()}</td>
                       <td>${activity.getActivity_overtime()}</td>
                       <td>${activity.getActivity_person()}</td>
                       </tr>
                   </c:forEach>
                  
          </table>
       
     
    </table>

   　<a href="workplan/ActivityAdd.jsp" target="_self">添加工作安排</a>
   </div>
</body>
</html>
