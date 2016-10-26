<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Exam13
		<hr/>
		[회원가입] <br/>
		<form method="post" action="/myapp/exam13/memberJoin">  <%--내가 POST방식으로 요청을 하겠다 --%>
			아 이 디: <input type="text" name="mid" value="fall"/> <br/>   <%--name==mid라는 파라미터 값이 됨 --%>
			이    름: <input type="text" name="mname" value="한가을"/> <br/>
			비밀번호: <input type="password" name="mpassword" value="12345"> <br/>
			나   이: <input type="number" name="mage" value="28"><br/> 
		         생년월일 : <input type="date" name="mbirth" value="2016-09-29"/> <br/><br/>
			<input type="submit" value="회원가입"/>
		</form>
	</body>
</html>