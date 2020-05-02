<%-- 
    Document   : orders
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
<%@page import="com.beans.Product, com.daos.ProductDao, com.beans.Customer,java.sql.*, java.util.ArrayList, com.beans.Orders, com.beans.OrderItems, com.daos.OrderDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Order Details</title>
        <meta charset="UTF-8">
        <meta name="description" content=" Divisima | eCommerce Template">
        <meta name="keywords" content="divisima, eCommerce, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <jsp:include page="base.jsp"></jsp:include>
        </head>
        <body>
            <!-- Page Preloder -->
            <div id="preloder">
                <div class="loader"></div>
            </div>

            <!-- Header section -->
        <jsp:include page="header.jsp"></jsp:include>
            <!-- Header section end -->

            <section class="cart-section spad">

            <%
                ArrayList<Orders> orderList = new ArrayList();
                ArrayList<OrderItems> orderItemsList = new ArrayList();

                Customer customer = (Customer) session.getAttribute("customer");
                Orders orders = new Orders();
                OrderDao od = new OrderDao();
                orderList = od.getAllOrdersInDescByCustomerId(customer.getId());
                


            %>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="cart-table">
                            <h3>Your Orders</h3>
                            <div class="cart-table-warp">
                                <table>

                                    <%  for (Orders or : orderList) {
                                        orderItemsList = od.getAllOrdersItemsesByOrderId(or.getId());
                                    %>

                                    <tbody>
                                        <tr>
                                            <td>
                                                <div class="pc-title">
                                                    <h6>Order Id: <%=or.getId()%></h6>
                                                    <p>Date:  <%=or.getDate()%></p>

                                                    <table>
                                                        <%  for (OrderItems ol : orderItemsList) {
                                                                int pid = ol.getProduct_id();
                                                                ProductDao pd = new ProductDao();
                                                                Product p = pd.getById(pid);
                                                                int quantity = ol.getQuantity();
                                                        %>
                                                        <tbody>
                                                            <tr>
                                                                <td class="product-col">
                                                                    <img src="<%=p.getImage()%>" alt="">
                                                                    <div class="pc-title">
                                                                        <h4><%=p.getName()%></h4>
                                                                        <p>Size: <%=p.getSize()%> | Qty: <%=quantity%></p>
                                                                        <p>₹ <%=p.getPrice()%></p>
                                                                        <p><b style="color: red"><%=ol.getStatus()%></b> (<%=ol.getDate()%>)</p>
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


                        </div>
                    </div>

                </div>
            </div>
        </section>
        <!-- cart section end -->



        <!-- Footer section -->
        <jsp:include page="footer.jsp"></jsp:include>
        <!-- Footer section end -->



        <!--====== Javascripts & Jquery ======-->
        <script src="assets/js/jquery-3.2.1.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.slicknav.min.js"></script>
        <script src="assets/js/owl.carousel.min.js"></script>
        <script src="assets/js/jquery.nicescroll.min.js"></script>
        <script src="assets/js/jquery.zoom.min.js"></script>
        <script src="assets/js/jquery-ui.min.js"></script>
        <script src="assets/js/main.js"></script>

    </body>
</html>
