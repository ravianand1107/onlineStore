<%@page import="com.beans.Product, com.daos.ProductDao, com.beans.Customer, com.daos.CustomerDao, java.sql.*, java.util.ArrayList, com.beans.Orders, com.beans.OrderItems, com.daos.OrderDao" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Customers</title>

        <jsp:include page="base.jsp"></jsp:include>

            <script>
                function submitForm() {
                    document.getElementById("form1").submit();
                }

            </script>

        </head>

        <body class="animsition">


            <div class="page-wrapper">
                <!-- MENU SIDEBAR-->
            <jsp:include page="sidebar.jsp"></jsp:include>
                <!-- END MENU SIDEBAR-->

                <!-- PAGE CONTAINER-->
                <div class="page-container2">
                    <!-- HEADER DESKTOP-->
                <jsp:include page="header.jsp"></jsp:include>

                    <!-- END HEADER DESKTOP-->
                <%
                    ArrayList<Customer> customerList = new ArrayList();

                    CustomerDao cd = new CustomerDao();
                    customerList = cd.getAllRecordsByCustomeRole();

                %>
                <!-- Main Section -->
                <div class="main-content">
                    <form id="form1">
                        <div class="row">
                            <div class="col-lg-12">
                                <!-- USER DATA-->
                                <div class="user-data m-b-30">
                                    <h3 class="title-3 m-b-30">
                                        <i class="zmdi zmdi-shopping-basket"></i>Customer Details</h3>
                                    <div class="filters m-b-45">
                                        <div class="rs-select2--dark rs-select2--md m-r-10 rs-select2--border">
                                            <select onchange="submitForm();" name="filter" id="filter" class="js-select2">
                                                <option value="-1" selected="selected">Sort By</option>
                                                <option value="">All Customers</option>
                                                <option value="pending">Pending Orders</option>
                                                <option value="confirmed">Confirmed Orders</option>
                                            </select>
                                            <div class="dropDownSelect2"></div>
                                        </div>
                                        <%-- <div class="rs-select2--dark rs-select2--sm rs-select2--border">
                                             <select class="js-select2 au-select-dark" name="time">
                                                 <option selected="selected">All Time</option>
                                                 <option value="">By Month</option>
                                                 <option value="">By Day</option>
                                             </select>
                                             <div class="dropDownSelect2"></div>
                                         </div> --%>
                                    </div>
                                    <div class="table-responsive table--no-card m-b-30">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <td>
                                                        <label class="au-checkbox">
                                                            <input type="checkbox">
                                                            <span class="au-checkmark"></span>
                                                        </label>
                                                    </td> 
                                                    <td><b>Id</b></td>
                                                    <td><b>Name</b></td>
                                                    <td><b>Gender</b></td>
                                                    <td><b>Email</b></td>
                                                    <td><b>Mobile No.</b></td>
                                                    <td><b>User Id</b></td>
                                                    <td><b>Orders</b></td>
                                                    <td><b>Shipping Add.</b></td>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <% //String op = request.getParameter("filter");
                                                    //System.out.println("op:" + op);
                                                    //if (op == null || op.equals("") || op.equals("-1")) {
                                                      //  orderList = od.getAllOrdersInDesc();

                                                        for (Customer cus : customerList) {
                                                            
                                                            
                                                %>
                                                <tr>
                                                    <td>
                                                        <label class="au-checkbox">
                                                            <input type="checkbox">
                                                            <span class="au-checkmark"></span>
                                                        </label>
                                                    </td> 
                                                    <td><%=cus.getId()%></td>
                                                    <td><%=cus.getName()%></td>
                                                    <td><%=cus.getGender()%></td>
                                                    <td><%=cus.getEmail()%></td>
                                                    <td><%=cus.getMobile()%></td>
                                                    <td><%=cus.getUserid()%></td>
                                                    <td><a href="customerOrders.jsp?id=<%=cus.getId()%>"><button class="btn btn-primary btn-sm">Orders</button></a></td>
                                                    <td><a href="customerAddresses.jsp?id=<%=cus.getId()%>"><button class="btn btn-primary btn-sm">Addresses</button></a></td>
                                                </tr>

                                                <%}
                                                        
                                                    %>
                                            </tbody>
                                        </table>
                                    </div>

                                </div>
                                <!-- END USER DATA-->
                            </div>
                        </div>
                    </form>
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
