<%@page import="com.beans.WearType, com.daos.WeartypeDao"%>
<header class="header-section">
    <%
        WeartypeDao wd = new WeartypeDao();
    %>
    <div class="header-top">
        <div class="container">
            <div class="row">
                <div class="col-lg-2 text-center text-lg-left">
                    <!-- logo -->
                    <a href="home.jsp" class="site-logo">
                        <img src="assets/img/logo.png" alt="">
                    </a>
                </div>
                <div class="col-xl-6 col-lg-5">
                    <form class="header-search-form">
                        <input type="text" placeholder="Search on divisima ....">
                        <button><i class="flaticon-search"></i></button>
                    </form>
                </div>
                <div class="col-xl-4 col-lg-5">
                    <div class="user-panel">
                        <%
                            if (session.getAttribute("customer") == null) {%>
                        <div class="up-item">
                            <i class="flaticon-profile"></i>
                            <a href="login.jsp">Sign In</a> or <a href="register.jsp">Create Account</a>
                        </div>
                        <%} else {%>
                        <div class="up-item">
                            
                            <ul class="main-menu">
                                <li><i class="flaticon-profile"></i>
                                    <a href="#"> Profile</a>
                                    <ul class="sub-menu">
                                        <li><a href="#"><b>${customer.name}</b></a></li>
                                        <li><a href="orders.jsp">Orders</a></li>
                                        <li><a href="logout.jsp">Logout</a></li>
                                        
                                    </ul>
                                </li>
                            </ul>
                        </div>
                        <%}%>

                        <div class="up-item">
                            <div class="shopping-card">
                                <i class="flaticon-bag"></i>
                                <span>0</span>
                            </div>
                            <a href="cart.jsp">Shopping Cart</a>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
    <nav class="main-navbar">
        <div class="container">
            <!-- menu -->
            <ul class="main-menu">
                <li><a href="home.jsp">Home</a></li>
                <li><a href="products.jsp">All</a></li>
                    <%for (WearType weartype : wd.getAllWeartype()) {%>
                <li><a href="products.jsp?wear_id=<%=weartype.getId()%>"><%=weartype.getName()%></a></li>
                    <%}%>
                <li><a href="#">Footwear</a>
                    <ul class="sub-menu">
                        <li><a href="#">Sneakers</a></li>
                        <li><a href="#">Sandals</a></li>
                        <li><a href="#">Formal Shoes</a></li>
                        <li><a href="#">Boots</a></li>
                        <li><a href="#">Flip Flops</a></li>
                    </ul>
                </li>
                <li><a href="contactUs.jsp">Contact Us</a></li>
                <li><a href="#">Pages</a>
                    <ul class="sub-menu">
                        <li><a href="./product.html">Product Page</a></li>
                        <li><a href="./category.html">Category Page</a></li>
                        <li><a href="./cart.html">Cart Page</a></li>
                        <li><a href="./checkout.html">Checkout Page</a></li>
                        <li><a href="./contact.html">Contact Page</a></li>
                    </ul>
                </li>
                <li><a href="#">Blog
                    <span class="new">New</span>
                    </a></li>
            </ul>
        </div>
    </nav>
</header>