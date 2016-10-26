<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		SpringBoardProgramming
		<hr/>
		1. <a href="<%=pageContext.getServletContext().getContextPath()%>/member/login">로그인</a><br/>
		2. <a href="${pageContextservletContext.contextPath}/freeboard/list">자유 게시판</a><br/>
		3. <a href="/myweb/photoboard/list">포토 게시판</a><br/>
	</body>
</html>
