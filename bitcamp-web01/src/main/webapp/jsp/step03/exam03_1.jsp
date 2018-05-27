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
<h1>JSP 전용 태그: useBean</h1>
<pre>
jsp:useBean
- 태그를 이용하여 저장소에서 객체를 꺼낼 때 사용한다.
- 만약 객체가 없다면 해당 객체를 생성 할 수도 있다.

[문법]
jsp:useBean id="변수명" class="fully-qualified class name" scope="저장소"
scope
  객체를 꺼낼 저장소를 가리킨다.
  page        => PageContext 저장소
  reuqest     => ServletRequest 저장소
  session     => HttpSession 저장소
  application => ServlerContext 저장소
</pre>
<h2>PageContext에서 ArrayList객체 꺼내기</h2>
<jsp:useBean id="list" class="java.util.ArrayList" scope="page"></jsp:useBean>
<%--
자바코드:
java.util.ArrayList list = (Java.util.ArrayList)pageContext.getAttribute("list");
if (list == null) {
    list = new java.util.ArrayList();
    pageContext.setAttribute("list", list);
}
 --%>
 
 <%=list.size()%>
<h2>Member 객체를 만들어 PageContext에 보관하기</h2>

<jsp:useBean id="member" class="jsp.Member"></jsp:useBean>
아이디 <%=member.getId() %>
이메일 <%=member.getEmail() %>
암호 <%=member.getPassword() %>
 
 
</body>
</html>







