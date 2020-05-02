<%@page contentType="text/html" pageEncoding="UTF-8" import=" com.beans.Queries, com.daos.QueryDao"%>
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
        <title>Query Reply</title>

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
                    <%
                        int id = Integer.parseInt(request.getParameter("id"));
                        QueryDao qd = new QueryDao();
                    %>
                    
                    <div class="main-content">
                        <div class="section__content section__content--p30">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-md-9">
                                        <div class="card">
                                            
                                            <div class="card-body">
                                                <div class="card-title">
                                                    <h3 class="text-center title-2">Reply to Query</h3>
                                                </div>
                                                <hr>
                                                <form action="../QueryController?id=<%=id%>&op=sendReply" method="post" novalidate="novalidate">
                                                    Subject:<br/>
                                                    <input type="text" name="subject" value="<%=qd.getById(id).getSubject()%>" readonly="readonly" class="form-control"/><br/>
                                                    Customer's Query:<br/>
                                                    <textarea readonly="readonly" cols="20" rows="5" class="form-control"><%=qd.getById(id).getMessage()%></textarea><br/>
                                                    Enter Reply:<br/>
                                                    <textarea name="msg" cols="20" rows="5" class="form-control"></textarea><br/>
                                                    <input type="submit" name="submit" value="Send" class="form-control btn btn-primary"/>
                                                </form>
                                            </div>
                                        </div>
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
