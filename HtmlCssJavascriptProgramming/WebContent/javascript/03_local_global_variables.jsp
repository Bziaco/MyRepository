<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript">
			var v1 = "A";
			
			function fun1() {
				var v2 = "B";
				v3 = "c";
				console.log("V1: " + v1);
				console.log("V2: " + v2);
				console.log("V3: " + v3);
			}
			
			function fun2() {
				var v2 = "B";
				console.log("V1: " + v1);
				console.log("V2: " + v2);
				console.log("V3: " + v3);
			}
			function fun3() {
				if(true){
					var v4 = "D";
				}
				console.log("V4: " + v4);
			}
		</script>
	</head>
	<body>
		지역변수와 전역변수
		<hr/>
		<script type="text/javascript">
			fun1();
			console.log("-----------");
			//func2();
			fun3();
		</script>
		
	</body>
</html>