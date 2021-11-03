package com.suppliermanagement;

import java.util.List;

import javax.servlet.RequestDispatcher;



public class SupplierValidator {
	public static String validate(String name, String email, String contactNo, String category, String companyName, String companyAddress) {
		String errors = "";
		if(name.length()==0) {
			errors += "Please enter a valid Name<br>";
		}
		if(!email.matches("^(.+)@(.+)$")) {
			errors += "Please enter a valid Email<br>";
		}
		if(!contactNo.matches("^[0-9]{10}$")) {
			errors += "Please enter a valid Contact No<br>";
		}
		if(category.length()==0) {
			errors += "Please enter a valid Category<br>";
		}
		if(companyName.length()==0) {
			errors += "Please enter a valid Company Name<br>";
		}
		if(companyAddress.length()==0) {
			errors += "Please enter a valid Company Address<br>";
			
	
		}
		return errors;
	
		
	
	    }
	
}




