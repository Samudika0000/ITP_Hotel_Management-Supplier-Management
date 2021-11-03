package com.suppliermanagement;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.SupplierDBUtil;

@WebServlet(urlPatterns = "/sup-report")
public class SupplierReportServelet extends HttpServlet{
	
	SupplierDBUtil supplier = new SupplierDBUtil();
	
	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<com.suppliermanagement.model.Supplier> suppliers = supplier.getSuppliers();
		arg0.setAttribute("suppliers", suppliers);
		arg0.getRequestDispatcher("/WEB-INF/views/SupplierReport.jsp").forward(arg0, arg1);
	}
}
