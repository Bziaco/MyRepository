<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript" src="../jquery/01_jquery_load.jsp"></script>
		<script type="text/javascript">
		$(function() {
			$("#btn1").on("click", function() {
				$("#div1").html("수정내용");
			});
		});
			
		</script>
	</head>
	<body>
		jQuery 라이브러리 로드
		<hr/>
		<button id="btn1">버튼1</button>
		<div id="div1">최초 내용</div>
		
	</body>
</html>