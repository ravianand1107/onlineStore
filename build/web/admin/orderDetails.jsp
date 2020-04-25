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
        <title>Order Details</title>

        <jsp:include page="base.jsp"></jsp:include>

            <script>
                function submitForm() {
                    document.getElementById("form1").submit();
                }

            </script>

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
                    Orders orders = new Orders();
                    OrderDao od = new OrderDao();
                    
                %>
                <!-- Main Section -->
                <div class="main-content">

                    <div class="row">
                        <div class="col-lg-12">
                            <!-- USER DATA-->
                            <div class="user-data m-b-30">
                                <h3 class="title-3 m-b-30">
                                    <i class="zmdi zmdi-shopping-basket"></i>Order Details</h3>
                                <div class="filters m-b-45">
                                    <div class="rs-select2--dark rs-select2--md m-r-10 rs-select2--border">
                                        <select onchange="submitForm();" name="filter" id="filter" class="js-select2">
                                            <option selected="selected">All Orders</option>
                                            <option value="pending">Pending Orders</option>
                                            <option value="confirmed">Confirmed Orders</option>
                                            <option value="delivered">Delivered Orders</option>
                                            <option value="cancelled">Cancelled Orders</option>
                                            <option value="returned">Returned Orders</option>
                                        </select>
                                        <div class="dropDownSelect2"></div>
                                    </div>
                                    <div class="rs-select2--dark rs-select2--sm rs-select2--border">
                                        <select class="js-select2 au-select-dark" name="time">
                                            <option selected="selected">All Time</option>
                                            <option value="">By Month</option>
                                            <option value="">By Day</option>
                                        </select>
                                        <div class="dropDownSelect2"></div>
                                    </div>
                                </div>
                                <div class="table-responsive table--no-card m-b-30">
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <td>
                                                    <label class="au-checkbox">
                                                        <input type="checkbox">
                                                        <span class="au-checkmark"></span>
                                                    </label>
                                                </td> 
                                                <td><b>Date</b></td>
                                                <td><b>Order Id</b></td>
                                                <td><b>Product</b></td>
                                                <td><b>Status</td>
                                                <td class="text-right"><b>Price</b></td>
                                                <td class="text-right"><b>Quantity</b></td>
                                                <td class="text-right"><b>Total</b></td>
                                                <td><b>Action</b></td>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <% String op = request.getParameter("filter");
                                                System.out.println("op:" + op);
                                                if (op == null || op.equals("") || op.equals("-1")) {
                                                    orderList = od.getAllOrders();
                                                } else if (op.equals("pending") || op.equals("delivered") || op.equals("confirmed")) {
                                                    System.out.println("====");
                                                    orderItemsList = od.getAllOrdersItemsByStatus(op);
                                                }
                                                for (Orders or : orderList) {
                                                    orderItemsList = od.getAllOrdersItemsesByOrderId(or.getId());
                                                    for (OrderItems ol : orderItemsList) {
                                                        int pid = ol.getProduct_id();
                                                        ProductDao pd = new ProductDao();
                                                        Product p = pd.getById(pid);
                                                        int quantity = ol.getQuantity();
                                            %>
                                            <tr>
                                                <td>
                                                    <label class="au-checkbox">
                                                        <input type="checkbox">
                                                        <span class="au-checkmark"></span>
                                                    </label>
                                                </td> 
                                                <td><%=ol.getDate()%></td>
                                                <td><%=or.getId()%></td>
                                                <td><%=p.getName()%></td>
                                                <td><%=ol.getStatus()%>
                                                <td class="text-right"><%=p.getPrice()%></td>
                                                <td class="text-right"><%=quantity%></td>
                                                <td class="text-right"><%=p.getPrice() * quantity%></td>
                                                <td>
                                                    <select class="js-select2" name="property">
                                                        <option selected="selected"><%=ol.getStatus()%></option>
                                                        <option value="">Post</option>
                                                        <option value="">Watch</option>
                                                    </select>
                                                    <div class="dropDownSelect2"></div>
                                                </td>
                                            </tr>
                                            <%}
                                                }%>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="user-data__footer">
                                    <button class="au-btn au-btn-load">load more</button>
                                </div>
                            </div>
                            <!-- END USER DATA-->
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
