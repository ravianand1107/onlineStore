<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
<%@page import="com.beans.Customer"%>
<%@page import="com.beans.Product, com.daos.ProductDao, java.sql.*, java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Products</title>
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



            <!-- Page info -->
            <div class="page-top-info">
                <div class="container">
                    <h4>CAtegory PAge</h4>
                    <div class="site-pagination">
                        <a href="home.jsp">Home</a> /
                        <a href="products.jsp">Shop</a> /
                    </div>
                </div>
            </div>
            <!-- Page info end -->


            <!-- Category section -->
            <section class="category-section spad">
            <%
                Customer customer = (Customer)session.getAttribute("customer");
                System.out.println("Customer_name:"+customer.getName());
                ProductDao pd = new ProductDao();
                String product_id = request.getParameter("product_id");
                Product product = pd.getById(Integer.parseInt(product_id));
            %>
            <form action="CartController?op=add" method="post">
                <div class="container">
                    <div class="row">


                        <div class="col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0">
                            <div class="row">

                                <div class="col-lg-6">
                                    <input type="hidden" name="cid" value="<%=customer.getId()%>"/>
                                    <input type="hidden" name="pid" value="<%=product.getId()%>"/>
                                    <div class="product-pic-zoom">
                                        <img class="product-big-img" src="<%=product.getImage()%>" alt="">
                                    </div>
                                    <div class="product-thumbs" tabindex="1" style="overflow: hidden; outline: none;">
                                        <div class="product-thumbs-track">
                                            <div class="pt active" data-imgbigurl="img/single-product/1.jpg"><img src="img/single-product/thumb-1.jpg" alt=""></div>
                                            <div class="pt" data-imgbigurl="img/single-product/2.jpg"><img src="img/single-product/thumb-2.jpg" alt=""></div>
                                            <div class="pt" data-imgbigurl="img/single-product/3.jpg"><img src="img/single-product/thumb-3.jpg" alt=""></div>
                                            <div class="pt" data-imgbigurl="img/single-product/4.jpg"><img src="img/single-product/thumb-4.jpg" alt=""></div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-6 product-details">
                                    <h2 class="p-title"><%=product.getName()%></h2>
                                    <h3 class="p-price">₹ <%=product.getPrice()%></h3>
                                    <h4 class="p-stock">Available: <span>In Stock</span></h4>
                                    <div class="p-rating">
                                        <i class="fa fa-star-o"></i>
                                        <i class="fa fa-star-o"></i>
                                        <i class="fa fa-star-o"></i>
                                        <i class="fa fa-star-o"></i>
                                        <i class="fa fa-star-o fa-fade"></i>
                                    </div>
                                    <div class="p-review">
                                        <a href="">3 reviews</a>|<a href="">Add your review</a>
                                    </div>
                                    <div class="fw-size-choose">
                                        <p>Size</p>
                                        <div class="sc-item">
                                            <input type="radio" name="sc" id="xs-size">
                                            <label for="xs-size"><%=product.getSize()%></label>
                                        </div>

                                        <!--    <div class="sc-item disable">
                                                <input type="radio" name="sc" id="xl-size" disabled>
                                                <label for="xl-size">40</label>
                                            </div>  -->
                                    </div>

                                    <div class="quantity">
                                        <p>Quantity</p>
                                        <div class="pro-qty"><input type="number" name="qty" id="qty" min="1" max="5" value="1"></div>
                                    </div>
                                    <%--<a href="cart.jsp?product_id=<%=product.getId()%>" class="site-btn">SHOP NOW</a>--%>
                                    <input type="submit" class="site-btn" value="Shop Now"/>
                                    <div id="accordion" class="accordion-area">
                                        <div class="panel">
                                            <div class="panel-header" id="headingOne">
                                                <button class="panel-link active" data-toggle="collapse" data-target="#collapse1" aria-expanded="true" aria-controls="collapse1">information</button>
                                            </div>
                                            <div id="collapse1" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
                                                <div class="panel-body">
                                                    <p><%=product.getDescription()%></p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel">
                                            <div class="panel-header" id="headingTwo">
                                                <button class="panel-link" data-toggle="collapse" data-target="#collapse2" aria-expanded="false" aria-controls="collapse2">care details </button>
                                            </div>
                                            <div id="collapse2" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
                                                <div class="panel-body">
                                                    <img src="./img/cards.png" alt="">
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="panel">
                                            <div class="panel-header" id="headingThree">
                                                <button class="panel-link" data-toggle="collapse" data-target="#collapse3" aria-expanded="false" aria-controls="collapse3">shipping & Returns</button>
                                            </div>
                                            <div id="collapse3" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
                                                <div class="panel-body">
                                                    <h4>7 Days Returns</h4>
                                                    <p>Cash on Delivery Available<br>Home Delivery <span>3 - 4 days</span></p>
                                                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="social-sharing">
                                        <a href=""><i class="fa fa-google-plus"></i></a>
                                        <a href=""><i class="fa fa-pinterest"></i></a>
                                        <a href=""><i class="fa fa-facebook"></i></a>
                                        <a href=""><i class="fa fa-twitter"></i></a>
                                        <a href=""><i class="fa fa-youtube"></i></a>
                                    </div>
                                </div>


                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </section>
        <!-- Category section end -->


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
