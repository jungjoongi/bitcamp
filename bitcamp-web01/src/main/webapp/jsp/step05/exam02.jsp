<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam02</title>
</head>
<body>
<h1>JSTL - c:out</h1>
<pre>
- 출력 코드를 만드는 태그
</pre>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

이름: <c:out value="홍길동"></c:out><br>
나이: <c:out value="20"/><br>
전화: <%="111-111"%><br>
우편번호: ${"11011"}<br>


<h2>저장소의 등록된 값 출력하기</h2>

<%
pageContext.setAttribute("name", "홍길동");
%>
${name} <br>
나이: <c:out value="${age}">20</c:out><br>
나이: <c:out value="${age}" default="20"/>
</body>
</html>







