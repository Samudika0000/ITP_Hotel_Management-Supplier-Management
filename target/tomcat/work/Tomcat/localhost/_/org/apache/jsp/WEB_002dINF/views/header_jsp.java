/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-05-26 12:23:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("\t<title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, height=device-height, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0\">\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"assets/1.png\"/>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fontawesome-free/css/all.min.css\">\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css2?family=Roboto&display=swap\" rel=\"stylesheet\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("\t<!-- End import lib -->\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("<body class=\"overlay-scrollbar\" style=\"padding-top:30px;\">\n");
      out.write("\t<!-- navbar -->\n");
      out.write("\t<div class=\"navbar\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- nav left -->\n");
      out.write("\t\t<ul class=\"navbar-nav\">\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-bars\" onclick=\"collapseSidebar()\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item\">\n");
      out.write("\t\t\t\t<img src=\"assets/2.png\" alt=\"ATPro logo\" class=\"logo logo-light\">\n");
      out.write("\t\t\t\t<img src=\"assets/2.png\" alt=\"ATPro logo\" class=\"logo logo-dark\">\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<!-- end nav left -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- form -->\n");
      out.write("\t\t<form class=\"navbar-search\">\n");
      out.write("\t\t\t<input type=\"text\" name=\"Search\" class=\"navbar-search-input\" placeholder=\"search.....\">\n");
      out.write("\t\t\t<i class=\"fas fa-search\"></i>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!-- end form -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!-- nav right -->\n");
      out.write("\t\t<ul class=\"navbar-nav nav-right\">\n");
      out.write("\t\t\t<li class=\"nav-item mode\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\" href=\"#\" onclick=\"switchTheme()\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-moon dark-icon\"></i>\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-sun light-icon\"></i>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"nav-item dropdown\">\n");
      out.write("\t\t\t\t<a class=\"nav-link\">\n");
      out.write("\t\t\t\t\t<i class=\"fas fa-bell dropdown-toggle\" data-toggle=\"notification-menu\"></i>\n");
      out.write("\t\t\t\t\t<span class=\"navbar-badge\">15</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul id=\"notification-menu\" class=\"dropdown-menu notification-menu\">\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu-header\">\n");
      out.write("\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\tNotifications\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu-content overlay-scrollbar scrollbar-hover\">\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-gift\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetuer adipiscing elit.\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t15/07/2020\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-tasks\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetuer adipiscing elit.\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t15/07/2020\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"dropdown-menu-footer\">\n");
      out.write("\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\tView all notifications\n");
      out.write("\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li class=\"nav-item avt-wrapper\">\n");
      out.write("\t\t\t\t<div class=\"avt dropdown\">\n");
      out.write("\t\t\t\t\t<img src=\"assets/3.png\" alt=\"User image\" class=\"dropdown-toggle\" data-toggle=\"user-menu\">\n");
      out.write("\t\t\t\t\t<ul id=\"user-menu\" class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li  class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-user-tie\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Profile</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-cog\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Settings</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li  class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"far fa-credit-card\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Payments</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li  class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-spinner\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Projects</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li  class=\"dropdown-menu-item\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-menu-link\">\n");
      out.write("\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-sign-out-alt\"></i>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<span>Logout</span>\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<!-- end nav right -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end navbar -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- sidebar -->\n");
      out.write("\t<div class=\"sidebar\">\n");
      out.write("\t\t<ul class=\"sidebar-nav\">\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-cutlery\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tFood Menu Handling\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"roomReservation.jsp\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-bed\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tRoom Reservation\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"StaffManagemnt.jsp\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-users\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tHotel Staff Management\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-user-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tEmployee Management\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"salaryAndLeave.jsp\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-money\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tSalary & Leave Management\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"/supplier-management\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-user-o\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tSupplier Management\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tCustomers Management\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"login.jsp\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fas fa-tachometer-alt\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tInventry Management\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\t<li class=\"sidebar-nav-item\">\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"sidebar-nav-link\">\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\tEvent Management\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end sidebar -->\n");
      out.write("\t\n");
      out.write("\t<div class=\"wrapper\" style=\"padding-top:100px;padding-left:100px;\">");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
