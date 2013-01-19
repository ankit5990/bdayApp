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

	var addedGroupsList = new Array();
	var availableGroupsList = new Array();

	var getGroupId = function(tableElement){
		return tableElement.children(1).val();
	};
	
	var setGroupId = function(tableElement, id){
		tableElement.children(1).val(id);
	};
	
	var removeValueFromArray = function(array, val){
		var size = array.length;
		var index = -1;
		var found = false;
		for(var i=0;i<size;i++){
			if(array[i] === val){
				found = true;
				index = i;
				break;
			}
		}
		if(found){
			for(var i=index;i<size-1;i++){
				array[i] = array[i+1];
			}
			array.length = size - 1;
			return true;
		}
		return false;
	};
	
	var contactAddedTableClick =  function(){
		var id = getGroupId($(this));			
		alert(id);
		if(id != -1){				
			removeValueFromArray(addedGroupsList, id);
			availableGroupsList.push(id);
			$(this).unbind('click',contactAddedTableClick);
			$(this).bind('click',contactAvailableTableClick);
			$('#contactAvailableTable tbody').append($(this).parent(0));
		}
	};
	
	var contactAvailableTableClick = function(){
		var id = getGroupId($(this));			
		alert(id);
		if(id != -1){				
			removeValueFromArray(availableGroupsList, id);
			addedGroupsList.push(id);
			$(this).unbind('click',contactAvailableTableClick);
			$(this).bind('click',contactAddedTableClick);
			$('#contactAddedTable tbody').append($(this).parent(0));
		}
	};
	
	$(document).ready( function(){
		
		var addedGroupTable = $('#contactAddedTable');
		addedGroupTable.append('<tr><td>No Records<input type="hidden" value="-1"/></td></tr>');		
	
		var availableGroupTable = $('#contactAvailableTable');
		availableGroupTable.append('<tr><td>No Records<input type="hidden" value="-1"/></td></tr>');
		
		$("#contactAddedTable tr td").click(contactAddedTableClick);
		
		$("#contactAvailableTable tr td").click(contactAvailableTableClick);
		
		$("#saveDetails").click(function(){
			$('#saveDetails').attr('disabled',true);
			$('#saveDetails').addClass("disabled");
			$('#spinner').append('<img src="img/ajax-loader.gif"/>')
			
			var personnameVal = $('#personname').val();
			var bdateVal = $('#bdate').val();
			var emailVal = $('#email').val();
			
			$.ajax({
				type: "POST",
				url: "saveRecord.do",
				data: {}
			});
		});
		
		$("#cancelSave").click(function(){
			$(location).attr('href','home.do');
		});
	});
</script>
<%@include file="/WEB-INF/jsp/commonFooter.jsp"%>