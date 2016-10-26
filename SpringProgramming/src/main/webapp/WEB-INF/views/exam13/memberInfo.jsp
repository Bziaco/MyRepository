<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Exam13
		<hr/>
		[회원정보] <br/>
		<%-- <form method="post" action="/myapp/exam13/memberJoin">  내가 POST방식으로 요청을 하겠다--%>
			아 이 디: ${member.mid} <br/>
			이    름: ${member.mname} <br/>
			비밀번호: ${member.mpassword} <br/>
			나   이: ${member.mage} <br/> 
		         생년월일 : ${member.mbirth} <br/><br/>
			<!-- <input type="submit" value="회원가입"/>
		</form>  -->
	</body>
</html>