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
<form action="CardkindUpdateAction" method="post">
<table width="780">
<tr>
  <td align="center">修改名片分类</td>
</tr>
</table>
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr> 
        <td width="100%" ><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="B1BCEC">
            <tr> 
              <td bgcolor="#FFFFFF"><table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="#999999">
                  <tr> 
                    <td height="6"   bgcolor="#D3E3F5" ><img src="../image/a666nniu020.jpg" width="1" height="1"></td>
                  </tr>
                </table>
                <table width="100%" border="0" cellpadding="2" cellspacing="1" bgcolor="#CCCCCC">
                 <c:forEach items="${ck1 }" var="card">
                  <tr bgcolor="#FFFFFF"> 
                    <td width="41%"><div align="right">原分类名：</div></td>
                    <td width="59%"><input type = "text" value = "${card.getCk_name() }" disabled></td>
                  </tr>
                  <tr bgcolor="#FFFFFF"> 
                    <td><div align="right">修改名：</div></td>
                    <td><input type = "text" name="cname"></td>
                  </tr>
                  <tr bgcolor="#FFFFFF"> 
                    <td colspan="2" align="center"><button type="submit" value="提交">提交</button>&nbsp;&nbsp;&nbsp;&nbsp;<button type="reset" value="重置">重置</button></td>
                  </tr>
                  </c:forEach>
                </table></td>
            </tr>
          </table></td>
        <td width="4" valign="top" background="../image/danghangbg6.jpg"><img src="../image/danghangbg7.jpg" width="4" height="6"></td>
      </tr>
      <tr> 
        <td background="../image/danghangbg5.jpg"><img src="../image/danghangbg3.jpg" width="6" height="4"></td>
        <td><img src="../image/danghangbg4.jpg" width="4" height="4"></td>
      </tr>
    </table>
</form>
</body>
</html>