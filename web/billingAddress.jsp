<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
<%@page import="com.beans.Product, com.daos.ProductDao, java.sql.*, java.util.ArrayList, com.beans.Cart" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:setProperty name="cart" property="*"></jsp:setProperty>


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
				<a href="#">Your Cart</a> /
			</div>
		</div>
	</div>
	<!-- Page info end -->


	<!-- Checkout section -->
	<section class="checkout-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 order-2 order-lg-1">
					<form class="checkout-form">
						<div class="cf-title">Billing Address</div>
						<div class="row">
							<div class="col-md-7">
								<p>*Billing Information</p>
							</div>
							<div class="col-md-5">
								<div class="cf-radio-btns address-rb">
									<div class="cfr-item">
										<input type="radio" name="pm" id="one">
										<label for="one">Use my regular address</label>
									</div>
									<div class="cfr-item">
										<input type="radio" name="pm" id="two">
										<label for="two">Use a different address</label>
									</div>
								</div>
							</div>
						</div>
						<div class="row address-inputs">
							<div class="col-md-12">
								<input type="text" placeholder="Address">
								<input type="text" placeholder="City">
								<input type="text" placeholder="State">
							</div>
							<div class="col-md-6">
								<input type="text" placeholder="Zip code">
							</div>
							<div class="col-md-6">
								<input type="text" placeholder="Phone no.">
							</div>
						</div>
						<div class="cf-title">Delievery Info</div>
						<div class="row shipping-btns">
							<div class="col-6">
								<h4>Standard</h4>
							</div>
							<div class="col-6">
								<div class="cf-radio-btns">
									<div class="cfr-item">
										<input type="radio" name="shipping" id="ship-1">
										<label for="ship-1">Free</label>
									</div>
								</div>
							</div>
							<div class="col-6">
								<h4>Next day delievery  </h4>
							</div>
							<div class="col-6">
								<div class="cf-radio-btns">
									<div class="cfr-item">
										<input type="radio" name="shipping" id="ship-2">
										<label for="ship-2">$3.45</label>
									</div>
								</div>
							</div>
						</div>
						<div class="cf-title">Payment</div>
						<ul class="payment-list">
							<li>Paypal<a href="#"><img src="img/paypal.png" alt=""></a></li>
							<li>Credit / Debit card<a href="#"><img src="img/mastercart.png" alt=""></a></li>
							<li>Pay when you get the package</li>
						</ul>
						<button class="site-btn submit-order-btn">Place Order</button>
					</form>
				</div>
				<div class="col-lg-4 order-1 order-lg-2">
					<div class="checkout-cart">
						<h3>Your Cart</h3>
						<ul class="product-list">
							<li>
								<div class="pl-thumb"><img src="img/cart/1.jpg" alt=""></div>
								<h6>Animal Print Dress</h6>
								<p>$45.90</p>
							</li>
							<li>
								<div class="pl-thumb"><img src="img/cart/2.jpg" alt=""></div>
								<h6>Animal Print Dress</h6>
								<p>$45.90</p>
							</li>
						</ul>
						<ul class="price-list">
							<li>Total<span>$99.90</span></li>
							<li>Shipping<span>free</span></li>
							<li class="total">Total<span>$99.90</span></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- checkout section end -->
	


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
