<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ page import="com.gallagher.hib3.colorDAO"%>
<%@ page import="com.gallagher.hib3.Color"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HTML Colors</title>
</head>
<body>
<h1>HTML Colors</h1>
<table>
<%
List<Color> colors = colorDAO.listColors();
for (Color c: colors) {
out.println ("<tr style=\"background-color:" + c.getName()+";\">"+
		"<td>" + c.getName() + "</td><td>" +
c.getRed() + "</td><td>" + c.getGreen()+"</td><td>" + c.getBlue());
}
%>
</table>
</body>
</html>