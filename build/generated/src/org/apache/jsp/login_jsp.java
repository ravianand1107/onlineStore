package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Customer;
import com.daos.CustomerDao;
import java.sql.*;
import java.util.ArrayList;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\" Divisima | eCommerce Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"divisima, eCommerce, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/vendor/css-hamburgers/hamburgers.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/vendor/animsition/css/animsition.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/vendor/daterangepicker/daterangepicker.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"assets/login/css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <!-- Page Preloder -->\n");
      out.write("            <div id=\"preloder\">\n");
      out.write("                <div class=\"loader\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Header section -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Header section end -->\n");
      out.write("<!-- Category section -->\n");
      out.write("    <div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-login100\">\n");
      out.write("\t\t\t<div class=\"wrap-login100\">\n");
      out.write("\t\t\t\t<div class=\"login100-form-title\" style=\"background-image: url(assets/login/images/bg-01.jpg);\">\n");
      out.write("\t\t\t\t\t<span class=\"login100-form-title-1\">\n");
      out.write("\t\t\t\t\t\tSign In\n");
      out.write("\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<form class=\"login100-form validate-form\">\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-26\" data-validate=\"Username is required\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label-input100\">Username</span>\n");
      out.write("\t\t\t\t\t\t<input class=\"input100\" type=\"text\" name=\"userid\" value=\"userid\" placeholder=\"Enter username\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"wrap-input100 validate-input m-b-18\" data-validate = \"Password is required\">\n");
      out.write("\t\t\t\t\t\t<span class=\"label-input100\">Password</span>\n");
      out.write("                                                <input class=\"input100\" type=\"password\" name=\"password\" value=\"password\" placeholder=\"Enter password\">\n");
      out.write("\t\t\t\t\t\t<span class=\"focus-input100\"></span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"flex-sb-m w-full p-b-30\">\n");
      out.write("\t\t\t\t\t\t<div class=\"contact100-form-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"input-checkbox100\" id=\"ckb1\" type=\"checkbox\" name=\"remember-me\">\n");
      out.write("\t\t\t\t\t\t\t<label class=\"label-checkbox100\" for=\"ckb1\">\n");
      out.write("\t\t\t\t\t\t\t\tRemember me\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"txt1\">\n");
      out.write("\t\t\t\t\t\t\t\tForgot Password?\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"container-login100-form-btn\">\n");
      out.write("                                            <button class=\"login100-form-btn\" type=\"submit\" name=\"submit\">\n");
      out.write("\t\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <p>\n");
      out.write("      <span style=\"color:red; font-family: corble; font-size: 16px\">\n");
      out.write("    ");
      out.print(request.getParameter("msg")!=null?request.getParameter("msg"):"");
      out.write("\n");
      out.write("</span>\n");
      out.write("  </p>\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Category section end -->\n");
      out.write("        ");

            if(request.getParameter("submit")!=null){
                String userid = request.getParameter("userid");
                String password = request.getParameter("password");
                
                CustomerDao cd = new CustomerDao();
                String role= cd.getRole(userid, password);
                System.out.println("role="+role);
                
                if(role.equals("admin")){
                    Customer customer = cd.getByLoginDetail(userid, password, role);
                    if(customer==null)
                        response.sendRedirect("login.jsp?msg=Invalid Userid or Password");
                    else{
                        session.setAttribute("customer", customer);
                        response.sendRedirect("admin/dashboard.jsp");
                    }
                }
                else if(role.equals("customer")){
                    int id= cd.isValid(userid, password, role);
                    
                    if(id!=-1){
                        Customer customer = cd.getById(id);
                        session.setAttribute("customer", customer);
                        response.sendRedirect("home.jsp");
                    }
                    else{
                        response.sendRedirect("login.jsp?msg=Invalid Userid or Password");
                    }
                }
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer section -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Footer section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--====== Javascripts & Jquery ======-->\n");
      out.write("        <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.nicescroll.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.zoom.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery-ui.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("\t<script src=\"assets/login/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"assets/login/vendor/animsition/js/animsition.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"assets/login/vendor/bootstrap/js/popper.js\"></script>\n");
      out.write("\t<script src=\"assets/login/vendor/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"assets/login/vendor/select2/select2.min.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"assets/login/vendor/daterangepicker/moment.min.js\"></script>\n");
      out.write("\t<script src=\"assets/login/vendor/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"assets/login/vendor/countdowntime/countdowntime.js\"></script>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<script src=\"assets/login/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
