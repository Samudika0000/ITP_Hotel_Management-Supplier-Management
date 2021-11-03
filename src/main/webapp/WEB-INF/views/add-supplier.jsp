<jsp:include page="/WEB-INF/views/header.jsp" />
<div class="row">
	<ol class="breadcrumb">
	    <li class="breadcrumb-item"><a href="/supplier-management">Supplier Dashboard</a></li>
  	</ol>
</div>
<div class="row">
<h3>Add New Supplier</h3>
</div>
<hr>
<div class="row">
<form action="/insert-supplier" method="POST" style="width:50%">
   <div class="alert alert-success" role="alert" id="successAlert">
	  ${success}
	</div>
	<div class="alert alert-danger" role="alert" id="failedAlert">
	  ${error}
	</div>
	<% com.suppliermanagement.model.Supplier sup = (com.suppliermanagement.model.Supplier)request.getAttribute("sup");%>
  <div class="form-group row">
    <label for="name" class="col-sm-2 col-form-label">Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="name" name="name" placeholder="" value="<%=sup.Name%>">
    </div>
  </div>
  <div class="form-group row">
    <label for="name" class="col-sm-2 col-form-label">Email</label>
    <div class="col-sm-10">
      <input type="email" class="form-control" id="email" name="email" placeholder="" value="<%=sup.Email%>">
    </div>
  </div>
  <div class="form-group row">
    <label for="contactnumber" class="col-sm-2 col-form-label">Contact Number</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="contactnumber" name="contactnumber" placeholder="" value="<%=sup.ContactNumber%>">
    </div>
  </div>
  <div class="form-group row">
    <label for="category" class="col-sm-2 col-form-label">Category</label>
    <div class="col-sm-10">
 	 <select name="category" id="category">
    	<option value="Food">Food</option>
    	<option value="Furniture">Furniture</option>
  	</select>
	<br><br>
    </div>
  </div>
  <div class="form-group row">
    <label for="companyname" class="col-sm-2 col-form-label">Company Name</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="companyname" name="companyname" placeholder="" value="<%=sup.CompanyName%>">
    </div>
  </div>
  <div class="form-group row">
    <label for="companyAddress" class="col-sm-2 col-form-label">Company Address</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="companyAddress" name="companyAddress" placeholder="" value="<%=sup.CompanyAddress%>">
    </div>
  </div>
  <div class="form-group row">
    <div class="" style="width:100%">
      <button type="submit" class="btn btn-success btn-block">Submit</button>
    </div>
  </div>
</form>
</div>
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
