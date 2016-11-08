<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<meta charset="UTF-8">
		<script type="text/javascript">
			function test1() {
				$("#div1").html("수정 내용");
			}
			
			function test2() {
				$(".div2").html("수정 내용");
				$(".div2").css("background-Color", "red");
			}
			
			function test3() {
				$("#img3").attr("src", "../common/image/photo11.jpg");
			}
		</script>
	</head>
	<body>
		객체 찾기
		<hr/>
		<button onclick="test1()">버튼</button>
		<div id="div1">최초 내용</div>
		
		
		<button onclick="test2()">버튼</button>
		<div class="div2">최초 내용</div>
		<div class="div2">최초 내용</div>
		<div class="div2">최초 내용</div>
		
		<button onclick="test3()">버튼</button>
		<img id="img3" src="../common/image/photo16.jpg" width="100">
	</body>
</html>