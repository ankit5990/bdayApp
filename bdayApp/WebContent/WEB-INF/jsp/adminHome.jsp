<%@include file="/WEB-INF/jsp/commonHeader.jsp"%>

<div class="container">
	<div class="row">
		<div class="span3">
			<%@include file="/WEB-INF/jsp/recordPane.jsp" %>			
		</div>		
		<div class="span7">
			
		<h2>Administration</h2>
		Enter new birthday record
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
		</div>
	</div>
</div>

<%@include file="/WEB-INF/jsp/commonFooter.jsp"%>