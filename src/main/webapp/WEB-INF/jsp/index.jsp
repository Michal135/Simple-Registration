<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><"strona glowna"/></title>
</head>
<body>
<table width="100%" border="0" cellpadding="8" cellspacing="4" class="tableMenuBg" bgcolor="#e6f2ff">
	<tr>
		<td align="left" width="900">
			<a href="/"><strona glowna></a>;
		</td>
		<td align="right">
			<a href="/register">rejstracja</a>;
		</td>
	</tr>
</table>



<h3 align="center"><c:out value="${message }" /></h3>
</body>
</html>