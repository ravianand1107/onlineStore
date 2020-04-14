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
        <title>Update Product's Details</title>

        <jsp:include page="base.jsp"></jsp:include>

        </head>

        <body class="animsition">
        <jsp:useBean class="com.beans.Product" id="product1" scope="session"></jsp:useBean>
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
                            <%
                                System.out.println("Akshay");
                                int id = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
                                // product1 = (Product) session.getAttribute("product");
                                System.out.println("ravi");
                                ProductDao pd = new ProductDao();
                                Product product = pd.getById(id);
                                session.setAttribute("product1", product);
                                product1 = (Product) session.getAttribute("product1");
                                System.out.println("pid:" + product1.getId());
                                System.out.println("pname:" + product1.getName());

                                WeartypeDao wd = new WeartypeDao();
                                WearType weartype1 = wd.getWeartypeByProductId(id);
                                session.setAttribute("weartype", weartype1);
                            %>

                            <div class="col col-md-12">

                                <form class="form">
                                    <table class="table">
                                        <tr>
                                            <th colspan="2"><center><h2>**Update Product's Details**</h2></center></th>
                                        </tr>
                                        <tr>
                                            <th>Enter Product Name </th>
                                            <td><input type="text" name="name" class="form-control" value="${product1.name}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Price </th>
                                            <td><input type="text" name="price" class="form-control" value="${product1.price}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Size </th>
                                            <td><input type="text" name="size" class="form-control" value="${product1.size}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Color </th>
                                            <td><input type="text" name="color" class="form-control" value="${product1.color}"/></td>
                                        </tr>
                                        <tr>
                                            <th>Enter Product Brand </th>
                                            <td><input type="text" name="brand" class="form-control" value="${product1.brand}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Stock </th>
                                            <td><input type="text" name="stock" class="form-control" value="${product1.stock}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Enter Product Description </th>
                                            <td><input type="text" name="description" class="form-control" value="${product1.description}"/></td>
                                        </tr> 
                                        <tr>
                                            <th>Select Wear Type </th>
                                            <td>
                                                <%
                                                    wd = new WeartypeDao();
                                                    weartype = wd.getWeartypeByProductId(product1.getId());
                                                    ArrayList<WearType> weartypes = wd.getAllWeartype();
                                                    
                                                    for (WearType wear : weartypes) {
                                                %>
                                                <input type="radio" name="wear" value="<%=wear.getId()%>" <%if(wear.getName().equals(weartype.getName())){
                                                    out.println("checked");}%>/><%=wear.getName()%><br>
                                                <%}%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <th>Select Category </th>
                                            <td>
                                                <%
                                                    CategoryDao cd = new CategoryDao();
                                                    category = cd.getCategoryByProductId(product1.getId());
                                                    ArrayList<Category> categories = cd.getAllCategory();
                                                   
                                                    for (Category cat : categories) { %>
                                                        <input type="radio" name="cate" value="<%=cat.getId()%>" <%if(cat.getName().equals(category.getName())){
                                                            out.println("checked");}%> /> <%=cat.getName()%><br/> 
                                                <%}%>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td colspan="2"><input type="submit" name="submit" value="Save and Next" class="btn-primary form-control"></td>
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

                                    <form action="../ProductController?op=update" method="post" enctype="multipart/form-data" class="form">
                                        <table class="table">
                                            <tr>
                                                <th>Select Product Image</th>
                                                <td><img src="../${product1.image}" class="img img-thumbnail" width="20%" height="20%" id="preview"/> <br/>
                                                <input type="file" name="image" class="form-control btn btn-primary"/></td>
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
