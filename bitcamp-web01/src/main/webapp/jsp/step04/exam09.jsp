<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Team"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam09</title>
</head>
<body>
<h1>EL: 연산자</h1>

<h2>산술연산자</h2>
${20 + 30} <br>
${20 - 30} <br>
${20 * 30} <br>
${20 / 30} <br>

${20 div 30} <br>
${20 % 30} <br>
${20 mod 30} <br>

<h2>논리 연산자</h2>
${true && false} <br>
${true and false} <br>
${true || false} <br>
${true or false} <br>
${not true} <br>

<h2>관계 연산자</h2>
${20 == 30} <br>
${20 eq 30} <br>
${20 != 30} <br>
${20 ne 30} <br>
${20 < 30} <br>
${20 lt 30} <br>
${20 <= 30} <br>
${20 le 30} <br>
${20 > 30} <br>
${20 gt 30} <br>
${20 >= 30} <br>
${20 ge 30} <br>

<h2>empty 연산자</h2>
<%
pageContext.setAttribute("name", "안중근");
pageContext.setAttribute("age", "20");
%>
${empty name} <br>
${empty addr} <br>

<h2>조건 연산자</h2>
${20 > 30 ? "크다" : "작다"}

</body>
</html>
