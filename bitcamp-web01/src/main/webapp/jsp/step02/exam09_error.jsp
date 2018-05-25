<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isErrorPage="true"
    %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam09</title>
</head>
<body>
<h1>오류처리 JSP</h1>
<pre>

오류를 처리할 목적으로 만든 JSP페이지는 다음과 같이 
pgae 지시문 태그에 속성을 추가해야한다.
isErrorPage="true"

이 속성이 추가되면 오류 정보를 저장하고있는 exception이라는
Throwable 타입의 빌트인 객체가 추가된다.
</pre>

<%=exception%>
</body>
</html>







