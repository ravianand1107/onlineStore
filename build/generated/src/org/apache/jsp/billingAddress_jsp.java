package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.CartDao;
import com.beans.Product;
import com.daos.ProductDao;
import java.sql.*;
import java.util.ArrayList;
import com.beans.Cart;
import com.beans.Customer;
import com.daos.CustomerDao;
import com.beans.Address;
import com.daos.AddressDao;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      com.beans.Address address = null;
      synchronized (session) {
        address = (com.beans.Address) _jspx_page_context.getAttribute("address", PageContext.SESSION_SCOPE);
        if (address == null){
          address = new com.beans.Address();
          _jspx_page_context.setAttribute("address", address, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");

            Customer customer = (Customer) session.getAttribute("customer");
            AddressDao ad = new AddressDao();

            ArrayList<Cart> cartList = new ArrayList();
            CartDao cd = new CartDao();
            cartList = cd.getAllCartRecordsByCustomerId(customer.getId());
        
      out.write("\r\n");
      out.write("        <!-- Page Preloder -->\r\n");
      out.write("        <div id=\"preloder\">\r\n");
      out.write("            <div class=\"loader\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Header section -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            <!-- Header section end -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Checkout section -->\r\n");
      out.write("            <section class=\"checkout-section spad\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 order-2 order-lg-1\">\r\n");
      out.write("                            <div class=\"site-btn \">Select Delivery Address \r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("                                <button type=\"button\" class=\"btn-sm\" data-toggle=\"modal\" data-target=\"#ModalLoginForm\">\r\n");
      out.write("                                    + ADD ADDRESS\r\n");
      out.write("                                </button></div><br/>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                            ");
for (Address add : ad.getAllAddressesByCustomerId(customer.getId())) {
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("                                <div class=\"card\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                                        <p><b>");
      out.print(add.getName());
      out.write("</b> <button type=\"button\"><a href=\"AddressController?id=");
      out.print(add.getId());
      out.write("&op=delete\">\r\n");
      out.write("                                                    Delete\r\n");
      out.write("                                                </a></button><br/>\r\n");
      out.write("                                            ");
      out.print(add.getAddress());
      out.write("<br/>\r\n");
      out.write("                                            ");
      out.print(add.getCity());
      out.write("<br/>\r\n");
      out.write("                                            ");
      out.print(add.getState());
      out.write(',');
      out.write(' ');
      out.print(add.getPincode());
      out.write("<br/>\r\n");
      out.write("                                            <b>Mobile: </b>");
      out.print(add.getMobile());
      out.write("</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-footer\">\r\n");
      out.write("                                        <button class=\"site-btn\"><a href=\"payment.jsp\">Deliver Here</a></button>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-4 order-1 order-lg-2\">\r\n");
      out.write("                        <div class=\"checkout-cart\">\r\n");
      out.write("                            <h3>Your Cart</h3>\r\n");
      out.write("                            <ul class=\"product-list\">\r\n");
      out.write("                                ");

                                    int sum = 0;
                                    for (Cart c : cartList) {
                                        int pid = c.getProduct_id();
                                        ProductDao pd = new ProductDao();
                                        Product p = pd.getById(pid);
                                        int quantity = c.getQty();
                                
      out.write("\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <div class=\"pl-thumb\"><img src=\"");
      out.print(p.getImage());
      out.write("\" alt=\"\" width=\"50px\" height=\"100px\"></div>\r\n");
      out.write("                                    <h6>");
      out.print(p.getName());
      out.write("</h6>\r\n");
      out.write("                                    <p>₹ ");
      out.print(p.getPrice());
      out.write("</p>\r\n");
      out.write("                                    <p>Qty: ");
      out.print(c.getQty());
      out.write("</p>\r\n");
      out.write("                                    ");
sum = sum + (p.getPrice() * c.getQty());
      out.write("\r\n");
      out.write("                                </li>\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                            <ul class=\"price-list\">\r\n");
      out.write("                                <li>Total<span>₹ ");
      out.print(sum);
      out.write("</span></li>\r\n");
      out.write("                                <li>Shipping<span>free</span></li>\r\n");
      out.write("                                <li class=\"total\">Total<span>₹ ");
      out.print(sum);
      out.write("</span></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- checkout section end -->\r\n");
      out.write("        <!-- Modal HTML Markup -->\r\n");
      out.write("        <div id=\"ModalLoginForm\" class=\"modal fade\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <h4 class=\"modal-title text-xs-center\">Add New Address</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form role=\"form\" method=\"POST\" >\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"control-label\">Receiver's Name</label>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"control-label\">Phone No</label>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"mobile\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.mobile}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"control-label\">Address</label>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"control-label\">City</label>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"city\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"control-label\">State</label>\r\n");
      out.write("                                <div>\r\n");
      out.write("\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"state\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label class=\"control-label\">Pincode</label>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control input-lg\" name=\"pincode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address.pincode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-info btn-block\" name=\"submit\">Click Here To Continue</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer text-xs-center\">\r\n");
      out.write("                        ");

                            if (request.getParameter("submit") != null) {
                        
      out.write("\r\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("address"), request);
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <form action=\"AddressController?op=add\" method=\"post\" role=\"form\">\r\n");
      out.write("                                <div class=\"form-group\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-info btn-block\">Save</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                        ");
 }
                        
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div><!-- /.modal-content -->\r\n");
      out.write("            </div><!-- /.modal-dialog -->\r\n");
      out.write("        </div><!-- /.modal -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
