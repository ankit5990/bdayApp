<%@include file="/WEB-INF/jsp/commonHeader.jsp" %>
<div class="container">
<div class="row">
	<div class="span1"><h2>Login</h2></div>
</div>
 
<div class="row">
	<div class="span4">
		<form id="loginform" action="login.do" method="post">
			<div class="row">
				<div class="span1">username: </div>
				<div class="span3"><input id="username" name="username" type="text"/></div>
			</div>
			<div class="row">
				<div class="span1">password: </div>
				<div class="span3"><input id="password" name="password" type="password"/></div>
			</div>
			<div class="row">
				<div class="span1"><input class="btn" type="submit" value="login"></div>
			</div>
		</form>
	</div>
</div>
<div id="errormsg" class="span3 alert" style="display: none;"></div>
</div>
<script type="text/javascript">
	$(document).ready(function() {
		$("#headerMenu").hide();
		if("${loginFail}" == "true"){
			$("#errormsg").show();
			$("#errormsg").html("please login");
		}		
	});
	
	$('#loginform').submit( function(){
		var msg;
		var username = $('#username').val();
		var password = $('#password').val();
		var fail = false;
		if(!username && !password){
			msg = "please enter value for username and password";
			fail = true;
		}
		else{
			if(!username){
				msg = "please enter value for username";
				fail = true;
			}
			if(!password){
				msg = "please enter value for password";
				fail = true;
			}
		}
		if(fail){
			$("#errormsg").html(msg);
			$("#errormsg").show();
			return false;
		}
		return true;
	});
</script>
<%@include file="/WEB-INF/jsp/commonFooter.jsp" %>