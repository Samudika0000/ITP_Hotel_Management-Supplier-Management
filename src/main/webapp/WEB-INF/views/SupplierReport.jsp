<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>${title}</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<meta name="viewport" content="width=device-width, height=device-height, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
	<link rel="icon" type="image/png" href="assets/1.png"/>
	<link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css">
	<!-- <link rel="stylesheet" type="text/css" href="fontawesome-free/css/all.min.css"> -->
	<link href="https://fonts.googleapis.com/css2?family=Roboto&display=swap" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	<!-- End import lib -->

	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<title>Supplier Details</title>
<script>
	src = "https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.9.3/html2pdf.bundle.min.js"

</script>

<div id="list">
<div class="row">
	<h3 style="width:50%;margin:0% 40%">Suppliers Details</h3>
	
	<p style="width:50%;margin:0% 2%">Date and Time:<%=new Date().toString()%></p>
</div>

<br>
<div>
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
	   	  	   	  
    </tr>
    <%}%>
   </tbody>
</table>
</div>
</div>
<button style= margin:5%43% onclick="print()" >Download Report</button>

<script>
function print(){

	var element = document.getElementById("list");
	var opt = {
	  margin:       1,
	  filename:     'Supplierlist.pdf',
	  image:        { type: 'jpeg', quality: 0.98 },
	  html2canvas:  { scale: 2 },
	  jsPDF:        { unit: 'in', format: 'letter', orientation: 'portrait' }
	};
	 
	// New Promise-based usage:
	html2pdf().from(element).set(opt).save();

</script>

<!--  <script type="text/javascript"> 
var x = "${success}";
var y = "${error}";
if(x.length>3)
{
	document.getElementById("successAlert").style.display="block";
	document.getElementById("failedAlert").style.display="none";
}else if(y.length>3){
	document.getElementById("successAlert").style.display="none";
	document.getElementById("failedAlert").style.display="block";
}else{
	document.getElementById("successAlert").style.display="none";
	document.getElementById("failedAlert").style.display="none";
}
</script>
<jsp:include page="/WEB-INF/views/footer.jsp" />-->
