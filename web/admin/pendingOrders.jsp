<%@page import="com.beans.Product, com.daos.ProductDao, com.beans.Customer,java.sql.*, java.util.ArrayList, com.beans.Orders, com.beans.OrderItems, com.daos.OrderDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
        <title>Pending Orders</title>

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
                    
                    ArrayList<Orders> orderList = new ArrayList();
                    ArrayList<OrderItems> orderItemsList = new ArrayList();
                    Orders orders = new Orders();
                    OrderDao od = new OrderDao();
                    orderList = od.getAllOrders();


                %>
                <div class="main-content">

                    <div class="row">
                        
                        <div class="col-lg-12">
                            <center><h3>Pending Orders</h3></center>
                            <div class="table-responsive table--no-card m-b-30">
                                
                                <table class="table table-borderless table-striped table-earning">
                                    <thead>
                                        <tr>
                                            <th>date</th>
                                            <th>order ID</th>
                                            <th>name</th>
                                            <th>Status</th>
                                            <th class="text-right">price</th>
                                            <th class="text-right">quantity</th>
                                            <th class="text-right">total</th>
                                            <th class="text-right">action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%  for (Orders or : orderList) {
                                                String status = "pending";
                                                orderItemsList = od.getAllOrdersItemsesByOrderIdAndStatus(or.getId(),status);
                                                for (OrderItems ol : orderItemsList) {
                                                                int pid = ol.getProduct_id();
                                                                ProductDao pd = new ProductDao();
                                                                Product p = pd.getById(pid);
                                                                int quantity = ol.getQuantity();
                                                        %>
                                        
                                        <tr>
                                            <td><%=ol.getDate()%></td>
                                            <td><%=or.getId()%></td>
                                            <td><%=p.getName()%></td>
                                            <td><%=ol.getStatus()%>
                                            <td class="text-right"><%=p.getPrice()%></td>
                                            <td class="text-right"><%=quantity%></td>
                                            <td class="text-right"><%=p.getPrice()*quantity%></td>
                                            <td><button class="btn"><a href="../OrderController?id=<%=ol.getId()%>&op=changeStatus">Confirm</a></button></td>
                                        </tr>
                                        <%}}%>

                                    </tbody>
                                </table>
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
