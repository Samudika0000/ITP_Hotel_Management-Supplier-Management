package com.suppliermanagement;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.SupplierDBUtil;

@WebServlet(urlPatterns = "/delete-supplier")
public class SupplierDelete  extends HttpServlet{
	
	SupplierDBUtil supplier = new SupplierDBUtil();
	
	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		String supplierId = arg0.getParameter("supplerId");
		ArrayList<com.suppliermanagement.model.Supplier> suppliers;
		if(supplier.deleteSupplier(supplierId)) {
			arg0.setAttribute("success", "Supplier("+supplierId+") was deleted successfully!");
			arg0.setAttribute("error", "");
		}else {
			arg0.setAttribute("error", "Supplier("+supplierId+") deletion failed! Please try again!");
			arg0.setAttribute("success", "");
		}
		suppliers = supplier.getSuppliers();
		arg0.setAttribute("suppliers", suppliers);
		arg0.getRequestDispatcher("/WEB-INF/views/supplier.jsp").forward(arg0, arg1);
		//arg1.sendRedirect("/supplier");
	}
}
