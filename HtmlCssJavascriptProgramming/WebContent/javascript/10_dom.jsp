<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript">
			function onClickButton1() {
				console.log("onClickButton1() 실행");
				//<div> 태그를 가져온다. id로 찾아라
				//var div1 = document.getElementById("div1");
				var div1 = document.querySelector("#div1");
				console.log(div1);
				div1.innerHTML = "수정내용";
			}
			
			function onClickButton2() {
				//var imgArr = document.getElementsByTagName("img");
				//imgArr[0].src = "../common/image/photo10.jpg";
				//var imgArr = document.getElementsByClassName("photo");
				var imgArr = document.querySelectorAll(".photo");
				imgArr[0].src = "../common/image/photo10.jpg"
				
			}
			
			function onClickButton3() {
				var mid;
				var mpassword;
				
				//how1
				inputMid = document.querySelector("#Form1 [name=mid]");
				mid = inputMid.value;
				//위 2개를 한줄로 줄여서 가져오기
				//var inputMid = document.querySelector("[name=mid]").value;
				
				
				inputMpassword = document.querySelector("#Form1 [name=mpassword]");
				mpassword = inputMpassword.value;
				//위 2개를 한줄로 줄여서 가져오기
				//var inputMpassword = document.querySelector("[name=mpassword]").value;
				
				//how2
				//이방법을 사용하려면 form에 name속성값이 있어야함
				mid = document.form1.mid.value;
				mpassword = document.form1.mpassword.value;
				
				//유효성 검사
				if(mid == "") {
					alert("아이디를 입력하세요.");
				} else if(mpassword == ""){
					alert("비밀번호를 입력하세요.");
				}
				
				//서버전송
				//how1
				//var form1 = document.querySelector("#Form1");
				//Form1.submit();
				//how2
				//var form1 = document.querySelector("#Form1").submit();
				document.form1.submit();
			}
		</script>
	</head>
	<body>
		DOM 사용
		<hr/>
		<button onclick="onClickButton1()">버튼1</button>
		<div id="div1">최초 내용</div>
		<button onclick="onClickButton2()">버튼2</button>
		<div id="div2">
			<img class="photo" src="../common/image/photo1.jpg" width="200"></img>
		</div>
		<button onclick="onClickButton3()">버튼3</button>
		<div>
			<form id="Form1" name="form1">
				아이디: <input id="mid" type="text" name="mid"><br/>
				비밀번호: <input id="mpassword" type="password" name="mpassword"><br/>
			</form>
		</div>
	</body>
</html>