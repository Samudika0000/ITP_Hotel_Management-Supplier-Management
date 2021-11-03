package com.suppliermanagement;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/supplier-management")
public class SupplierManagement extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg0.setAttribute("title", "Hotel Richmond");
		arg0.getRequestDispatcher("/WEB-INF/views/supplier-management.jsp").forward(arg0, arg1);
	}
}
