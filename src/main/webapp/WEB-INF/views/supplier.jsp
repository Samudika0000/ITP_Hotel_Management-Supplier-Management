<jsp:include page="/WEB-INF/views/header.jsp" />
<%@page import="java.util.ArrayList"%>
<div class="row">
	<ol class="breadcrumb">
	    <li class="breadcrumb-item"><a href="/supplier-management">Supplier Dashboard</a></li>
  	</ol>
</div>
<div class="row">
<h3>Supplier Overview</h3>
</div>
<div class="row">
<form class="form-inline" action="supplier" method="get">
   <label for="inputPassword2" class="sr-only">Supplier ID  :  </label>
   <div class="row">
   		<div class="col">
   		 	<input type="text" class="form-control" name="supplierId" placeholder="Supplier ID">
   		</div>
   </div> 
   <div class="row">
 		 <input class="btn btn-success" type="submit" name="submit" value="Search">
   </div>  
</form>
<br>
<div class="row">
<div class="alert alert-success" role="alert" id="successAlert">
  ${success}
</div>
<div class="alert alert-danger" role="alert" id="failedAlert">
  ${error}
</div>
</div>
<table class="table" >
  <thead>
    <tr>                                                      
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Contact Number</th>
      <th scope="col">Category</th>
      <th scope="col">Company Name</th>
      <th scope="col">Company Address</th>  
      <th scope="col">Edit</th>  
      <th scope="col">Delete</th>  
    </tr>
  </thead>
  <tbody>
  <%ArrayList<com.suppliermanagement.model.Supplier> suppliers = 
            (ArrayList<com.suppliermanagement.model.Supplier>)request.getAttribute("suppliers");
        for(com.suppliermanagement.model.Supplier supplier:suppliers){%>
    <tr>
	   	  <td><%=supplier.Id%></td>
	   	  <td><%=supplier.Name%></td>
	   	  <td><%=supplier.Email%></td>
	   	  <td><%=supplier.ContactNumber%></td>
	   	  <td><%=supplier.Category%></td>
	   	  <td><%=supplier.CompanyName%></td>
	   	  <td><%=supplier.CompanyAddress%></td>
	   	  <td><a href="/supplier?edit=true&supplierId=<%=supplier.Id%>" class="btn btn-primary">Edit</a></td>
	   	  <td><a href="/delete-supplier?supplerId=<%=supplier.Id%>" class="btn btn-primary">Delete</a></td>	   	  
    </tr>
    <%}%>
   </tbody>
</table>
</div>

<button style= margin:5%40% ><a href="sup-report">Suppliers Report</a></button>

<script type="text/javascript">
var x = "${success}";
var y = "${error}";
if(x.length>0)
{
	document.getElementById("successAlert").style.display="block";
	document.getElementById("failedAlert").style.display="none";
}else if(y.length>0){
	document.getElementById("successAlert").style.display="none";
	document.getElementById("failedAlert").style.display="block";
}else{
	document.getElementById("successAlert").style.display="none";
	document.getElementById("failedAlert").style.display="none";
}
</script>
<jsp:include page="/WEB-INF/views/footer.jsp" />
