<%@page import=" com.beans.Customer, java.sql.*, java.util.ArrayList, com.daos.AddressDao, com.beans.Address" %>

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
        <title>Customer's Address</title>

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
                <%
                    ArrayList<Address> addressList = new ArrayList();
                    int custId = Integer.parseInt(request.getParameter("id"));

                    AddressDao ad = new AddressDao();
                    addressList = ad.getAllAddressesByCustomerId(custId);
                %>

                <!-- Main Section -->
                <div class="main-content">
                    <div class="section__content ">
                        <div class="container-fluid">

                            <div class="row">
                                <div class="col-lg-12">
                                    <!-- USER DATA-->
                                    <div class="user-data m-b-30">
                                        <h3 class="title-3 m-b-30">
                                            <i class="zmdi zmdi-account-calendar"></i>Customer's Addresses</h3>

                                        <div class="table-responsive table-data">
                                            <div class="row">
                            <%for (Address add : addressList) {%>

                            <div class="col-lg-4 col-sm-6">
                                <div class="card">
                                    <div class="card-body">

                                        <p><b><%=add.getName()%></b> <br/>
                                            <%=add.getAddress()%><br/>
                                            <%=add.getCity()%><br/>
                                            <%=add.getState()%>, <%=add.getPincode()%><br/>
                                            <b>Mobile: </b><%=add.getMobile()%></p>
                                            
                                    </div>
                                    
                                </div>
                            </div>
                                        <%}%>
                                        </div>

                                    </div>
                                    <!-- END USER DATA-->
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
