<%@include file="/WEB-INF/jsp/commonHeader.jsp" %>

<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container">
			<span class="brand">Birthday Notifier</span>
		</div>
	</div>
</div>
<br/><br/>
<div class="container">
<div class="row">
	<h2>Login</h2>
</div>

<form action="login.do" method="post">
	<div class="row">username: <input name="username" type="text"/></div>
	<div class="row">password: <input name="password" type="text"/></div>
	<div class="row"><input class="btn" type="submit" value="login"></div>
</form>




</div>
<%@include file="/WEB-INF/jsp/commonFooter.jsp" %>