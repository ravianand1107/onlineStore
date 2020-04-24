<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
<%@page import="com.daos.CartDao"%>
<%@page import="com.beans.Product, com.daos.ProductDao, java.sql.*, java.util.ArrayList, com.beans.Cart, javax.servlet.http.HttpSession, com.beans.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cart</title>
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


            <!-- Cart section -->
            <section class="cart-section spad">
            
            <%
                ArrayList<Cart> cartList = new ArrayList();

                Customer customer = (Customer) session.getAttribute("customer");
                CartDao cd = new CartDao();
                cartList = cd.getAllCartRecordsByCustomerId(customer.getId());
                session.setAttribute("cart", cartList);
                int sum = 0;

            %>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <div class="cart-table">
                            <h3>Your Cart</h3>
                            <div class="cart-table-warp">
                                <table>
                                    <thead>
                                        <tr>
                                            <th class="product-th">Product</th>
                                            <th class="quy-th">Quantity</th>
                                            <th class="size-th">Size</th>
                                            <th class="total-th">Price</th>
                                        </tr>
                                    </thead>
                                    <%  for (Cart c : cartList) {
                                            int pid = c.getProduct_id();
                                            ProductDao pd = new ProductDao();
                                            Product p = pd.getById(pid);
                                            int quantity = c.getQty();

                                    %>

                                    <tbody>
                                        <tr>
                                            <td class="product-col">
                                                <img src="<%=p.getImage()%>" alt="">
                                                <div class="pc-title">
                                                    <h4><%=p.getName()%></h4>
                                                    <p>₹ <%=p.getPrice()%></p>
                                                </div>
                                            </td>
                                            <td class="quy-col">
                                                <div class="quantity">
                                                    <div class="pro-qty">
                                                        <input type="text" value="<%=c.getQty()%>">
                                                    </div>
                                                    <div>
                                                        <button class="btn btn-light"><a href="CartController?op=removeProduct&product_id=<%=p.getId()%>">
                                                                <i class="flaticon-cancel" aria-hidden="true"></i></a></button>
                                                    </div>
                                                </div>
                                            </td>
                                            <td class="size-col"><h4><%=p.getSize()%></h4></td>
                                            <td class="total-col"><h4>₹ <%= p.getPrice() * c.getQty()%></h4></td>
                                            <%sum = sum + (p.getPrice() * c.getQty());%>
                                        </tr>                                    
                                    </tbody>
                                    <%}%>
                                </table>
                            </div>
                            <div class="total-cost">
                                <h6>Total <span>₹ <%=sum%></span></h6>
                            </div>

                        </div>
                    </div>
                    <div class="col-lg-4 card-right">
                        <form class="promo-code-form">
                            <input type="text" placeholder="Enter promo code">
                            <button>Submit</button>
                        </form>
                        <a href="billingAddress.jsp" class="site-btn">Select Billing Address</a>
                        <a href="products.jsp" class="site-btn sb-dark">Continue shopping</a>
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
