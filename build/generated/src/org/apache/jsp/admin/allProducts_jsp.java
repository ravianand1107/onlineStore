package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Product;
import com.daos.ProductDao;
import java.sql.*;
import java.util.ArrayList;

public final class allProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("        <title>All Products</title>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body class=\"animsition\">\n");
      out.write("            ");
      com.beans.Product product = null;
      synchronized (session) {
        product = (com.beans.Product) _jspx_page_context.getAttribute("product", PageContext.SESSION_SCOPE);
        if (product == null){
          product = new com.beans.Product();
          _jspx_page_context.setAttribute("product", product, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      com.beans.WearType weartype = null;
      synchronized (session) {
        weartype = (com.beans.WearType) _jspx_page_context.getAttribute("weartype", PageContext.SESSION_SCOPE);
        if (weartype == null){
          weartype = new com.beans.WearType();
          _jspx_page_context.setAttribute("weartype", weartype, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
      com.beans.Category category = null;
      synchronized (session) {
        category = (com.beans.Category) _jspx_page_context.getAttribute("category", PageContext.SESSION_SCOPE);
        if (category == null){
          category = new com.beans.Category();
          _jspx_page_context.setAttribute("category", category, PageContext.SESSION_SCOPE);
        }
      }
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
      out.write("                    <!-- END HEADER DESKTOP--> \n");
      out.write("                    <!-- Main Section -->\n");
      out.write("                    <div class=\"main-content\">\n");
      out.write("                        <div class=\"section__content section__content--p30\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                ");

                                    ProductDao pd = new ProductDao();
                                    String wear_id = request.getParameter("wear_id");

                                    if (wear_id == null) {
                                        wear_id = "-1";
                                    }
                                    for (Product product1 : wear_id == null || wear_id.equals("") || wear_id.equals("-1") ? pd.getAllProduct() : pd.getAllProductByWearType(Integer.parseInt(wear_id))) {
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-4\">\n");
      out.write("                                    <div class=\"card\">\n");
      out.write("                                        <center><img class=\"card-img-top\" src=\"../");
      out.print(product1.getImage());
      out.write("\" alt=\"card image\" style=\"width: 50%\"></center>\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <h4 class=\"card-title mb-3\"><a href=\"#\">");
      out.print(product1.getId());
      out.write('.');
      out.write(' ');
      out.print(product1.getName());
      out.write("</a></h4><br/>\n");
      out.write("                                            <p class=\"card-text \">Price: ");
      out.print(product1.getPrice());
      out.write("<br/> \n");
      out.write("                                                Stock: ");
      out.print(product1.getStock());
      out.write("<br/>\n");
      out.write("                                                Brand: ");
      out.print(product1.getBrand());
      out.write("<br/>\n");
      out.write("                                                Size:  ");
      out.print(product1.getSize());
      out.write("<br/>\n");
      out.write("                                                \n");
      out.write("                                            \n");
      out.write("                                            </p>\n");
      out.write("                                            <button><a href=\"updateProduct.jsp?id=");
      out.print(product1.getId());
      out.write("\"><i class=\"fas fa-pencil btn btn-primary\" aria-hidden=\"true\">Update</i></a></button> \n");
      out.write("                                            <button><a href=\"../ProductController?id=");
      out.print(product1.getId());
      out.write("&op=delete\"> <i class=\"fas fa-trash btn btn-danger\" aria-hidden=\"true\">Delete</i> </a></button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- End Main Section -->\n");
      out.write("\n");
      out.write("            <!-- Footer --!>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("            <!-- End Footer -->\n");
      out.write("            <!-- END PAGE CONTAINER-->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    <script src=\"vendor/jquery-3.2.1.min.js\"></script>\n");
      out.write("    <!-- Bootstrap JS-->\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/popper.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap-4.1/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Vendor JS       -->\n");
      out.write("    <script src=\"vendor/slick/slick.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/wow/wow.min.js\"></script>\n");
      out.write("    <script src=\"vendor/animsition/animsition.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap-progressbar/bootstrap-progressbar.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/counter-up/jquery.waypoints.min.js\"></script>\n");
      out.write("    <script src=\"vendor/counter-up/jquery.counterup.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/circle-progress/circle-progress.min.js\"></script>\n");
      out.write("    <script src=\"vendor/perfect-scrollbar/perfect-scrollbar.js\"></script>\n");
      out.write("    <script src=\"vendor/chartjs/Chart.bundle.min.js\"></script>\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\">\n");
      out.write("    </script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.js\"></script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.min.js\"></script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.sampledata.js\"></script>\n");
      out.write("    <script src=\"vendor/vector-map/jquery.vmap.world.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
