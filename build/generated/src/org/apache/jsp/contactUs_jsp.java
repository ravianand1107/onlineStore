package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Product;
import com.daos.ProductDao;
import java.sql.*;
import java.util.ArrayList;

public final class contactUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Products</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"description\" content=\" Divisima | eCommerce Template\">\n");
      out.write("        <meta name=\"keywords\" content=\"divisima, eCommerce, creative, html\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page info -->\n");
      out.write("\t<div class=\"page-top-info\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h4>CAtegory PAge</h4>\n");
      out.write("\t\t\t<div class=\"site-pagination\">\n");
      out.write("\t\t\t\t<a href=\"home.jsp\">Home</a> /\n");
      out.write("                                <a href=\"contactUs.jsp\">Contact</a> /\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Page info end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Contact section -->\n");
      out.write("\t<section class=\"contact-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-6 contact-info\">\n");
      out.write("\t\t\t\t\t<h3>Get in touch</h3>\n");
      out.write("\t\t\t\t\t<p>Main Str, no 23, New York</p>\n");
      out.write("\t\t\t\t\t<p>+546 990221 123</p>\n");
      out.write("\t\t\t\t\t<p>hosting@contact.com</p>\n");
      out.write("\t\t\t\t\t<div class=\"contact-social\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-dribbble\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"fa fa-behance\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<form class=\"contact-form\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your name\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Your e-mail\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" placeholder=\"Subject\">\n");
      out.write("\t\t\t\t\t\t<textarea placeholder=\"Message\"></textarea>\n");
      out.write("\t\t\t\t\t\t<button class=\"site-btn\">SEND NOW</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"map\"><iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d14376.077865872314!2d-73.879277264103!3d40.757667781624285!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sen!2sbd!4v1546528920522\" style=\"border:0\" allowfullscreen></iframe></div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Contact section end -->\n");
      out.write("\t\n");
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
