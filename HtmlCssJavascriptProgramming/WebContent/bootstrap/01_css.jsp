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
	</head>
	<body>
		Bootstrap
		<hr/>
		<!-- Standard button -->
		<button type="button" class="btn btn-default">Default</button>
		
		<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
		<button type="button" class="btn btn-primary">Primary</button>
		
		<!-- Indicates a successful or positive action -->
		<button type="button" class="btn btn-success">Success</button>
		
		<!-- Contextual button for informational alert messages -->
		<button type="button" class="btn btn-info">Info</button>
		
		<!-- Indicates caution should be taken with this action -->
		<button type="button" class="btn btn-warning">Warning</button>
		
		<!-- Indicates a dangerous or potentially negative action -->
		<button type="button" class="btn btn-danger">Danger</button>
		
		<!-- Deemphasize a button by making it look like a link while maintaining button behavior -->
		<button type="button" class="btn btn-link">Link</button>
		
		<br/>
		[Table]
		<br/>
		<br/>
		
		<table class="table table-striped">
			<tr class="success">
				<td>번호</td>
				<td>제목</td>
				<td>글쓴이</td>
			</tr>
			<tr class="warning">
				<td>1</td>
				<td>제목1</td>
				<td>글쓴이1</td>
			</tr>
			<tr class="danger">
				<td>2</td>
				<td>제목2</td>
				<td>글쓴이2</td>
			</tr>
		</table>
		
		<br/>
		[Image]
		<br/>
		<img src="../common/image/photo1.jpg" class="img-rounded" width="200px" height="200px">
		<img src="../common/image/photo1.jpg" class="img-circle" width="200px" height="200px">
		<img src="../common/image/photo1.jpg" class="img-thumbnail" width="200px" height="200px">
		
		<br/><br/>
		<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
		
		<br/><br/>
		
		<div class="progress">
		  <div class="progress-bar progress-bar-striped active" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100" style="width: 45%">
		    <span class="sr-only">45% Complete</span>
  		  </div>
  		</div>
  		<br/><br/>
  		[Split button dropdowns]
  		<br/>
<!-- Split button -->
<div class="btn-group">
  <button type="button" class="btn btn-danger">Action</button>
  <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    <span class="caret"></span>
    <span class="sr-only">Toggle Dropdown</span>
  </button>
  <ul class="dropdown-menu">
    <li><a href="#">Action</a></li>
    <li><a href="#">Another action</a></li>
    <li><a href="#">Something else here</a></li>
    <li role="separator" class="divider"></li>
    <li><a href="#">Separated link</a></li>
  </ul>
</div>
	</body>
</html>