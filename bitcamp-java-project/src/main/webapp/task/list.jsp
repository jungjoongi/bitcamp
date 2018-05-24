<%@page import="java.util.List"%>
<%@page import="bitcamp.java106.pms.domain.Task"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>작업 목록</title>
</head>
<body>
<div id='header'>
<a href='/bitcamp-java-project/auth/login'>로그인</a></div>
<%String teamName = (String)request.getAttribute("teamName");%>
<h1><%=teamName%>팀의 작업 목록 </h1>
<p><a href='add?teamName=<%=teamName%>'>새 작업</a></p><table border='1'>
<tr>
    <th>번호</th><th>작업명</th><th>기간</th><th>작업자</th>
</tr>
<%
List<Task> list = (List<Task>)request.getAttribute("list");
for (Task task : list) {
%>

<tr>
    <td><%=task.getNo()%></td>
    <td><a href='view?no=<%=task.getNo()%>'><%=task.getTitle()%></td>
    <td><%=task.getStartDate()%>~<%=task.getEndDate()%></td>
    <td><%=(task.getWorker() == null) ? "-" : task.getWorker().getId()%></td>
</tr>
<%}%>
</table>
</body>
</html>
