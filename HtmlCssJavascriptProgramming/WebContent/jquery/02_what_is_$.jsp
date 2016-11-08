<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript">
			//함수 (객체) 대입
			var $ = function(selector) {
				console.log("aaa");	
				//선택자에 대해 선택진 모든 것을 배열로 나타내어라
				return document.querySelectorAll(selector);
			};
			
			//동적 메소드 추가
			$.ajax = function() {
				console.log("bbb");	
			};
			
			function test() {
				$("#div1")[0].innerHTML = "수정내용";
				$.ajax();	
			}
		</script>
	</head>
	<body>
		$는 함수형 객체
		<hr/>
		<button onclick="test()">버튼</button>
		<div id="div1">최초 내용</div>
		<script type="text/javascript">
			
		</script>
		
	</body>
</html>