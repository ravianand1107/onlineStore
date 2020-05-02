<%@page import="com.beans.Product, com.daos.ProductDao, com.beans.Customer,java.sql.*, java.util.ArrayList, com.beans.Orders, com.beans.OrderItems, com.daos.OrderDao" %>

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
        <title>Customer's Orders</title>

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
                    ArrayList<Orders> orderList = new ArrayList();
                    ArrayList<OrderItems> orderItemsList = new ArrayList();
                    int custId = Integer.parseInt(request.getParameter("id"));

                    Orders orders = new Orders();
                    OrderDao od = new OrderDao();
                    orderList = od.getAllOrdersInDescByCustomerId(custId);
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
                                            <i class="zmdi zmdi-account-calendar"></i>Orders</h3>

                                        
                                            <table class="table">
                                                <%  for (Orders or : orderList) {
                                                        orderItemsList = od.getAllOrdersItemsesByOrderId(or.getId());
                                                %>
                                                <tbody>
                                                    <tr>
                                                        <td>
                                                            <div class="title-3">
                                                                <h3>Order Id: <%=or.getId()%></h3>
                                                                <h5>Date: <%=or.getDate()%></h5>

                                                                <table>
                                                                    <%  for (OrderItems ol : orderItemsList) {
                                                                            int pid = ol.getProduct_id();
                                                                            ProductDao pd = new ProductDao();
                                                                            Product p = pd.getById(pid);
                                                                            int quantity = ol.getQuantity();
                                                                    %>
                                                                    <tbody>
                                                                        <tr>
                                                                            <td>
                                                                                <div class="au-message__item-text">
                                                                                    <div class="avatar-wrap">
                                                                                        <div class="avatar">
                                                                                            <img src="../<%=p.getImage()%>" alt="">
                                                                                        </div>
                                                                                    </div>
                                                                                    <div class="text">
                                                                                        <h3 class="name"><%=p.getName()%></h3>
                                                                                        <h3 class="name">Size: <%=p.getSize()%> | Qty: <%=quantity%></h3>
                                                                                        <h3 class="name">Rs. <%=p.getPrice()%></h3>
                                                                                        <h3 class="name" style="color: red"><%=ol.getStatus()%> (<%=ol.getDate()%>)</h3>
                                                                                    </div>
                                                                                </div>
                                                                            </td>
                                                                        </tr>
                                                                    </tbody>
                                                                    <%}%>
                                                                </table>
                                                            </div>
                                                        </td>
                                                    </tr>

                                                </tbody>
                                                <%}%>
                                            </table>
                                        

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
