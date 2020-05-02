<%-- 
    Document   : home
    Created on : 31 Mar, 2020, 12:20:39 PM
    Author     : ravi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Contact Us</title>
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


            <!-- Contact section -->
            <section class="contact-section">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 contact-info">
                            <h3>Get in touch</h3>
                            <p>M.P. Nagar, No. 25, Bhopal<br/>
                                +91 7894561230<br/>
                                divisima@gmail.com</p>
                            <div class="contact-social">
                                <a href="#"><i class="fa fa-pinterest"></i></a>
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>

                            </div>
                            <form class="contact-form" action="QueryController?op=addQuery" method="post">
                                <input type="text" placeholder="Your name" name="name" value="${queries.name}"/>
                            <input type="text" placeholder="Your e-mail" name="email" value="${queries.email}"/>
                            <input type="text" placeholder="Subject" name="subject" value="${queries.subject}"/>
                            <textarea placeholder="Message"name="message" value="${queries.message}"></textarea>
                            <button class="site-btn" type="submit">SEND NOW</button>
                        </form>
                    </div>
                </div>
            </div>
            <br/>
        </section>
        <!-- Contact section end -->



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
