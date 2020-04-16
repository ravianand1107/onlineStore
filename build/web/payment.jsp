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



        <!-- Page info -->
	<div class="page-top-info">
		<div class="container">
			<h4>Payment PAge</h4>
			
		</div>
	</div>
	<!-- Page info end -->


	<!-- Category section -->
	
		<div class="container">
			<div class="row">
                            
                            <form class="form" action="" method="post"> 
                                <br/>
                                <b>Please select the preferred payment method to use this order.</b><br/><br/>
                                <br/><input type="radio" name="payment" value="cod">Cash On Delivery*<br/>
                                <br/>
                                <input type="submit" name="submit" value="Proceed" class="btn btn-primary">
                                
                            </form>
                            
			</div>
		</div>
	
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
