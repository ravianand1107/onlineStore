package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Product;
import com.daos.ProductDao;
import com.beans.Customer;
import java.sql.*;
import java.util.ArrayList;
import com.beans.Orders;
import com.beans.OrderItems;
import com.daos.OrderDao;

public final class orderDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags-->\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"au theme template\">\n");
      out.write("        <meta name=\"author\" content=\"Hau Nguyen\">\n");
      out.write("        <meta name=\"keywords\" content=\"au theme template\">\n");
      out.write("\n");
      out.write("        <!-- Title Page-->\n");
      out.write("        <title>Order Details</title>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                function submitForm() {\n");
      out.write("                    document.getElementById(\"form1\").submit();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body class=\"animsition\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"page-wrapper\">\n");
      out.write("                <!-- MENU SIDEBAR-->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("                <!-- END MENU SIDEBAR-->\n");
      out.write("\n");
      out.write("                <!-- PAGE CONTAINER-->\n");
      out.write("                <div class=\"page-container2\">\n");
      out.write("                    <!-- HEADER DESKTOP-->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- END HEADER DESKTOP-->\n");
      out.write("                ");

                    ArrayList<Orders> orderList = new ArrayList();
                    ArrayList<OrderItems> orderItemsList = new ArrayList();
                    Orders orders = new Orders();
                    OrderDao od = new OrderDao();

                
      out.write("\n");
      out.write("                <!-- Main Section -->\n");
      out.write("                <div class=\"main-content\">\n");
      out.write("                    <form id=\"form1\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <!-- USER DATA-->\n");
      out.write("                                <div class=\"user-data m-b-30\">\n");
      out.write("                                    <h3 class=\"title-3 m-b-30\">\n");
      out.write("                                        <i class=\"zmdi zmdi-shopping-basket\"></i>Order Details</h3>\n");
      out.write("                                    <div class=\"filters m-b-45\">\n");
      out.write("                                        <div class=\"rs-select2--dark rs-select2--md m-r-10 rs-select2--border\">\n");
      out.write("                                            <select onchange=\"submitForm();\" name=\"filter\" id=\"filter\" class=\"js-select2\">\n");
      out.write("                                                <option value=\"-1\" selected=\"selected\">Select Status</option>\n");
      out.write("                                                <option value=\"\">All Orders</option>\n");
      out.write("                                                <option value=\"pending\">Pending Orders</option>\n");
      out.write("                                                <option value=\"confirmed\">Confirmed Orders</option>\n");
      out.write("                                                <option value=\"delivered\">Delivered Orders</option>\n");
      out.write("                                                <option value=\"cancelled\">Cancelled Orders</option>\n");
      out.write("                                                <option value=\"returned\">Returned Orders</option>\n");
      out.write("                                            </select>\n");
      out.write("                                            <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        ");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"table-responsive table--no-card m-b-30\">\n");
      out.write("                                        <table class=\"table\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label class=\"au-checkbox\">\n");
      out.write("                                                            <input type=\"checkbox\">\n");
      out.write("                                                            <span class=\"au-checkmark\"></span>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </td> \n");
      out.write("                                                    <td><b>Date</b></td>\n");
      out.write("                                                    <td><b>Order Id</b></td>\n");
      out.write("                                                    <td><b>Product</b></td>\n");
      out.write("                                                    <td><b>Status</td>\n");
      out.write("                                                    <td class=\"text-right\"><b>Price</b></td>\n");
      out.write("                                                    <td class=\"text-right\"><b>Quantity</b></td>\n");
      out.write("                                                    <td class=\"text-right\"><b>Total</b></td>\n");
      out.write("                                                    <td><b>Action</b></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 String op = request.getParameter("filter");
                                                    System.out.println("op:" + op);
                                                    if (op == null || op.equals("") || op.equals("-1")) {
                                                        orderList = od.getAllOrdersInDesc();

                                                        for (Orders or : orderList) {
                                                            orderItemsList = od.getAllOrdersItemsesByOrderId(or.getId());
                                                            for (OrderItems ol : orderItemsList) {
                                                                int pid = ol.getProduct_id();
                                                                ProductDao pd = new ProductDao();
                                                                Product p = pd.getById(pid);
                                                                int quantity = ol.getQuantity();
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label class=\"au-checkbox\">\n");
      out.write("                                                            <input type=\"checkbox\">\n");
      out.write("                                                            <span class=\"au-checkmark\"></span>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </td> \n");
      out.write("                                                    <td>");
      out.print(ol.getDate());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(or.getId());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getName());
      out.write("</td>\n");
      out.write("                                                    <td style=\"color: red\">");
      out.print(ol.getStatus());
      out.write("\n");
      out.write("                                                    <td class=\"text-right\">");
      out.print(p.getPrice());
      out.write("</td>\n");
      out.write("                                                    <td class=\"text-right\">");
      out.print(quantity);
      out.write("</td>\n");
      out.write("                                                    <td class=\"text-right\">");
      out.print(p.getPrice() * quantity);
      out.write("</td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <select onchange=\"submitForm();\" name=\"changeStatus\" id=\"changeStatus\" class=\"js-select2\">\n");
      out.write("                                                            <option value=\"-1\" selected=\"selected\">Change Status</option>\n");
      out.write("                                                            <option value=\"pending\">Pending</option>\n");
      out.write("                                                            <option value=\"confirmed\">Confirmed</option>\n");
      out.write("                                                            <option value=\"delivered\">Delivered</option>\n");
      out.write("                                                            <option value=\"cancelled\">Cancelled</option>\n");
      out.write("                                                            <option value=\"returned\">Returned</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                        <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
                                                    }
                                                } else if (op.equals("pending") || op.equals("delivered") || op.equals("confirmed")) {
                                                    System.out.println("====");
                                                    orderList = od.getAllOrdersInDesc();

                                                    for (Orders or : orderList) {
                                                        orderItemsList = od.getAllOrdersItemsesByOrderIdAndStatus(or.getId(), op);
                                                        for (OrderItems ol : orderItemsList) {
                                                            int pid = ol.getProduct_id();
                                                            ProductDao pd = new ProductDao();
                                                            Product p = pd.getById(pid);
                                                            int quantity = ol.getQuantity();
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <label class=\"au-checkbox\">\n");
      out.write("                                                            <input type=\"checkbox\">\n");
      out.write("                                                            <span class=\"au-checkmark\"></span>\n");
      out.write("                                                        </label>\n");
      out.write("                                                    </td> \n");
      out.write("                                                    <td>");
      out.print(ol.getDate());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(or.getId());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getName());
      out.write("</td>\n");
      out.write("                                                    <td style=\"color: red\">");
      out.print(ol.getStatus());
      out.write("\n");
      out.write("                                                    <td class=\"text-right\">");
      out.print(p.getPrice());
      out.write("</td>\n");
      out.write("                                                    <td class=\"text-right\">");
      out.print(quantity);
      out.write("</td>\n");
      out.write("                                                    <td class=\"text-right\">");
      out.print(p.getPrice() * quantity);
      out.write("</td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <select class=\"js-select2\" name=\"property\">\n");
      out.write("                                                            <option selected=\"selected\">");
      out.print(ol.getStatus());
      out.write("</option>\n");
      out.write("                                                            <option value=\"\">Post</option>\n");
      out.write("                                                            <option value=\"\">Watch</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                        <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
                                                        }
                                                    }
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"user-data__footer\">\n");
      out.write("                                        <button class=\"au-btn au-btn-load\">load more</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END USER DATA-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- End Main Section -->\n");
      out.write("\n");
      out.write("                <!-- Footer --!>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("                <!-- End Footer -->\n");
      out.write("                <!-- END PAGE CONTAINER-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Jquery JS-->\n");
      out.write("        <script src=\"vendor/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <!-- Bootstrap JS-->\n");
      out.write("        <script src=\"vendor/bootstrap-4.1/popper.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap-4.1/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Vendor JS       -->\n");
      out.write("        <script src=\"vendor/slick/slick.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"vendor/wow/wow.min.js\"></script>\n");
      out.write("        <script src=\"vendor/animsition/animsition.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"vendor/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("        <script src=\"vendor/counter-up/jquery.counterup.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"vendor/circle-progress/circle-progress.min.js\"></script>\n");
      out.write("        <script src=\"vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\n");
      out.write("        <script src=\"vendor/chartjs/Chart.bundle.min.js\"></script>\n");
      out.write("        <script src=\"vendor/select2/select2.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"vendor/vector-map/jquery.vmap.js\"></script>\n");
      out.write("        <script src=\"vendor/vector-map/jquery.vmap.min.js\"></script>\n");
      out.write("        <script src=\"vendor/vector-map/jquery.vmap.sampledata.js\"></script>\n");
      out.write("        <script src=\"vendor/vector-map/jquery.vmap.world.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Main JS-->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->\n");
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
