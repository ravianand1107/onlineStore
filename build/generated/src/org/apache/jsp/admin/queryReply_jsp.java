package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class queryReply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Query Reply</title>\n");
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
      out.write("                    <!-- Main Section -->\n");
      out.write("                    <div class=\"main-content\">\n");
      out.write("                        <div class=\"section__content section__content--p30\">\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-lg-6\">\n");
      out.write("                                        <div class=\"card\">\n");
      out.write("                                            <div class=\"card-header\">Credit Card</div>\n");
      out.write("                                            <div class=\"card-body\">\n");
      out.write("                                                <div class=\"card-title\">\n");
      out.write("                                                    <h3 class=\"text-center title-2\">Pay Invoice</h3>\n");
      out.write("                                                </div>\n");
      out.write("                                                <hr>\n");
      out.write("                                                <form action=\"\" method=\"post\" novalidate=\"novalidate\">\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"cc-payment\" class=\"control-label mb-1\">Payment amount</label>\n");
      out.write("                                                        <input id=\"cc-pament\" name=\"cc-payment\" type=\"text\" class=\"form-control\" aria-required=\"true\" aria-invalid=\"false\" value=\"100.00\">\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group has-success\">\n");
      out.write("                                                        <label for=\"cc-name\" class=\"control-label mb-1\">Name on card</label>\n");
      out.write("                                                        <input id=\"cc-name\" name=\"cc-name\" type=\"text\" class=\"form-control cc-name valid\" data-val=\"true\" data-val-required=\"Please enter the name on card\"\n");
      out.write("                                                               autocomplete=\"cc-name\" aria-required=\"true\" aria-invalid=\"false\" aria-describedby=\"cc-name-error\">\n");
      out.write("                                                        <span class=\"help-block field-validation-valid\" data-valmsg-for=\"cc-name\" data-valmsg-replace=\"true\"></span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"cc-number\" class=\"control-label mb-1\">Card number</label>\n");
      out.write("                                                        <input id=\"cc-number\" name=\"cc-number\" type=\"tel\" class=\"form-control cc-number identified visa\" value=\"\" data-val=\"true\"\n");
      out.write("                                                               data-val-required=\"Please enter the card number\" data-val-cc-number=\"Please enter a valid card number\"\n");
      out.write("                                                               autocomplete=\"cc-number\">\n");
      out.write("                                                        <span class=\"help-block\" data-valmsg-for=\"cc-number\" data-valmsg-replace=\"true\"></span>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-6\">\n");
      out.write("                                                            <div class=\"form-group\">\n");
      out.write("                                                                <label for=\"cc-exp\" class=\"control-label mb-1\">Expiration</label>\n");
      out.write("                                                                <input id=\"cc-exp\" name=\"cc-exp\" type=\"tel\" class=\"form-control cc-exp\" value=\"\" data-val=\"true\" data-val-required=\"Please enter the card expiration\"\n");
      out.write("                                                                       data-val-cc-exp=\"Please enter a valid month and year\" placeholder=\"MM / YY\"\n");
      out.write("                                                                       autocomplete=\"cc-exp\">\n");
      out.write("                                                                <span class=\"help-block\" data-valmsg-for=\"cc-exp\" data-valmsg-replace=\"true\"></span>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <div class=\"col-6\">\n");
      out.write("                                                            <label for=\"x_card_code\" class=\"control-label mb-1\">Security code</label>\n");
      out.write("                                                            <div class=\"input-group\">\n");
      out.write("                                                                <input id=\"x_card_code\" name=\"x_card_code\" type=\"tel\" class=\"form-control cc-cvc\" value=\"\" data-val=\"true\" data-val-required=\"Please enter the security code\"\n");
      out.write("                                                                       data-val-cc-cvc=\"Please enter a valid security code\" autocomplete=\"off\">\n");
      out.write("\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div>\n");
      out.write("                                                        <button id=\"payment-button\" type=\"submit\" class=\"btn btn-lg btn-info btn-block\">\n");
      out.write("                                                            <i class=\"fa fa-lock fa-lg\"></i>&nbsp;\n");
      out.write("                                                            <span id=\"payment-button-amount\">Pay $100.00</span>\n");
      out.write("                                                            <span id=\"payment-button-sending\" style=\"display:none;\">Sending?</span>\n");
      out.write("                                                        </button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </form>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- End Main Section -->\n");
      out.write("\n");
      out.write("                    <!-- Footer --!>\n");
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
