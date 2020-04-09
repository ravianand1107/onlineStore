<%@page import="com.beans.WearType, com.daos.WeartypeDao, java.util.ArrayList"%>
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
        <title>All Weartypes</title>

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
                        <div class="form-control">
                            <div class="container-fluid">


                                <div class="col col-md-12">

                                    <form class="form">
                                        <table class="table">
                                            <tr>
                                                <th colspan="2"><center><h2>**All Waertypes** </h2></center></th>
                                            </tr>
                                        <%
                                            WeartypeDao wd = new WeartypeDao();
                                            ArrayList<WearType> weartypes = wd.getAllWeartype();
                                            for (WearType wear : weartypes) {
                                                System.out.println("wid:" + wear.getId());
                                        %>
                                        <tr>
                                            <th><%=wear.getName()%> </th>
                                            <td><button><a href="updateWeartype.jsp?id=<%=wear.getId()%>"><i class="fas fa-pencil btn btn-primary" aria-hidden="true">Update</i></a></button> 
                                                <button><a href="../WeartypeController?id=<%=wear.getId()%>&op=delete"> <i class="fas fa-trash btn btn-danger" aria-hidden="true">Delete</i> </a></button>
                                            </td>
                                        </tr> 
                                        <%}%>
                                        <tr>
                                            <th colspan="2"><center><a href="addWeartype.jsp" class="form-control btn btn-primary">Add New Weartype</a></center></th>
                                        </tr>
                                    </table>
                                </form>
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
