<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
<%@page import="com.beans.Product, com.daos.ProductDao, java.sql.*, java.util.ArrayList, com.beans.Cart, com.beans.Customer, com.daos.CustomerDao, com.beans.Address, com.daos.AddressDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <title>Billing Address</title>
        <meta charset="UTF-8">
        <meta name="description" content=" Divisima | eCommerce Template">
        <meta name="keywords" content="divisima, eCommerce, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <jsp:include page="base.jsp"></jsp:include>
        </head>
        <body>

        <%ArrayList<Cart> cart = (ArrayList<Cart>) session.getAttribute("cart");
            for (Cart cc : cart) {
                System.out.println("Cart:" + cc.getProduct());
            }
        %>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Header section -->
        <jsp:include page="header.jsp"></jsp:include>
            <!-- Header section end -->



        <jsp:useBean class="com.beans.Address" id="address" scope="session"></jsp:useBean>
        <%
            Customer customer = (Customer) session.getAttribute("customer");
            AddressDao ad = new AddressDao();
        %>
        <!-- Checkout section -->
        <section class="checkout-section spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 order-2 order-lg-1">
                        <div class="site-btn ">Select Delivery Address 
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <button type="button" class="btn-sm" data-toggle="modal" data-target="#ModalLoginForm">
                                + ADD ADDRESS
                            </button></div><br/>
                        <div class="row">
                            <%for (Address add : ad.getAllAddressesByCustomerId(customer.getId())) {%>

                            <div class="col-lg-4 col-sm-6">
                                <div class="card">
                                    <div class="card-body">

                                        <p><b><%=add.getName()%></b> <button type="button"><a href="AddressController?id=<%=add.getId()%>&op=delete">
                                                Delete
                                                </a></button><br/>
                                            <%=add.getAddress()%><br/>
                                            <%=add.getCity()%><br/>
                                            <%=add.getState()%>, <%=add.getPincode()%><br/>
                                            <b>Mobile: </b><%=add.getMobile()%></p>
                                    </div>
                                    <div class="card-footer">
                                        <button class="site-btn">Deliver Here</button>
                                        
                                    </div>
                                </div>
                            </div>
                            <%}%>
                        </div>

                    </div>
                    <div class="col-lg-4 order-1 order-lg-2">
                        <div class="checkout-cart">
                            <h3>Your Cart</h3>
                            <ul class="product-list">
                                <%
                                    int sum = 0;
                                    for (Cart cc : cart) {
                                        Product p = cc.getProduct();
                                %>
                                <li>
                                    <div class="pl-thumb"><img src="<%=p.getImage()%>" alt="" width="50px" height="100px"></div>
                                    <h6><%=p.getName()%></h6>
                                    <p>₹ <%=p.getPrice()%></p>
                                    <p>Qty: <%=cc.getQuantity()%></p>
                                    <%sum = sum + (p.getPrice() * cc.getQuantity());%>
                                </li>
                                <%}%>
                            </ul>
                            <ul class="price-list">
                                <li>Total<span>₹ <%=sum%></span></li>
                                <li>Shipping<span>free</span></li>
                                <li class="total">Total<span>₹ <%=sum%></span></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- checkout section end -->
        <!-- Modal HTML Markup -->
        <div id="ModalLoginForm" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title text-xs-center">Add New Address</h4>
                    </div>
                    <div class="modal-body">
                        <form role="form" method="POST" >
                            
                            <div class="form-group">
                                <label class="control-label">Receiver's Name</label>
                                <div>
                                    <input type="text" class="form-control input-lg" name="name" value="${address.name}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Phone No</label>
                                <div>
                                    <input type="text" class="form-control input-lg" name="mobile" value="${address.mobile}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Address</label>
                                <div>
                                    <input type="text" class="form-control input-lg" name="address" value="${address.address}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label">City</label>
                                <div>
                                    <input type="text" class="form-control input-lg" name="city" value="${address.city}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label">State</label>
                                <div>
                                    
                                    <input type="text" class="form-control input-lg" name="state" value="${address.state}">
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="control-label">Pincode</label>
                                <div>
                                    <input type="text" class="form-control input-lg" name="pincode" value="${address.pincode}">
                                </div>
                            </div>
                            <div class="form-group">
                                <div>
                                    <button type="submit" class="btn btn-info btn-block" name="submit">Click Here To Continue</button>
                                </div>
                            </div>
                        </form>
                                
                    </div>
                    <div class="modal-footer text-xs-center">
                        <%
                                    if (request.getParameter("submit") != null) {
                                %>
                                <jsp:setProperty name="address" property="*"></jsp:setProperty>

                                    <form action="AddressController?op=add" method="post" role="form">
                                        <div class="form-group">
                                <div>
                                    <button type="submit" class="btn btn-info btn-block">Save</button>
                                </div>
                            </div>
                                    </form>

                                <% }
                                %>
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal-dialog -->
        </div><!-- /.modal -->
        




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
