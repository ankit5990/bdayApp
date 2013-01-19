<%@include file="/WEB-INF/jsp/commonHeader.jsp"%>

<div class="container">
    <div class="row-fluid">
    	<div class="span5">
        
	        <h3>Enter Details</h3>
	        <label>Name :</label>
	        <input name="personname" id="personname" type="text">
	        <label>BirthDate :</label>
	        <input name="bdate" id="bdate" type="date">
	        <label>Email id :</label>
	        <input name="email" id="email" type="email">
	        <label>Notify to groups</label>
			<div class="container">
				<div class="row">
					<div class="span4">
			        	<table id="contactAddedTable" class="table table-bordered" style="max-height: 500px">
							<tr><th>Contact Groups Added</th></tr>
						</table>
					</div>
					<div class="span4 offset1">
						<table id="contactAvailableTable" class="table table-bordered" style="max-height: 500px">
							<tr><th>Contact Groups Available</th></tr>
						</table>
					</div>
				</div>

				<div class="row">
					<div class="span3">
						<button id="saveDetails" class="btn btn-success">save</button>
						<img id="spinner" style="height: 10px; width: 10px"></img>
					</div>
					<div class="span1 offset1">
						<button id="cancelSave" class="btn btn-danger">cancel</button>
					</div>			
				</div>
			</div>
        </div>
    </div>
</div>

<script type="text/javascript">
	$(document).ready( function(){
		var addedGroupTable = $('#contactAddedTable');
		addedGroupTable.append("<tr><td>No Records</td></tr>");
	
		var availableGroupTable = $('#contactAvailableTable');
		availableGroupTable.append("<tr><td>No Records</td></tr>");
		
		$("#contactAddedTable tr td").click( function(){
			alert($(this).html());	
		});
		
		$("#contactAvailableTable tr td").click( function(){
			alert($(this).html());	
		});
		
		$("#saveDetails").click(function(){
			$('#saveDetails').attr('disabled',true);
			$('#saveDetails').addClass("disabled");
			$('#spinner').append('<img src="img/ajax-loader.gif"/>')
		});
		
		$("#cancelSave").click(function(){
			$(location).attr('href','home.do');
		});
	});
</script>
<%@include file="/WEB-INF/jsp/commonFooter.jsp"%>