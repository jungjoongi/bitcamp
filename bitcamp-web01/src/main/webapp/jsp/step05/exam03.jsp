<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03</title>
</head>
<body>
<h1>JSTL - c:set</h1>
<pre>
- 값을 저장소에 보관하기
</pre>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
pageContext.setAttribute("name", "홍길동");
%>
<c:set var="name2" value="임꺽정" scope="page"/>

name = ${pageScope.name} <br>
name = ${requestScope.name} <br>
name2 = ${pageScope.name2} <br>
name2 = ${requestScope.name2} <br>

</body>
</html>







