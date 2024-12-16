<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" info=""%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon"
	href="${defaultURL }/common/images/favicon.ico" />
<link rel="stylesheet" type="text/css"
	href="${defaultURL }/common/css/main_20240911.css">
<!-- bootstrap CDN 시작-->
<link href="<%=application.getInitParameter("bootstrap_css")%>"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script src="<%=application.getInitParameter("bootstrap_js")%>"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
<!-- bootstrap CDN 끝-->

<style type="text/css">
</style>
<!-- jQuery CDN 시작-->
<script src="<%=application.getInitParameter("jquery_js")%>"></script>
<script type="text/javascript">
	$(function() {

	}); // document.ready
</script>
</head>
<body>
	<div id="wrap">
		<a href="main_controller.do?cmd=M001">메인화면</a><br> <a
			href="book_list.do?cmd=B001">교재리스트</a> <a href="redirect.do?cmd=R001">redirect요청</a>
		<a href="search_dept.do?cmd=S001">부서조회</a>
		<form action="post_call.do" method="post">
			<input type="submit" value="post요청 ">
		</form>
	</div>
</body>
</html>