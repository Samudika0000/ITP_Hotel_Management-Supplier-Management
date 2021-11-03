package com.suppliermanagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.SupplierDBUtil;

@WebServlet(urlPatterns = "/supplier")
public class Supplier extends HttpServlet {

	SupplierDBUtil supplier = new SupplierDBUtil();

	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		ArrayList<com.suppliermanagement.model.Supplier> suppliers = supplier.getSuppliers();
		Map<String, String[]> test = arg0.getParameterMap();
		if (arg0.getParameterMap().containsKey("supplierId")) {
			if (!arg0.getParameter("supplierId").isEmpty()) {
				suppliers = supplier.getSupplier(arg0.getParameter("supplierId"));
			}
			arg0.setAttribute("suppliers", suppliers);
			if (arg0.getParameterMap().containsKey("edit")) {
				arg0.getRequestDispatcher("/WEB-INF/views/edit-supplier.jsp").forward(arg0, arg1);
			} else {
				arg0.getRequestDispatcher("/WEB-INF/views/supplier.jsp").forward(arg0, arg1);
			}
		} else {
			arg0.setAttribute("suppliers", suppliers);
			arg0.getRequestDispatcher("/WEB-INF/views/supplier.jsp").forward(arg0, arg1);
		}
	}
}
