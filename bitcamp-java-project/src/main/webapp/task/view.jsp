<%@page import="java.util.List"%>
<%@page import="bitcamp.java106.pms.domain.Task"%>
<%@page import="bitcamp.java106.pms.domain.Member"%>
<%@page import="bitcamp.java106.pms.domain.Classroom"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>작업 보기</title>
</head>
<body>
<div id='header'>
<a href='/bitcamp-java-project/auth/login'>로그인</a></div>
<h1>작업 보기</h1>
<%String teamName = (String)request.getAttribute("teamName");%>
<%
Task task = (Task)request.getAttribute("task");
List<Member> members = (List<Member>)request.getAttribute("members");
%>
<form action='update' method='post'>
<input type='hidden' name='no' value='20'>
<table border='1'>
<tr>
<th>팀명</th><td><input type='text' name='teamName' value='<%=teamName%>' readonly></td>
</tr>
<tr>
<th>작업명</th><td><input type='text' name='title' value='<%=task.getTitle()%>'></td>
</tr>
<tr>
<th>시작일</th><td><input type='date' name='startDate' value='<%=task.getStartDate()%>'></td>
</tr>
<tr>
<th>종료일</th><td><input type='date' name='endDate' value='<%=task.getEndDate()%>'></td>
</tr>
<tr>
<th>작업자</th>
<td>
<select name='memberId'>
<option value=''>--선택 안함--</option>
<%String a = null; %>
<%String b = null; %>


<option <%=a%>><%=b%></option>
</select>
</td>
</tr>
<tr>
<th>작업상태</th><td><select name='state'>
    <option value='0' selected>작업대기</option>
    <option value='1' >작업중</option>
    <option value='9' >작업완료</option>
</select></td>
</tr>
</table>
<button>변경</button>
<a href='delete?no=20&teamName=ㅁㄴㅇㅁㄴㅇ'>삭제</a>
</form>
</body>
</html>

    