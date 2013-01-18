<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
	<%@include file="/bootstrap/css/bootstrap.min.css"%>
</style>
<style type="text/css">
	<%@include file="/css/custom.css"%>
</style>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<title>birthday notifier 1.0 alpha</title>
</head>
<body>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<a href="home.do" class="brand span2">Birthday Notifier</a>
			<div id="headerMenu" class="btn-group span1 offset6">
				<button class="btn dropdown-toggle" data-toggle="dropdown">Menu
					<span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
                  <li><a href="logout.do">Logout</a></li>                  
                </ul>
			</div>
		</div>
	</div>
</div>
<br/><br/><br/>
<script type="text/javascript">

$('#headerMenu').click( function(){
	if(this.classList.contains("open")){
		this.classList.remove("open");
	}
	else{
		this.classList.add("open");
	}
});

</script>