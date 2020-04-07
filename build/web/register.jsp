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




            <!-- Category section -->
            
                <div class="container">


                    <div class="col col-lg-auto">
                        <div class="row">
                            
                            <center><h2>Register</h2></center>
                            <form action="addpic.jsp" method='post' class="form"  onsubmit="return matchPwd(password.value, cpassword.value);"> 
                               <center>
                                <table width="600" class="table">
                                    <tr>
                                        <td>Enter Name </td>
                                        <td><input type="text" name="name" required="required" class="form-control" value="${person.name}"></td>
                                </tr>
                                <tr>
                                    <td>Enter Father Name </td>
                                    <td><input type="text" name="fname" required="required"  class="form-control" value="${person.fname}"></td>
                                </tr>   
                                <tr>
                                    <td>Enter UserID </td>
                                    <td><input type="text" name="userid" required="required" class="form-control" id="userid" onblur="checkUserid(this.value, sp1);" value="${person.userid}">
                                        <span id ="sp1"> </span>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Enter Password</td>
                                    <td><input type="password" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" name="password" id="password" required="required" class="form-control" value="${person.password}">
                                        <br/>
                                        <b>Password must contains atleast one uppercase,one lowercase , one special char and more than 8 characters</b>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Confirm Password</td>
                                    <td><input type="password" name="cpassword" id="cpassword" required="required" class="form-control" value="${person.password}"></td>
                                </tr>
                                <tr>
                                    <td>Enter Age</td>
                                    <td><input type="number" name="age"class="form-control" value="${person.age}"></td>
                                </tr>
                                <tr>
                                    <td>Select Gender </td>
                                    <td>
                                        <input type="radio" name="gender"  value="Male" ${person.gender eq "Male"?"checked":""}/>Male
                                        <br/>
                                        <input type="radio" name="gender"  value="Female" ${person.gender eq "Female"?"checked":""}/> Female
                                    </td>
                                </tr>
                                <tr>
                                    <td>Select Your Hobbies : </td>
                                    <td>
                                        <input type="checkbox" name="hobbies" value="Dancing" ${person.hobbies.contains("Dancing")? "checked":""}>Dancing
                                        <input type="checkbox" name="hobbies" value="Singing" ${person.hobbies.contains("Singing")? "checked":""}>Singing <br/>
                                        <input type="checkbox" name="hobbies" value="Cooking" ${person.hobbies.contains("Cooking")? "checked":""}>Cooking
                                        <input type="checkbox" name="hobbies" value="Drawing" ${person.hobbies.contains("Drawing")? "checked":""}>Drawing <br/>

                                    </td>
                                </tr>

                                <tr>
                                    <th> <input type="checkbox" value="accept" name="accept" id="accept" onchange="checkValue(this, submit)"/> Accept Terms and Condition.</th>
                                    <th><input type="submit" name="submit" id="submit" value="Next Page" class="btn btn-primary" disabled="disabled"> </th>
                                </tr>
                            </table>
                            </center>
                        </form>
                        
                    </div>
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
