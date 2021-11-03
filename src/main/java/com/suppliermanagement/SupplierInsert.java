package com.suppliermanagement;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.SupplierDBUtil;
import com.suppliermanagement.model.Supplier;

@WebServlet(urlPatterns = "/insert-supplier")
public class SupplierInsert extends HttpServlet{
	
	SupplierDBUtil supplier = new SupplierDBUtil();
	
	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		Supplier sup = new Supplier(0, "", "", "", "", "", "");
		arg0.setAttribute("sup", sup);
		arg0.getRequestDispatcher("/WEB-INF/views/add-supplier.jsp").forward(arg0, arg1);
	}
	
	@Override
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String Name = arg0.getParameter("name");
		String Email = arg0.getParameter("email");
		String ContactNumber = arg0.getParameter("contactnumber");
		String Category = arg0.getParameter("category");
		String CompanyName  = arg0.getParameter("companyname");
		String CompanyAddress = arg0.getParameter("companyAddress");
		
		String errors = SupplierValidator.validate(Name, Email, ContactNumber, Category, CompanyName, CompanyAddress);
		
		if(errors.length()>0) {
			Supplier sup = new Supplier(0, Name, Email, ContactNumber, Category, CompanyName, CompanyAddress);
			arg0.setAttribute("error", errors);
			arg0.setAttribute("success", "");
			arg0.setAttribute("sup", sup);
			arg0.getRequestDispatcher("/WEB-INF/views/add-supplier.jsp").forward(arg0, arg1);
		}else {
			if(supplier.insertSupplier(Name, Email, ContactNumber, Category, CompanyName, CompanyAddress)) {
				arg0.setAttribute("success", "Supplier was Added successfully");
				arg0.setAttribute("error", "");
			}else {
				arg0.setAttribute("error", "Supplier insert failed! Please try again!");
				arg0.setAttribute("success", "");
			}
			ArrayList<com.suppliermanagement.model.Supplier> suppliers = supplier.getSuppliers();
			arg0.setAttribute("suppliers", suppliers);
			arg0.getRequestDispatcher("/WEB-INF/views/supplier.jsp").forward(arg0, arg1);
		}
		
		
	}	
}
