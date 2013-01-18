<%@include file="/WEB-INF/jsp/commonHeader.jsp"%>

<div class="container">
	<div class="row">
		<div class="span3">
			<div class="bs-docs-sidebar">
				<ul class="nav nav-tabs nav-stacked">
	              <li><a href="#" class="pane-header">Records</a></li>
	              <li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li>
	              <li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li><li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li>
	              <li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li>
	              <li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li>
	              <li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li><li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li>
	              <li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li><li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li>
	              <li>
	              	<a href="#">
	              	<span class="person-name" >one</span><br/>
	              	<span class="date">1/1/1990</span>
	              	</a>
	              </li>
	              
            	</ul>
			</div>
		</div>		
		<div class="span7">
			
		<h2>Administration</h2>
		Enter new birthday record
		<form method="post" action="sumit.do">
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