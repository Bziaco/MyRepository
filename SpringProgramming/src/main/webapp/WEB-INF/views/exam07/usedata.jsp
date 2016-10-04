<%@ page contentType = "text/html;charset=UTF-8"%>

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
	</body>
</html>