<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam02</title>
</head>
<body>
<h1>자동 생성된 자바 클래스</h1>
<pre>
[JSP 엔진]
- '.jsp' 파일을 가지고 .java 서블릿 클래스를 만드는 일을 한다.
- 그래서 .jsp파일을 템플릿 파일 (template file)이라고 부른다.

[JSP 엔진이 자바 소스 클래스를 만들 떄 규칙]
- HttpJspPage 인터페이스를 구현해야한다.
- 클라이언트 요청이 들어왔을때 _jspService()가 호출되게 해야한다.

[HttpJspPage 인터페이스의 상속도]
HttpJspPage     ===> JspPage      ===> Servlet
                     jspInit()         init()
                     jspDestroy()      destroy()
_jspService()                          getServletInfo()
                                       getServletConfig()
                                       
[톰켓이 JSP를 가지고 서블릿 클래스를 만들 떄 구성도]
exam01.jsp
     ===> exam01_jsp
         ===> HttpJspBase 상속
             ===> HttpServlet 상속
</pre>
</body>
</html>