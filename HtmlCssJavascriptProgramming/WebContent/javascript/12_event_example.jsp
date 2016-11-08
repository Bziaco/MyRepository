<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript">
		 	function checkMid() {
				var mid = document.querySelector("#mid");
				mid.value = mid.value.toLowerCase();
			}
			
			window.onload = function() {
				document.querySelector("#mid").addEventListener("keypress", checkMid);
				document.querySelector("#mid").addEventListener("change", checkMid);
			};
			
			function changeImg(img) {
				//console.log(event.type);
				var img = document.querySelector("#img1");
				if(event.type == "mouseover"){
					img.src = "../common/image/photo2.jpg";
				} else if(event.type == "mouseout"){
					img.src = "../common/image/photo1.jpg";
				}
			}
			function changeImg2() {
				//console.log(event.type);
				var img = event.target;
				if(event.type == "mouseover"){
					img.src = "../common/image/photo2.jpg";
				} else if(event.type == "mouseout"){
					img.src = "../common/image/photo1.jpg";
				}
			}
			
			window.addEventListener("load", function(){
				console.log("xxxxxxx");
				var img2 = document.querySelector("#img2");
				img2.addEventListener("mouseover", changeImg2);
				img2.addEventListener("mouseout", changeImg2);
				
			});
			
			function changecolor(div) {
				//console.log(event.type);
				var color = event.target;
				if(event.type == "mouseover"){
					div.style.backgroundColor = "blue";
				} else if(event.type == "mouseout"){
					div.style.backgroundColor = "red";
				}
			}
			
		</script>
	</head>
	<body>
		다양한 Event 처리
		<hr/>
		<h3>[Ex1]</h3>
		<form>
			<!-- <input id="mid" type="text" name="mid" onkeypress="checkMid()" onchange="checkMid()"> -->
			<input id="mid" type="text" name="mid">
		</form>
		<br/>
		<h3>[Ex2]</h3>
		<img id="img1" src="../common/image/photo1.jpg" width="200px" onmouseover="changeImg(this)" onmouseout="changeImg(this)">
		<img id="img2" src="../common/image/photo1.jpg" width="200px">
		
		<h3>[Ex3]</h3>
		<div id="div1" style="width:100px;height:100px;background-color: red;" onmouseover="changecolor(this)" onmouseout="changecolor(this)"></div>
</html>