<%@ page contentType = "text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<%--webkit기반에서만 viewport를 사용함. initial-scale은 자동 축소를 말함 --%>
		<link rel="stylesheet" type="text/css" href="../common/bootstrap-3.3/css/bootstrap.min.css">
		<%--min.css는 주석과 스페이스를 모두 지운 css보다 가벼운 파일 --%>
		<script type="text/javascript" src="../common/bootstrap-3.3/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
 <style type="text/css">
      div{
      border:1px solid gray}
      </style>      
   </head>
   <body>
      <hr/>
         Grid System(layout 작성)   
      <hr/>

		   <!-- Stack the columns on mobile by making one full-width and the other half-width -->
		<div class="row">
		  <div class="col-xs-12 col-md-8">.col-xs-12 .col-md-8</div>
		  <div class="col-xs-6 col-md-4">.col-xs-6 .col-md-4</div>
		</div>
		
   
   </body>
</html>