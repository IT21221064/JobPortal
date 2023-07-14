/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.13
 * Generated at: 2023-07-14 17:22:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("<div class=\"col\"></div>\r\n");
      out.write("<div class=\"col\"><div class=\"row\">\r\n");
      out.write("</div></div></div>\r\n");
      out.write("<br><br>\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-3\"></div>\r\n");
      out.write("      <div class=\"col-md-6\">\r\n");
      out.write("        <div class=\"card\">\r\n");
      out.write("          <div class=\"card-body\">\r\n");
      out.write("            <h1 style=\"text-align: center\">Profile</h1>\r\n");
      out.write("            <br />\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-4\"></div>\r\n");
      out.write("              <div class=\"col-md-4\">\r\n");
      out.write("                <img\r\n");
      out.write("                  style=\"width: 300px; height: 300px\"\r\n");
      out.write("                src=\"images/profilepic.png\"  alt=\"circle user avatar Icon 4035892\"\r\n");
      out.write("                  class=\"styles__Image-sc-2erpfv-1 eOQgUF\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-4\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("                <br>\r\n");
      out.write("            <form method=\"post\" action=\"ProfileServlet\">\r\n");
      out.write("             <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-6 form-group\">\r\n");
      out.write("              <input value=\"id\" type=\"hidden\" name=\"user_id\"/>\r\n");
      out.write("                <label>First Name</label\r\n");
      out.write("                ><input name=\"fname\" value=\"fn \" class=\"form-control\" placeholder=\"First Name\" />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6\">\r\n");
      out.write("                <label>Last Name</label\r\n");
      out.write("                ><input name=\"lname\"  value=\"ln\" class=\"form-control\" placeholder=\"Last Name\" />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6\">\r\n");
      out.write("                <label>Address : </label\r\n");
      out.write("                ><input name=\"address\"  value=\"ln\" class=\"form-control\" placeholder=\"Address\" />\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-6 form-group\">\r\n");
      out.write("                <label>Telephone</label\r\n");
      out.write("                ><input\r\n");
      out.write("                 value=\"tp\"\r\n");
      out.write("                 name=\"tp\"\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  type=\"number\"\r\n");
      out.write("                  placeholder=\"Telephone\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6\">\r\n");
      out.write("                <label>Email</label\r\n");
      out.write("                ><input name=\"email\" value=\"em \" class=\"form-control\" placeholder=\"Email\" />\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-6 form-group\">\r\n");
      out.write("                <label>NIC</label\r\n");
      out.write("                ><input\r\n");
      out.write("                value=\"nic \"\r\n");
      out.write("                name=\"nic\"\r\n");
      out.write("                  class=\"form-control\"\r\n");
      out.write("                  placeholder=\"National Identity Card\"\r\n");
      out.write("                />\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6\">\r\n");
      out.write("                <label>DOB</label\r\n");
      out.write("                ><input name=\"dob\" class=\"form-control\" type=\"date\" placeholder=\"Date\" value=\"dob\" />\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("           \r\n");
      out.write("      \r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-4\"></div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary col-md-12\" value=\"Edit  Account\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("       \r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-3\"></div>\r\n");
      out.write("      <br><br>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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
