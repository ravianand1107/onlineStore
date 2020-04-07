package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Product;
import com.beans.Category;
import com.beans.WearType;
import com.daos.ProductDao;
import com.daos.CategoryDao;
import com.daos.WeartypeDao;
import java.util.ArrayList;

public final class editProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Edit Product's Details</title>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body class=\"animsition\">\n");
      out.write("        ");
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
      out.write("                    <!-- END HEADER DESKTOP-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Main Section -->\n");
      out.write("                    <div class=\"main-content\">\n");
      out.write("                        <div class=\"form-control\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"col col-md-12\">\n");
      out.write("\n");
      out.write("                                    <form class=\"form\">\n");
      out.write("                                        <table class=\"table\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th colspan=\"2\"><center><h2>Add Product here </h2></center></th>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Enter Product Name </th>\n");
      out.write("                                                <td><input type=\"text\" name=\"name\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                        </tr> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Enter Product Price </th>\n");
      out.write("                                            <td><input type=\"text\" name=\"price\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                        </tr> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Enter Product Size </th>\n");
      out.write("                                            <td><input type=\"text\" name=\"size\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                        </tr> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Enter Product Color </th>\n");
      out.write("                                            <td><input type=\"text\" name=\"color\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Enter Product Brand </th>\n");
      out.write("                                            <td><input type=\"text\" name=\"brand\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                        </tr> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Enter Product Stock </th>\n");
      out.write("                                            <td><input type=\"text\" name=\"stock\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.stock}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                        </tr> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Enter Product Description </th>\n");
      out.write("                                            <td><input type=\"text\" name=\"description\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/></td>\n");
      out.write("                                        </tr> \n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Select Wear Type </th>\n");
      out.write("                                            <td>\n");
      out.write("                                                ");

                                                    WeartypeDao wd = new WeartypeDao();
                                                    ArrayList<WearType> weartypes = wd.getAllWeartype();
                                                    for (WearType wear : weartypes) {
                                                        System.out.println("wid:" + wear.getId());
                                                
      out.write(" \n");
      out.write("                                                <input type=\"radio\" name=\"wear\" value=\"");
      out.print(wear.getId());
      out.write("\" /> ");
      out.print(wear.getName());
      out.write("<br/> \n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Select Category </th>\n");
      out.write("                                            <td>\n");
      out.write("                                                ");

                                                    CategoryDao cd = new CategoryDao();
                                                    ArrayList<Category> categories = cd.getAllCategory();
                                                    for (Category cat : categories) {
      out.write(" \n");
      out.write("                                                <input type=\"radio\" name=\"cate\" value=\"");
      out.print(cat.getId());
      out.write("\" /> ");
      out.print(cat.getName());
      out.write("<br/> \n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th colspan=\"2\"><center><button name=\"submit\" type=\"submit\" class=\"btn btn-primary\">Save and Next </button></center></th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                ");

                                    if (request.getParameter("submit") != null) {
                                        weartype.setId(Integer.parseInt(request.getParameter("wear")));
                                        category.setId(Integer.parseInt(request.getParameter("cate")));
                                
      out.write("\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("product"), request);
      out.write("\n");
      out.write("\n");
      out.write("                                    <form action=\"../ProductController?op=add\" method=\"post\" enctype=\"multipart/form-data\" class=\"form\">\n");
      out.write("                                        <table class=\"table\">\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th>Select Product Image</th>\n");
      out.write("                                                <td><input type=\"file\" name=\"image\" class=\"form-control btn btn-primary\"/></td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th colspan=\"2\" ><center><button type=\"submit\" class=\"btn btn-primary\">Click here to insert image</button></center></th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                ");
 }
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- End Main Section -->\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
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
