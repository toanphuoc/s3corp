<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet">
<link href="<c:url value='/static/css/style.css' />" rel="stylesheet"></link>
</head>
<body ng-app="myApp" class="ng-cloak">
	<div ng-controller="UserController as ctrl">
	<table class="table table-hover">
		<thead>
			<tr>
				<th>ID.</th>
				<th>Name</th>
				<th>Address</th>
				<th>Email</th>
				<th width="20%"></th>
			</tr>
		</thead>
		<tbody>
			
			<tr ng-repeat="u in ctrl.users">
				<td><span ng-bind="u.id"></span></td>
				<td><span ng-bind="u.name"></span></td>
				<td><span ng-bind="u.age"></span></td>
				<td><span ng-bind="u.salary"></span></td>
				<td>
					
				</td>
			</tr>
		</tbody>
	</table>
	</div>
	<script src="<c:url value='/static/js/angular/angular.min.js' />"></script>
	<script src="<c:url value='/static/js/app.js' />"></script>
	<script src="<c:url value='/static/js/service/user_service.js' />"></script>
	<script src="<c:url value='/static/js/controller/user_controller.js' />"></script>
</body>
</html>