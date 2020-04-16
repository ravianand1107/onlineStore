<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
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
                 ArrayList<Product> productList =  new ArrayList();
                ProductDao pd = new ProductDao();
                String product_id = request.getParameter("product_id");
                Product product = pd.getById(Integer.parseInt(product_id));
                productList.add(product);
                int quantity = request.getParameter("qty") != null ? Integer.parseInt(request.getParameter("qty")) : -1;
                 
                Product selectedProduct = null;
                for (Product p : productList) {
                    if (p.getId() == Integer.parseInt(product_id)) {
                        selectedProduct = p;
                    }
                }
                
                Cart mycart = new Cart();
                
               if(quantity!=0 && selectedProduct!=null){
            mycart.setProduct(selectedProduct);
            mycart.setQuantity(quantity);
        }
        
        ArrayList<Cart> cart;
        if(session.getAttribute("cart")==null){
            cart=new ArrayList<Cart>();
        }
        else{
            cart = (ArrayList)session.getAttribute("cart");
        }
        
        boolean exist=false;
        for(Cart cc: cart){
            if(selectedProduct!=null)
            {
                if(cc.getProduct().getId()==selectedProduct.getId())
                {
                    exist=true;
                    cc.setQuantity(cc.getQuantity() + quantity);
                }
            }
        }
        
        if(!exist && selectedProduct!=null)
            cart.add(mycart);
        
        session.setAttribute("cart", cart);
        
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
                                    <% int sum = 0;
                            for (Cart c : cart) {
                                Product p = c.getProduct();
                                
                                
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
                                                        <input type="text" value="<%=c.getQuantity()%>">
                                                    </div>
                                                </div>
                                            </td>
                                            <td class="size-col"><h4><%=p.getSize()%></h4></td>
                                            <td class="total-col"><h4>₹ <%= p.getPrice() * c.getQuantity()%></h4></td>
                                            <%sum= sum+(p.getPrice() * c.getQuantity());%>
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
