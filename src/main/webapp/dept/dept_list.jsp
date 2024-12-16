<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" info="DeptAction에서 제공하는 데이터를 보여주는 페이지"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8UTF-8">
<title>Insert title here</title>
<link rel="shortcut icon"
	href="http://192.168.10.219/jsp_prj/common/images/favicon.ico" />
<link rel="stylesheet" type="text/css"
	href="http://192.168.10.219/jsp_prj/common/css/main_20240911.css">
<!-- bootstrap CDN 시작-->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
<!-- bootstrap CDN 끝-->

<style type="text/css">
</style>
<!-- jQuery CDN 시작-->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {

	}); // document.ready
</script>
</head>
<body>
	<div id="wrap">

		<table class="table table-hover">
			<thead>
				<tr>
					<th style="width: 10%">번호</th>
					<th style="width: 20%">부서번호</th>
					<th style="width: 30%">부서명</th>
					<th style="width: 30%">위치</th>
					<th style="width: 10%">상태</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${empty requestScope.deptList }">
					<tr>
						<td colspan="5" style="text-align: center;">조회된 부서정보가 존재하지
							않습니다.</td>
					</tr>
				</c:if>

				<c:forEach var="dept" items="${requestScope.deptList}" varStatus="i">
					<tr>
						<td><c:out value="${i.count }" /></td>
						<td><c:out value="${dept.deptno }" /></td>
						<td><c:out value="${dept.dname }" /></td>
						<td><c:out value="${dept.loc }" /></td>
						<td><c:out value="${dept.status}" /></td>
					</tr>

				</c:forEach>

			</tbody>
		</table>


	</div>
</body>
</html>