/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.12
 * Generated at: 2015-05-27 15:53:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import BankServices.modelo.Transaction;
import java.util.*;
import BankLogic.TransactionLogic;

public final class TransactionReports_jsp extends org.apache.jasper.runtime.HttpJspBase
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("\tStrongly Typed by HTML5 UP\r\n");
      out.write("\thtml5up.net | @n33co\r\n");
      out.write("\tFree for personal and commercial use under the CCA 3.0 license (html5up.net/license)\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Transaction Report</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n");
      out.write("<!--[if lte IE 8]><script src=\"assets/css/ie/html5shiv.js\"></script><![endif]-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("<!--[if lte IE 8]><link rel=\"stylesheet\" href=\"assets/css/ie/v8.css\" /><![endif]-->\r\n");
      out.write("<!--[if lte IE 8]><script src=\"assets/css/ie/respond.min.js\"></script><![endif]-->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"images/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body class=\"header\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Header -->\r\n");
      out.write("\t\t<header>\r\n");
      out.write("\t\t<div id=\"header-wrapper\">\r\n");
      out.write("\t\t\t<div id=\"header\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- Logo -->\r\n");
      out.write("\t\t\t\t<h1 id=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"TransactionReports.jsp\">Transaction Report</a>\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</header>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- Main -->\r\n");
      out.write("\t\t<div id=\"main-wrapper\">\r\n");
      out.write("\t\t\t<div id=\"main\" class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- Sidebar -->\r\n");
      out.write("\t\t\t\t\t<div id=\"sidebar\" class=\"4u 12u(mobile)\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- Excerpts -->\r\n");
      out.write("\t\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"divided\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Account Type: </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</h2> <!-- Excerpt -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"box excerpt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Checking</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<article class=\"box excerpt\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\">Savings</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</article>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<section>\r\n");
      out.write("\t\t\t\t\t<!doctype html>\r\n");
      out.write("\t\t\t\t\t<html lang=\"en\">\r\n");
      out.write("\t\t\t\t\t<head>\r\n");
      out.write("\t\t\t\t\t\t<meta charset=\"utf-8\">\r\n");
      out.write("\t\t\t\t\t\t  <title>jQuery UI Datepicker - Select a Date Range</title>\r\n");
      out.write("\t\t\t\t\t\t  <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css\">\r\n");
      out.write("\t\t\t\t\t\t  <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t  <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\r\n");
      out.write("\t\t\t\t\t\t  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("\t\t\t\t\t\t  <script>\r\n");
      out.write("\t\t\t\t\t\t  $(function() {\r\n");
      out.write("\t\t\t\t\t\t    $( \"#from\" ).datepicker({\r\n");
      out.write("\t\t\t\t\t\t      defaultDate: \"+1w\",\r\n");
      out.write("\t\t\t\t\t\t      changeMonth: true,\r\n");
      out.write("\t\t\t\t\t\t      numberOfMonths: 3,\r\n");
      out.write("\t\t\t\t\t\t      onClose: function( selectedDate ) {\r\n");
      out.write("\t\t\t\t\t\t        $( \"#to\" ).datepicker( \"option\", \"minDate\", selectedDate );\r\n");
      out.write("\t\t\t\t\t\t      }\r\n");
      out.write("\t\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t\t    $( \"#to\" ).datepicker({\r\n");
      out.write("\t\t\t\t\t\t      defaultDate: \"+1w\",\r\n");
      out.write("\t\t\t\t\t\t      changeMonth: true,\r\n");
      out.write("\t\t\t\t\t\t      numberOfMonths: 3,\r\n");
      out.write("\t\t\t\t\t\t      onClose: function( selectedDate ) {\r\n");
      out.write("\t\t\t\t\t\t        $( \"#from\" ).datepicker( \"option\", \"maxDate\", selectedDate );\r\n");
      out.write("\t\t\t\t\t\t      }\r\n");
      out.write("\t\t\t\t\t\t    });\r\n");
      out.write("\t\t\t\t\t\t  });\r\n");
      out.write("\t\t\t\t\t\t  </script>\r\n");
      out.write("\t\t\t\t\t\t</head>\r\n");
      out.write("\t\t\t\t\t\t<body>\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t<label for=\"from\">From</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"from\" name=\"from\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"to\">to</label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" id=\"to\" name=\"to\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</body>\r\n");
      out.write("\t\t\t\t\t\t</html>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</section>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div align=\"right\">\r\n");
      out.write("\t\t\t\t\t\tCurrent Balance: <span class=\"currencyinput\">$<input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"currency\" disabled></span>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>AccountNum</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>CurrentBal</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>Status</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t<th>Available</th>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t");


							
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Scripts -->\r\n");
      out.write("\t\t<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/jquery.dropotron.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/skel-viewport.min.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("\t\t<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}