<%@page import="com.beans.Product, com.daos.ProductDao, java.sql.*, java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="au theme template">
        <meta name="author" content="Hau Nguyen">
        <meta name="keywords" content="au theme template">

        <!-- Title Page-->
        <title>All Products</title>

        <jsp:include page="base.jsp"></jsp:include>

        </head>

        <body class="animsition">
            <jsp:useBean class="com.beans.Product" id="product" scope="session"></jsp:useBean>
        <jsp:useBean class="com.beans.WearType" id="weartype" scope="session"></jsp:useBean>
        <jsp:useBean class="com.beans.Category" id="category" scope="session"></jsp:useBean>
            <div class="page-wrapper">
                <!-- MENU SIDEBAR-->
            <jsp:include page="sidebar.jsp"></jsp:include>
                <!-- END MENU SIDEBAR-->

                <!-- PAGE CONTAINER-->
                <div class="page-container2">
                    <!-- HEADER DESKTOP-->
                <jsp:include page="header.jsp"></jsp:include>

                    <!-- END HEADER DESKTOP--> 
                    <!-- Main Section -->
                    <div class="main-content">
                        <div class="section__content section__content--p30">
                            <div class="container-fluid">
                                <div class="row">
                                <%
                                    ProductDao pd = new ProductDao();
                                    String wear_id = request.getParameter("wear_id");

                                    if (wear_id == null) {
                                        wear_id = "-1";
                                    }
                                    for (Product product1 : wear_id == null || wear_id.equals("") || wear_id.equals("-1") ? pd.getAllProduct() : pd.getAllProductByWearType(Integer.parseInt(wear_id))) {
                                %>
                                <div class="col-md-4">
                                    <div class="card">
                                        <center><img class="card-img-top" src="../<%=product1.getImage()%>" alt="card image" style="width: 50%"></center>
                                        <div class="card-body">
                                            <h4 class="card-title mb-3"><a href="#"><%=product1.getId()%>. <%=product1.getName()%></a></h4><br/>
                                            <p class="card-text ">Price: <%=product1.getPrice()%><br/> 
                                                Stock: <%=product1.getStock()%><br/>
                                                Brand: <%=product1.getBrand()%><br/>
                                                Size:  <%=product1.getSize()%><br/>
                                                
                                            
                                            </p>
                                            <button><a href="editProduct.jsp?id=<%=product1.getId()%>"><i class="fas fa-pencil btn btn-primary" aria-hidden="true"></i></a></button> 
                                            <button><a href="#"> <i class="fas fa-trash btn btn-danger" aria-hidden="true"></i> </a></button>
                                        </div>
                                    </div>
                                </div>
                                <%}%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>




            <!-- End Main Section -->

            <!-- Footer --!>
            <jsp:include page="footer.jsp"></jsp:include>
            <!-- End Footer -->
            <!-- END PAGE CONTAINER-->
        </div>

    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
    <!-- Vendor JS       -->
    <script src="vendor/slick/slick.min.js">
    </script>
    <script src="vendor/wow/wow.min.js"></script>
    <script src="vendor/animsition/animsition.min.js"></script>
    <script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
    <script src="vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="vendor/counter-up/jquery.counterup.min.js">
    </script>
    <script src="vendor/circle-progress/circle-progress.min.js"></script>
    <script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="vendor/chartjs/Chart.bundle.min.js"></script>
    <script src="vendor/select2/select2.min.js">
    </script>
    <script src="vendor/vector-map/jquery.vmap.js"></script>
    <script src="vendor/vector-map/jquery.vmap.min.js"></script>
    <script src="vendor/vector-map/jquery.vmap.sampledata.js"></script>
    <script src="vendor/vector-map/jquery.vmap.world.js"></script>

    <!-- Main JS-->
    <script src="js/main.js"></script>

</body>

</html>
<!-- end document-->
