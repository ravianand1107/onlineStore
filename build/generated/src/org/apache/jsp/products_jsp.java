package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Product;
import com.daos.ProductDao;
import java.sql.*;
import java.util.ArrayList;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <!-- Header section end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Page info -->\n");
      out.write("            <div class=\"page-top-info\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h4>CAtegory PAge</h4>\n");
      out.write("                    <div class=\"site-pagination\">\n");
      out.write("                        <a href=\"home.jsp\">Home</a> /\n");
      out.write("                        <a href=\"products.jsp\">Shop</a> /\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- Page info end -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Category section -->\n");
      out.write("            <section class=\"category-section spad\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            ");

                                ProductDao pd = new ProductDao();
                                String wear_id = request.getParameter("wear_id");

                                if (wear_id == null) {
                                    wear_id = "-1";
                                }
                                for (Product product : wear_id == null || wear_id.equals("") || wear_id.equals("-1") ? pd.getAllProduct() : pd.getAllProductByWearType(Integer.parseInt(wear_id))) {
                            
      out.write("\n");
      out.write("                            <div class=\"col-lg-4 col-sm-6\">\n");
      out.write("                                <div class=\"product-item\">\n");
      out.write("                                    <div class=\"pi-pic\">\n");
      out.write("                                        <div class=\"tag-sale\">ON SALE</div>\n");
      out.write("                                        <a href=\"productDetails.jsp?product_id=");
      out.print(product.getId());
      out.write("\"><img src=\"");
      out.print(product.getImage());
      out.write("\" alt=\"\"></a>\n");
      out.write("                                        <div class=\"pi-links\">\n");
      out.write("                                            <a href=\"#\" class=\"add-card\"><i class=\"flaticon-bag\"></i><span>ADD TO CART</span></a>\n");
      out.write("                                            <a href=\"#\" class=\"wishlist-btn\"><i class=\"flaticon-heart\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pi-text\">\n");
      out.write("                                        <h6>");
      out.print(product.getPrice());
      out.write("</h6>\n");
      out.write("                                        <p>");
      out.print(product.getName());
      out.write("</p>\n");
      out.write("                                        <p>Sizes: ");
      out.print(product.getSize());
      out.write("</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"text-center w-100 pt-3\">\n");
      out.write("                                <button class=\"site-btn sb-line sb-dark\">LOAD MORE</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- Category section end -->\n");
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
