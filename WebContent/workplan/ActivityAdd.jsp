<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
function addFunction(){
	alert("提交成功");
	//document.form1.aperson.value="本人";
	document.form1.action="addActivity";
	document.form1.submit();
}


</script>
<body>
<form name="form1" method="post">
<div align="center"> 
  
    <table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td height="38">  <div align="center"> 添加工作计划<font size="3">
                  </font> <font size="3"> </font></div>
          <div align="center"></div></td>
      </tr>
  </table>
  <div ></div>

	<table class="" width="780" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="100%" ><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="B1BCEC">
            <tr> 
              <td bgcolor="#FFFFFF"><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
                  <tr> 
                    <td height="6"   bgcolor="#D3E3F5" ><img src="file:///E|/&#26032;&#24314;&#25991;&#20214;&#22841;%20(2)/image/a666nniu020.jpg" width="1" height="1"></td>
                  </tr>
                </table>
                <table width="100%" border="0" cellpadding="2" cellspacing="1" bgcolor="#CCCCCC">
                  <tr bgcolor="EEF2FD"> 
                    <td width="22%" bgcolor="EEF2FD"><div align="center"></div></td>
                    <td height="23"><div align="center"></div>                      <div align="center"></div>                      <div align="center"></div>                      <div align="center"></div></td>
                  </tr>
                  <tr bgcolor="#FFFFFF">
                    <td><div align="right">活动名称:</div></td>
                    <td height="23"><input type="text" name="aname"></td>
                  </tr>
				   <tr bgcolor="#FFFFFF">
                    <td><div align="right">活动开始时间:</div></td>
                    <td height="23"><input type="text" name="abtime" onFocus="calendar()"></td>
                  </tr>
				   <tr bgcolor="#FFFFFF">
                    <td><div align="right">活动结束时间:</div></td>
                    <td height="23"><input type="text" name="aotime" onFocus="calendar()"></td>
                  </tr>
				   <tr bgcolor="#FFFFFF">
                    <td><div align="right">活动人:</div></td>
                    <td height="23"><input type="textfield" name="aperson" value="本人" size="15" disabled> </td>
                  </tr>
				   <tr bgcolor="#FFFFFF">
                    <td><div align="right">活动内容:</div></td>
                    <td height="185"><textarea name="acontent" cols="40" rows="10"></textarea></td>
                  </tr>
                </table></td>
            </tr>
          </table></td>
       
      
    </table>
    <p>
      <input name="Submit" type="button" onClick="addFunction()"  value="提交">
      &nbsp;&nbsp;&nbsp;&nbsp;
      <input type="reset" name="Submit2" value="重置">
  </p>
</div>
</from>
</body>
</html>
