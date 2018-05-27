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
<h1>JSP 전용 태그: setProperty</h1>
<pre>
jsp:setProperty
- 객체의 셋터를 호출하여 값을 설정하기

[문법]
    jsp:setProperty name="객체명" property="프로퍼티명" value="벨류값"
</pre>
<h2>Member 객체를 만들어 PageContext에 보관하기 + 프로퍼티 값 설정하기</h2>
<jsp:useBean id="member" class="jsp.Member" scope="page"></jsp:useBean>
<jsp:setProperty name="member" property="id" value="홍길동"/>
<jsp:setProperty name="member" property="email" value="hong@test.com"/>
<jsp:setProperty name="member" property="password" value="1111"/>
 
아이디 <%=member.getId() %>
이메일 <%=member.getEmail() %>
암호 <%=member.getPassword() %>
 
</body>
</html>







