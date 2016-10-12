<%@ page contentType = "text/html;charset=UTF-8"%><%--지시자를 사용하겠다 --%>
<%@ page import="com.mycompany.myapp.exam07.*" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		데이터 찾기
		<hr/>
		[HttpServletRequest를 이용해서 찾기] <br/>
		데이터1: <%=(String)request.getAttribute("data1")%> <br/>
		데이터2: <%=(String)request.getAttribute("data2")%> <br/> <br/>
		
		[HttpSession을 이용해서 찾기] <br/>
		데이터1: <%=(String)session.getAttribute("data1")%> <br/>
		데이터2: <%=(String)session.getAttribute("data2")%> <br/> <br/>
		
		[EL을 이용해서 찾기]	<br/>
		데이터1: ${data1} <br/>   <%--Request에서 먼저 찾고 그다음 Session에서 찾음, 둘다 잇으면 Request에 있는 data1만 가지고 옴 --%>
		데이터2: ${data2} <br/>
		
		[객체의 속성(필드) 값 얻기]<br/> <%--실행하는 코드를 넣을 때 <%= %> 값을 산출하는 코드를 넣을 때 java코드는 중괄호 안에 넣는다 --%>
		<%Board board = (Board) request.getAttribute("board"); %>
		<% if(board !=null){%>
		번호: ${board.bno} <br/>
		제목: ${board.title} <br/>
		내용: ${board.content} <br/>
		조회수: ${board.hitcount} <br/>
		<%}%>
		
		
		<%-- 번호: ${board.bno} <br/>
		제목: $(board.title) <br/>
		내용: $(board.content) <br/>
		조회수: $(board.hitcount)) <br/> --%>
		
		[컬랙션 이용하기] <br/>
		
		<table style="border-collapse: collapse, border:1px solid black, width:600px">
			<tr style="background-color: #ffcc00">
				<td style="border: 1px solid black">번호</td>
				<td style="border: 1px solid black">제목</td>
				<td style="border: 1px solid black">내용</td>
				<td style="border: 1px solid black">조회수</td>
			</tr>
			
		<%-- <%List<Board> list = (List<Board>)request.getAttribute("boardlist");
		<%for(Board b : list) {%>
			<tr>
				<td style="border: 1px solid black"> <%=b.getBno()%> </td>
				<td style="border: 1px solid black"> <%=b.getTitle()%> </td>
				<td style="border: 1px solid black"> <%=b.getContent()%> </td>
				<td style="border: 1px solid black"> <%=b.getHitcount()%> </td>
			<tr>
		<%}%> --%>
			<c:forEach var="b" items="${boardlist}">
				<tr>
				<td style="border: 1px solid black"> ${b.bno}</td>
				<td style="border: 1px solid black"> ${b.title}</td>
				<td style="border: 1px solid black"> ${b.content}</td>
				<td style="border: 1px solid black"> ${b.hitcoint}</td>
			<tr>
			</c:forEach>
		</table>
	</body>
</html>