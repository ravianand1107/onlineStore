package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Product;
import com.daos.ProductDao;
import java.sql.*;
import java.util.ArrayList;

public final class productDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <form action=\"cart.jsp\" method=\"post\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                            ");

                                ProductDao pd = new ProductDao();
                                String product_id = request.getParameter("product_id");
                                Product product = pd.getById(Integer.parseInt(product_id));
                            
      out.write("\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <input type=\"hidden\" name=\"pid\" value=\"");
      out.print(product.getId());
      out.write("\"/>\n");
      out.write("                                <div class=\"product-pic-zoom\">\n");
      out.write("                                    <img class=\"product-big-img\" src=\"");
      out.print(product.getImage());
      out.write("\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"product-thumbs\" tabindex=\"1\" style=\"overflow: hidden; outline: none;\">\n");
      out.write("                                    <div class=\"product-thumbs-track\">\n");
      out.write("                                        <div class=\"pt active\" data-imgbigurl=\"img/single-product/1.jpg\"><img src=\"img/single-product/thumb-1.jpg\" alt=\"\"></div>\n");
      out.write("                                        <div class=\"pt\" data-imgbigurl=\"img/single-product/2.jpg\"><img src=\"img/single-product/thumb-2.jpg\" alt=\"\"></div>\n");
      out.write("                                        <div class=\"pt\" data-imgbigurl=\"img/single-product/3.jpg\"><img src=\"img/single-product/thumb-3.jpg\" alt=\"\"></div>\n");
      out.write("                                        <div class=\"pt\" data-imgbigurl=\"img/single-product/4.jpg\"><img src=\"img/single-product/thumb-4.jpg\" alt=\"\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6 product-details\">\n");
      out.write("                                <h2 class=\"p-title\">");
      out.print(product.getName());
      out.write("</h2>\n");
      out.write("                                <h3 class=\"p-price\">₹ ");
      out.print(product.getPrice());
      out.write("</h3>\n");
      out.write("                                <h4 class=\"p-stock\">Available: <span>In Stock</span></h4>\n");
      out.write("                                <div class=\"p-rating\">\n");
      out.write("                                    <i class=\"fa fa-star-o\"></i>\n");
      out.write("                                    <i class=\"fa fa-star-o\"></i>\n");
      out.write("                                    <i class=\"fa fa-star-o\"></i>\n");
      out.write("                                    <i class=\"fa fa-star-o\"></i>\n");
      out.write("                                    <i class=\"fa fa-star-o fa-fade\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"p-review\">\n");
      out.write("                                    <a href=\"\">3 reviews</a>|<a href=\"\">Add your review</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"fw-size-choose\">\n");
      out.write("                                    <p>Size</p>\n");
      out.write("                                    <div class=\"sc-item\">\n");
      out.write("                                        <input type=\"radio\" name=\"sc\" id=\"xs-size\">\n");
      out.write("                                        <label for=\"xs-size\">");
      out.print(product.getSize());
      out.write("</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                <!--    <div class=\"sc-item disable\">\n");
      out.write("                                        <input type=\"radio\" name=\"sc\" id=\"xl-size\" disabled>\n");
      out.write("                                        <label for=\"xl-size\">40</label>\n");
      out.write("                                    </div>  -->\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"quantity\">\n");
      out.write("                                    <p>Quantity</p>\n");
      out.write("                                    <div class=\"pro-qty\"><input type=\"number\" name=\"qty\" id=\"qty\" min=\"1\" max=\"5\" value=\"1\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                        ");
      out.write("\n");
      out.write("                                    <input type=\"submit\" class=\"site-btn\" value=\"Shop Now\"/>\n");
      out.write("                                <div id=\"accordion\" class=\"accordion-area\">\n");
      out.write("                                    <div class=\"panel\">\n");
      out.write("                                        <div class=\"panel-header\" id=\"headingOne\">\n");
      out.write("                                            <button class=\"panel-link active\" data-toggle=\"collapse\" data-target=\"#collapse1\" aria-expanded=\"true\" aria-controls=\"collapse1\">information</button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div id=\"collapse1\" class=\"collapse show\" aria-labelledby=\"headingOne\" data-parent=\"#accordion\">\n");
      out.write("                                            <div class=\"panel-body\">\n");
      out.write("                                                <p>");
      out.print(product.getDescription());
      out.write("</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"panel\">\n");
      out.write("                                        <div class=\"panel-header\" id=\"headingTwo\">\n");
      out.write("                                            <button class=\"panel-link\" data-toggle=\"collapse\" data-target=\"#collapse2\" aria-expanded=\"false\" aria-controls=\"collapse2\">care details </button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div id=\"collapse2\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordion\">\n");
      out.write("                                            <div class=\"panel-body\">\n");
      out.write("                                                <img src=\"./img/cards.png\" alt=\"\">\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"panel\">\n");
      out.write("                                        <div class=\"panel-header\" id=\"headingThree\">\n");
      out.write("                                            <button class=\"panel-link\" data-toggle=\"collapse\" data-target=\"#collapse3\" aria-expanded=\"false\" aria-controls=\"collapse3\">shipping & Returns</button>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div id=\"collapse3\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordion\">\n");
      out.write("                                            <div class=\"panel-body\">\n");
      out.write("                                                <h4>7 Days Returns</h4>\n");
      out.write("                                                <p>Cash on Delivery Available<br>Home Delivery <span>3 - 4 days</span></p>\n");
      out.write("                                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"social-sharing\">\n");
      out.write("                                    <a href=\"\"><i class=\"fa fa-google-plus\"></i></a>\n");
      out.write("                                    <a href=\"\"><i class=\"fa fa-pinterest\"></i></a>\n");
      out.write("                                    <a href=\"\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                                    <a href=\"\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                                    <a href=\"\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                </form>\n");
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
