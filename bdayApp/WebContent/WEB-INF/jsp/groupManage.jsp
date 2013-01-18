<%@include file="/WEB-INF/jsp/commonHeader.jsp"%>
<style type="text/css">
	#contactList {
		max-height: 300px;		
	};
</style>
<div class="container">
	<div class="row">
		<div class="span3 bs-docs-sidebar">
			<table id="contactList" class="table table-bordered">
				<tr><th>Contact Groups</th></tr>
				<tr><td>No Group</td></tr>
			</table>
		</div>
		<div class="span5">
			<textarea id="emailData" style="width: 400px; height: 140px;"></textarea>
		</div>
	</div>
</div>
<script type="text/javascript">
	$("#contactList").click(function(){
		//asyc fetch data
		var emailList = "samele@abc.com, and@ymail.com";
		$('#emailData').html(emailList);
	});
</script>
<%@include file="/WEB-INF/jsp/commonFooter.jsp"%>