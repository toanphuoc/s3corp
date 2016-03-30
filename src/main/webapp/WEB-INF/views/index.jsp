<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    
	<title>Insert title here</title>
	<link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet">
	<link href="<c:url value='/static/css/business-casual.css' />" rel="stylesheet"></link>
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">
   
    <script type="text/javascript" src="static/js/jquery.js"></script>
    <script type="text/javascript" src="<c:url value='/static/js/bootstrap.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/static/js/angular/angular.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/static/js/angular/angular-route.min.js' />"></script>
	<script type="text/javascript" src="<c:url value='/static/js/angular/angular-sanitize.min.js' />"></script>
</head>
<body class="ng-cloak">
	<div class="brand">Business Casual</div>
    <div class="address-bar">3481 Melrose Place | Beverly Hills, CA 90210 | 123.456.7890</div>

    <!-- Navigation -->
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <!-- navbar-brand is hidden on larger screens, but visible when the menu is collapsed -->
                <a class="navbar-brand" href="index.html">Business Casual</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#/items/home">Home</a>
                    </li>
                    <li>
                        <a href="#/items/about">About</a>
                    </li>
                    <li>
                        <a href="#/items/blog">Blog</a>
                    </li>
                    <li>
                        <a href="#/items/contact">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

    <div class="container" ng-view>

       

    </div>
    <!-- /.container -->

    <footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <p>Copyright &copy; Your Website 2014</p>
                </div>
            </div>
        </div>
    </footer>
	
	
	<script src="<c:url value='/static/js/app.js' />"></script>
	<!-- <script src="<c:url value='/static/js/service/user_service.js' />"></script> -->
	<script src="<c:url value='/static/js/controller/controllers.js' />"></script>
	<script src="<c:url value='/static/js/controller/home_controller.js' />"></script>
	<script src="<c:url value='/static/js/controller/about_controller.js' />"></script>
	<script src="<c:url value='/static/js/controller/blog_controller.js' />"></script>
	<script src="<c:url value='/static/js/controller/contact_controller.js' />"></script>
</body>
</html>