<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
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
                <div class="container">
                    <div class="row">
                    <jsp:include page="sidebar.jsp"></jsp:include>

                        <div class="col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0">
                            <div class="row">
                            <%
                                ProductDao pd = new ProductDao();
                                String wear_id = request.getParameter("wear_id");
                                String cat_id = request.getParameter("cat_id");
                                System.out.println("cat_id:"+cat_id);
                                /*if (wear_id == null) {
                                    wear_id = "-1";
                                }*/
                                if(cat_id==null){
                                for (Product product : wear_id == null || wear_id.equals("") || wear_id.equals("-1") ? pd.getAllProduct() : pd.getAllProductByWearType(Integer.parseInt(wear_id))) {
                            %>
                            <div class="col-lg-4 col-sm-6">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <div class="tag-sale">ON SALE</div>
                                        <a href="productDetails.jsp?product_id=<%=product.getId()%>"><img src="<%=product.getImage()%>" alt=""></a>
                                        <div class="pi-links">
                                            <a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
                                            <a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
                                        </div>
                                    </div>
                                    <div class="pi-text">
                                        <h6><%=product.getPrice()%></h6>
                                        <p><%=product.getName()%></p>
                                        <p>Sizes: <%=product.getSize()%></p>
                                    </div>
                                </div>
                            </div>
                            <%}}else if(cat_id!=null){
                                for (Product product : pd.getAllProductByWearTypeIdAndCategoryId(Integer.parseInt(wear_id), Integer.parseInt(cat_id))) {
                            %>
                            <div class="col-lg-4 col-sm-6">
                                <div class="product-item">
                                    <div class="pi-pic">
                                        <div class="tag-sale">ON SALE</div>
                                        <a href="productDetails.jsp?product_id=<%=product.getId()%>"><img src="<%=product.getImage()%>" alt=""></a>
                                        <div class="pi-links">
                                            <a href="#" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
                                            <a href="#" class="wishlist-btn"><i class="flaticon-heart"></i></a>
                                        </div>
                                    </div>
                                    <div class="pi-text">
                                        <h6><%=product.getPrice()%></h6>
                                        <p><%=product.getName()%></p>
                                        <p>Sizes: <%=product.getSize()%></p>
                                    </div>
                                </div>
                            </div>
                                    <%}}%>


                            <div class="text-center w-100 pt-3">
                                <button class="site-btn sb-line sb-dark">LOAD MORE</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
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
