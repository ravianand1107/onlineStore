package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Queries;
import com.daos.QueryDao;
import java.util.ArrayList;

public final class viewQueries_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Queries</title>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body class=\"animsition\">\n");
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
      out.write("                    <!-- Main Section -->\n");
      out.write("                    <div class=\"main-content\">\n");
      out.write("                        <div class=\"section__content section__content--p30\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <!-- DATA TABLE -->\n");
      out.write("                                        <h3 class=\"title-5 m-b-35\">data table</h3>\n");
      out.write("                                        <div class=\"table-data__tool\">\n");
      out.write("                                            <div class=\"table-data__tool-left\">\n");
      out.write("                                                <div class=\"rs-select2--light rs-select2--md\">\n");
      out.write("                                                    <select class=\"js-select2\" name=\"property\">\n");
      out.write("                                                        <option selected=\"selected\">All Properties</option>\n");
      out.write("                                                        <option value=\"\">Option 1</option>\n");
      out.write("                                                        <option value=\"\">Option 2</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                    <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"rs-select2--light rs-select2--sm\">\n");
      out.write("                                                    <select class=\"js-select2\" name=\"time\">\n");
      out.write("                                                        <option selected=\"selected\">Today</option>\n");
      out.write("                                                        <option value=\"\">3 Days</option>\n");
      out.write("                                                        <option value=\"\">1 Week</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                    <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <button class=\"au-btn-filter\">\n");
      out.write("                                                    <i class=\"zmdi zmdi-filter-list\"></i>filters</button>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"table-data__tool-right\">\n");
      out.write("                                                <button class=\"au-btn au-btn-icon au-btn--green au-btn--small\">\n");
      out.write("                                                    <i class=\"zmdi zmdi-plus\"></i>add item</button>\n");
      out.write("                                                <div class=\"rs-select2--dark rs-select2--sm rs-select2--dark2\">\n");
      out.write("                                                    <select class=\"js-select2\" name=\"type\">\n");
      out.write("                                                        <option selected=\"selected\">Export</option>\n");
      out.write("                                                        <option value=\"\">Option 1</option>\n");
      out.write("                                                        <option value=\"\">Option 2</option>\n");
      out.write("                                                    </select>\n");
      out.write("                                                    <div class=\"dropDownSelect2\"></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"table-responsive table-responsive-data2\">\n");
      out.write("                                            <table class=\"table table-data2\">\n");
      out.write("                                                <thead>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th>name</th>\n");
      out.write("                                                        <th>email</th>\n");
      out.write("                                                        <th>subject</th>\n");
      out.write("                                                        <th>message</th>\n");
      out.write("\n");
      out.write("                                                        <th></th>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                ");

                                                    QueryDao qd = new QueryDao();
                                                    ArrayList<Queries> rows = new ArrayList();

                                                    rows = qd.getAllQueries();

                                                        for (Queries query : rows) {
      out.write("\n");
      out.write("                                                <tr class=\"tr-shadow\">\n");
      out.write("\n");
      out.write("                                                    <td>");
      out.print(query.getName());
      out.write("</td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <span class=\"block-email\">");
      out.print(query.getEmail());
      out.write("</span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"desc\">");
      out.print(query.getSubject());
      out.write("</td>\n");
      out.write("                                                    \n");
      out.write("                                                    <td>\n");
      out.write("                                                        <span class=\"status--process\">");
      out.print(query.getMessage());
      out.write("</span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    \n");
      out.write("                                                    <td>\n");
      out.write("                                                        <div class=\"table-data-feature\">\n");
      out.write("                                                            <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Send\">\n");
      out.write("                                                                <i class=\"zmdi zmdi-mail-send\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Edit\">\n");
      out.write("                                                                <i class=\"zmdi zmdi-edit\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"Delete\">\n");
      out.write("                                                                <i class=\"zmdi zmdi-delete\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button class=\"item\" data-toggle=\"tooltip\" data-placement=\"top\" title=\"More\">\n");
      out.write("                                                                <i class=\"zmdi zmdi-more\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- END DATA TABLE -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
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
