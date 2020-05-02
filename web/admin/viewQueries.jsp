<%@page contentType="text/html" pageEncoding="UTF-8" import="com.beans.Queries, com.daos.QueryDao, java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="au theme template">
        <meta name="author" content="Hau Nguyen">
        <meta name="keywords" content="au theme template">

        <!-- Title Page-->
        <title>Queries</title>

        <jsp:include page="base.jsp"></jsp:include>

        </head>

        <body class="animsition">
            <div class="page-wrapper">
                <!-- MENU SIDEBAR-->
            <jsp:include page="sidebar.jsp"></jsp:include>
                <!-- END MENU SIDEBAR-->

                <!-- PAGE CONTAINER-->
                <div class="page-container2">
                    <!-- HEADER DESKTOP-->
                <jsp:include page="header.jsp"></jsp:include>

                    <!-- END HEADER DESKTOP-->

                    <!-- Main Section -->
                    <div class="main-content">
                        <div class="section__content section__content--p30">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-md-12">
                                        <!-- DATA TABLE -->
                                        <h3 class="title-5 m-b-35">data table</h3>
                                        <div class="table-data__tool">
                                            <div class="table-data__tool-left">
                                                <div class="rs-select2--light rs-select2--md">
                                                    <select class="js-select2" name="property">
                                                        <option selected="selected">All Properties</option>
                                                        <option value="">Option 1</option>
                                                        <option value="">Option 2</option>
                                                    </select>
                                                    <div class="dropDownSelect2"></div>
                                                </div>
                                                <div class="rs-select2--light rs-select2--sm">
                                                    <select class="js-select2" name="time">
                                                        <option selected="selected">Today</option>
                                                        <option value="">3 Days</option>
                                                        <option value="">1 Week</option>
                                                    </select>
                                                    <div class="dropDownSelect2"></div>
                                                </div>
                                                <button class="au-btn-filter">
                                                    <i class="zmdi zmdi-filter-list"></i>filters</button>
                                            </div>
                                            <div class="table-data__tool-right">
                                                <button class="au-btn au-btn-icon au-btn--green au-btn--small">
                                                    <i class="zmdi zmdi-plus"></i>add item</button>
                                                <div class="rs-select2--dark rs-select2--sm rs-select2--dark2">
                                                    <select class="js-select2" name="type">
                                                        <option selected="selected">Export</option>
                                                        <option value="">Option 1</option>
                                                        <option value="">Option 2</option>
                                                    </select>
                                                    <div class="dropDownSelect2"></div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="table-responsive table-responsive-data2">
                                            <table class="table table-data2">
                                                <thead>
                                                    <tr>
                                                        <th>name</th>
                                                        <th>email</th>
                                                        <th>subject</th>
                                                        <th>message</th>
                                                        <th>reply</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                <%
                                                    QueryDao qd = new QueryDao();
                                                    ArrayList<Queries> rows = new ArrayList();

                                                    rows = qd.getAllQueries();

                                                        for (Queries query : rows) {%>
                                                <tr class="tr-shadow">

                                                    <td><%=query.getName()%></td>
                                                    <td>
                                                        <span class="block-email"><%=query.getEmail()%></span>
                                                    </td>
                                                    <td class="desc"><%=query.getSubject()%></td>
                                                    
                                                    <td>
                                                        <% String msg = query.getMessage().trim();%>
                                                        <span class="status--process"><%=msg.length() > 50 ? msg.substring(0, 50) : msg%></span>
                                                    </td>
                                                    
                                                    <td>
                                                        <a href="queryReply.jsp?id=<%=query.getId()%>" class="btn btn-light"><i class="zmdi zmdi-mail-send"></i></a>
                                                    </td>
                                                </tr>
                                                <%}%>

                                            </tbody>
                                        </table>
                                    </div>
                                    <!-- END DATA TABLE -->
                                </div>
                            </div>
                        </div>
                    </div>
                </div>




                <!-- End Main Section -->

                <!-- Footer --!>
                <jsp:include page="footer.jsp"></jsp:include>
                <!-- End Footer -->
                <!-- END PAGE CONTAINER-->
            </div>

        </div>

        <!-- Jquery JS-->
        <script src="vendor/jquery-3.2.1.min.js"></script>
        <!-- Bootstrap JS-->
        <script src="vendor/bootstrap-4.1/popper.min.js"></script>
        <script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
        <!-- Vendor JS       -->
        <script src="vendor/slick/slick.min.js">
        </script>
        <script src="vendor/wow/wow.min.js"></script>
        <script src="vendor/animsition/animsition.min.js"></script>
        <script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
        </script>
        <script src="vendor/counter-up/jquery.waypoints.min.js"></script>
        <script src="vendor/counter-up/jquery.counterup.min.js">
        </script>
        <script src="vendor/circle-progress/circle-progress.min.js"></script>
        <script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
        <script src="vendor/chartjs/Chart.bundle.min.js"></script>
        <script src="vendor/select2/select2.min.js">
        </script>
        <script src="vendor/vector-map/jquery.vmap.js"></script>
        <script src="vendor/vector-map/jquery.vmap.min.js"></script>
        <script src="vendor/vector-map/jquery.vmap.sampledata.js"></script>
        <script src="vendor/vector-map/jquery.vmap.world.js"></script>

        <!-- Main JS-->
        <script src="js/main.js"></script>

    </body>

</html>
<!-- end document-->
