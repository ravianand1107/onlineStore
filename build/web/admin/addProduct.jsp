<%@page import= "com.beans.Product, com.beans.Category, com.beans.WearType, 
        com.daos.ProductDao, com.daos.CategoryDao, com.daos.WeartypeDao, java.util.ArrayList"%>

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
        <title>Add Product</title>

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
                        <div class="form-control">
                            <div class="container-fluid">


                                <div class="col col-md-12">

                                    <form class="form">
                                        <table class="table">
                                            <tr>
                                                <th colspan="2"><center><h2>Add Product here </h2></center></th>
                                            </tr>
                                            <tr>
                                                <th>Enter Product Name </th>
                                                <td><input type="text" name="name" class="form-control" value="${product.name}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Price </th>
                                            <td><input type="text" name="price" class="form-control" value="${product.price}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Size </th>
                                            <td><input type="text" name="size" class="form-control" value="${product.size}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Color </th>
                                            <td><input type="text" name="color" class="form-control" value="${product.color}"/></td>
                                        </tr>
                                        <tr>
                                            <th>Enter Product Brand </th>
                                            <td><input type="text" name="brand" class="form-control" value="${product.brand}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Stock </th>
                                            <td><input type="text" name="stock" class="form-control" value="${product.stock}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Description </th>
                                            <td><input type="text" name="description" class="form-control" value="${product.description}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Select Wear Type </th>
                                            <td>
                                                <%
                                                    WeartypeDao wd = new WeartypeDao();
                                                    ArrayList<WearType> weartypes = wd.getAllWeartype();
                                                    for (WearType wear : weartypes) {
                                                        System.out.println("wid:" + wear.getId());
                                                %> 
                                                <input type="radio" name="wear" value="<%=wear.getId()%>" /> <%=wear.getName()%><br/> 
                                                <%}%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Select Category </th>
                                            <td>
                                                <%
                                                    CategoryDao cd = new CategoryDao();
                                                    ArrayList<Category> categories = cd.getAllCategory();
                                                    for (Category cat : categories) {%> 
                                                <input type="radio" name="cate" value="<%=cat.getId()%>" /> <%=cat.getName()%><br/> 
                                                <%}%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th colspan="2"><center><button name="submit" type="submit" class="btn btn-primary">Save and Next </button></center></th>
                                        </tr>
                                    </table>
                                </form>
                            </div>

                            <div class="col-md-12">
                                <%
                                    if (request.getParameter("submit") != null) {
                                        weartype.setId(Integer.parseInt(request.getParameter("wear")));
                                        category.setId(Integer.parseInt(request.getParameter("cate")));
                                %>
                                <jsp:setProperty name="product" property="*"></jsp:setProperty>

                                    <form action="../ProductController?op=add" method="post" enctype="multipart/form-data" class="form">
                                        <table class="table">
                                            <tr>
                                                <th>Select Product Image</th>
                                                <td><input type="file" name="image" class="form-control btn btn-primary"/></td>
                                            </tr>
                                            <tr>
                                                <th colspan="2" ><center><button type="submit" class="btn btn-primary">Click here to insert image</button></center></th>
                                            </tr>
                                        </table>
                                    </form>

                                <% }
                                %>
                            </div>
                        </div>
                    </div>
                </div>



                <!-- End Main Section -->

                <!-- Footer -->
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
