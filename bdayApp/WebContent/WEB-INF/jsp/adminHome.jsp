<%@include file="/WEB-INF/jsp/commonHeader.jsp"%>

<div class="container">
	<div class="row">
		<div class="span3">
			<%@include file="/WEB-INF/jsp/recordPane.jsp" %>			
		</div>		
		<div class="span7">
			
		<h2>Administration</h2>
		<h5>Enter new birthday record</h5>
		<form method="get" action="enterRecord.do">
			<table>
				<tr>
					<td>name : </td><td><input type="text"></td>
				</tr>
				<tr>
					<td>birthdate: </td><td><input type="text"></td>
				</tr>
				<tr>
					<td><input type="submit" class="btn" value="Enter Record"></td>
				</tr>
			</table>
		</form>
		
		<h5><a href="contactManage.do">Manage Contact Groups</a></h5>
		<p>Add or Edit group of contacts to send emails to people as a birthday
		reminder</p>
		</div>
	</div>
</div>

<%@include file="/WEB-INF/jsp/commonFooter.jsp"%>