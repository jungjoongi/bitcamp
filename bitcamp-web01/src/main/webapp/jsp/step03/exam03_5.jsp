<%@page import="java.util.ArrayList"%>
<%@page import="jsp.Member"%>
<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam03_5</title>
</head>
<body>
<h1>JSP 전용 태그: useBean + type + class </h1>
<pre>
type 과 class 속성을 모두 지정했을때 동작 원리

type 속성
    generic 표현을 사용할 수 있다.
class 속성

</pre>

<%
Member obj = new Member();
obj.setId("홍길동");
obj.setEmail("hong@test.com");
obj.setPassword("1111");

Member obj2 = new Member();
obj2.setId("임꺽정");
obj2.setEmail("leem@test.com");
obj2.setPassword("1111");

ArrayList<Member> arr = new ArrayList<>();
arr.add(obj);
arr.add(obj2);

pageContext.setAttribute("list", arr);
%>
<h2>type과 class속성을 동시에 설정하기</h2>
<jsp:useBean id="list" 
             type="java.util.List<Member>"
             class="java.util.ArrayList"></jsp:useBean>
 <%
 for (Member member : list) {
 %>
아이디 <%=member.getId() %>, 이메일 <%=member.getEmail() %>, 암호 <%=member.getPassword() %><br> 
<%}%>
</body>
</html>







