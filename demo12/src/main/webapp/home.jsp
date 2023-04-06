<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="d-flex m-3">
		<!-- 경로 찾을 때 : path 기반 -> URI 형식 기준으로 사용하자(상대, 절대) -->
		<form action="upload" method="post" enctype="multipart/form-data">
			<div class="custom-file mb-3">
			<input type="file" class="custom-file-input" id="customFile" name="file">
			<label class="custom-file-label" for="customFile">Choose file</label>
		</div>

		<div class="mt-3">
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
		</form>
                   	</div>
	
	<script>
		// $ -> 제이쿼리 시작
		$(".custom-file-input").on("change", function() {
			
			let fileName = $(this).val().split("\\").pop();
			$(this).siblings(".custom-file-label").addClass("selected").html(fileName);
		});
	</script>
</body>
</html>