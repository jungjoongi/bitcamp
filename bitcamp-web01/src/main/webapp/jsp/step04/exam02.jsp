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
<h1>EL에서 저장소를 사용하는 방법</h1>
<pre>
EL은 다음 이름을 사용하여 저장소에 접근할 수 있다.

pageContext ==> pageScope(EL), pageContext(JSP)
ServletRequest ==> requestScope(EL), request(JSP)
HttpSession ==> SessionScope(EL), session(JSP)
ServletContext ==> applicationScope(EL), application(JSP)
</pre> 
<%
pageContext.setAttribute("name", "홍길동");
request.setAttribute("name", "임꺽정");
session.setAttribute("name", "유관순");
application.setAttribute("name", "윤봉길");
%>

pageContext: ${pageScope.name} <br>
pageContext: <%=pageContext.getAttribute("name") %> <br> <%-- 쓰지말것 용도가 다르다 --%>
ServletRequest: ${requestScope.name} <br>
HttpSessionContext: ${sessionScope.name} <br>
ServletContext: ${applicationScope.name} <br>


</body>
</html>
