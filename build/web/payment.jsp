<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
<%@page import="com.beans.Product, com.daos.ProductDao, java.sql.*, java.util.ArrayList,com.beans.Customer, com.beans.Address, com.daos.AddressDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Payment</title>
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

        <%
            Customer customer = (Customer)session.getAttribute("customer");
            int address_id = Integer.parseInt(request.getParameter("id")) ;
            AddressDao ad = new AddressDao();
            Address add = ad.getById(address_id);
            System.out.println("Customer Name:: "+customer.getName());
            System.out.println("Address:: "+add.getName());
        %>

       


	<!-- Category section -->
        <section class="checkout-section spad">
            <div class="main-content">
		<div class="container">
			<div class="row">
                            
                            <form class="form" action="OrderController?op=addOrder" method="post"> 
                                <br/>
                                <h2><u>Payment Page</u></h2><br/><br/>
                                <b>Please select the preferred payment method to use this order.</b><br/><br/>
                                <br/><input type="radio" name="payment" value="cod">Cash On Delivery*<br/>
                                <br/>
                                <input type="submit" name="submit" value="Proceed" class="site-btn">
                                
                            </form>
                            
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
