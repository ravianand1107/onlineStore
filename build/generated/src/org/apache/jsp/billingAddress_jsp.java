package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Product;
import com.daos.ProductDao;
import java.sql.*;
import java.util.ArrayList;

public final class billingAddress_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Billing Address</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"description\" content=\" Divisima | eCommerce Template\">\r\n");
      out.write("        <meta name=\"keywords\" content=\"divisima, eCommerce, creative, html\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <!-- Page Preloder -->\r\n");
      out.write("            <div id=\"preloder\">\r\n");
      out.write("                <div class=\"loader\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Header section -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- Header section end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Page info -->\r\n");
      out.write("\t<div class=\"page-top-info\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h4>CAtegory PAge</h4>\r\n");
      out.write("\t\t\t<div class=\"site-pagination\">\r\n");
      out.write("\t\t\t\t<a href=\"home.jsp\">Home</a> /\r\n");
      out.write("\t\t\t\t<a href=\"#\">Your Cart</a> /\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Page info end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Checkout section -->\r\n");
      out.write("\t<section class=\"checkout-section spad\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-8 order-2 order-lg-1\">\r\n");
      out.write("\t\t\t\t\t<form class=\"checkout-form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cf-title\">Billing Address</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-7\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>*Billing Information</p>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cf-radio-btns address-rb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cfr-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"pm\" id=\"one\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"one\">Use my regular address</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cfr-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"pm\" id=\"two\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"two\">Use a different address</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row address-inputs\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Address\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"City\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"State\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Zip code\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Phone no.\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cf-title\">Delievery Info</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row shipping-btns\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Standard</h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cf-radio-btns\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cfr-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"shipping\" id=\"ship-1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"ship-1\">Free</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<h4>Next day delievery  </h4>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"cf-radio-btns\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"cfr-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"radio\" name=\"shipping\" id=\"ship-2\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"ship-2\">$3.45</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"cf-title\">Payment</div>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"payment-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>Paypal<a href=\"#\"><img src=\"img/paypal.png\" alt=\"\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Credit / Debit card<a href=\"#\"><img src=\"img/mastercart.png\" alt=\"\"></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Pay when you get the package</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<button class=\"site-btn submit-order-btn\">Place Order</button>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-4 order-1 order-lg-2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"checkout-cart\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Your Cart</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"product-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pl-thumb\"><img src=\"img/cart/1.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Animal Print Dress</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>$45.90</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"pl-thumb\"><img src=\"img/cart/2.jpg\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<h6>Animal Print Dress</h6>\r\n");
      out.write("\t\t\t\t\t\t\t\t<p>$45.90</p>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"price-list\">\r\n");
      out.write("\t\t\t\t\t\t\t<li>Total<span>$99.90</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li>Shipping<span>free</span></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"total\">Total<span>$99.90</span></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t<!-- checkout section end -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer section -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\r\n");
      out.write("        <!-- Footer section end -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--====== Javascripts & Jquery ======-->\r\n");
      out.write("        <script src=\"assets/js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.slicknav.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/owl.carousel.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.nicescroll.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.zoom.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery-ui.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
