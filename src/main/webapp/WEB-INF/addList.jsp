<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List" %>
<%@ page import="com.javaex.vo.GuestbookVO" %>

<%
	List<GuestbookVO> guestbookList = (List<GuestbookVO>)request.getAttribute("gList");
	System.out.println("여기는 jsp임둥");
	System.out.println(guestbookList);
%>    

    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="http://localhost:8080/guestbook2/gbc" method="get">
			<table border="1" width="540px">
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="name" value="">
					</td>
	
					<td>비밀번호</td>
	                <td>
	                	<input type="password" name="password" value="">
	                </td>
				</tr>
				<tr>
					<td colspan="4">
						<textarea cols="72" rows="5" name="content" value=""></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<input type="hidden" name="action" value="write">
						<button type="submit">등록</button>
					</td>
				</tr>
			</table>
		</form>
		<br>
		
		<%
			for(int i=0; i<guestbookList.size(); i++){
		%>
		
		<table border="1" width="540px">
			<tr>
				<td><%= guestbookList.get(i).getNo() %></td>
				<td><%= guestbookList.get(i).getName() %></td>
				<td><%= guestbookList.get(i).getRegDate() %></td>
				<td>
					<a href="http://localhost:8080/guestbook2/gbc?action=dform&no=<%= guestbookList.get(i).getNo() %>">삭제</a>
				</td>
			</tr>
			<tr>
				<td colspan="4"><%= guestbookList.get(i).getContent() %></td>
			</tr>
		</table>
		<br>
		<%
			}
		%>
	</body>
</html>