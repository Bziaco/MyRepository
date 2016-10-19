<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Exam4
		<hr/>
		[회원가입] <br/>
		    <form method="post" action="/myapp/exam11/boardUpdate">  <%--내가 POST방식으로 요청을 하겠다 --%>
		    <input type="image" src="/myapp/resources/image/join.png" width="100"/>
			글쓴이: <input type="text" name="bwriter" value="${board.bwriter}"/> <br/>   <%--name==mid라는 파라미터 값이 됨 --%>
			제목: <input type="text" name="btitle" value="${board.btitle }"/> <br/>
			내용: <textarea rows="5" cols="20" name="bcontent" >${board.bcontent}</textarea> <br/>
		  <input type = "submit" value="글수정"/>
		</form>
	</body>
</html>