<%@page import="com.beans.WearType, com.daos.WeartypeDao, com.beans.Category, com.daos.CategoryDao"%>
<%
    WeartypeDao wd = new WeartypeDao();
    CategoryDao cd = new CategoryDao();
%>
<div class="col-lg-3 order-2 order-lg-1">
    <div class="filter-widget">
        <h2 class="fw-title">Categories</h2>
        <ul class="category-menu">
<%for (WearType weartype : wd.getAllWeartype()) {%>
            <li><a href=" products.jsp?wear_id=<%=weartype.getId()%>"><%=weartype.getName()%></a>
                <ul class="sub-menu">
                    <%System.out.println("wear id:"+weartype.getId());%>
                    <%for (Category category : cd.getAllCategoryByWearId(weartype.getId())) {%>
                    <li><a href="products.jsp?wear_id=<%=weartype.getId()%>&cat_id=<%=category.getId()%>"><%=category.getName()%></a></li>
                    <%}%>
                </ul>
            </li>
<%}%>
        </ul>
    </div>
    <div class="filter-widget mb-0">
        <h2 class="fw-title">refine by</h2>
        <div class="price-range-wrap">
            <h4>Price</h4>
            <div class="price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content" data-min="10" data-max="270">
                <div class="ui-slider-range ui-corner-all ui-widget-header" style="left: 0%; width: 100%;"></div>
                <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default" style="left: 0%;">
                </span>
                <span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default" style="left: 100%;">
                </span>
            </div>
            <div class="range-slider">
                <div class="price-input">
                    <input type="text" id="minamount">
                    <input type="text" id="maxamount">
                </div>
            </div>
        </div>
    </div>
    <div class="filter-widget mb-0">
        <h2 class="fw-title">color by</h2>
        <div class="fw-color-choose">
            <div class="cs-item">
                <input type="radio" name="cs" id="gray-color">
                <label class="cs-gray" for="gray-color">
                    <span>(3)</span>
                </label>
            </div>
            <div class="cs-item">
                <input type="radio" name="cs" id="orange-color">
                <label class="cs-orange" for="orange-color">
                    <span>(25)</span>
                </label>
            </div>
            <div class="cs-item">
                <input type="radio" name="cs" id="yollow-color">
                <label class="cs-yollow" for="yollow-color">
                    <span>(112)</span>
                </label>
            </div>
            <div class="cs-item">
                <input type="radio" name="cs" id="green-color">
                <label class="cs-green" for="green-color">
                    <span>(75)</span>
                </label>
            </div>
            <div class="cs-item">
                <input type="radio" name="cs" id="purple-color">
                <label class="cs-purple" for="purple-color">
                    <span>(9)</span>
                </label>
            </div>
            <div class="cs-item">
                <input type="radio" name="cs" id="blue-color" checked="">
                <label class="cs-blue" for="blue-color">
                    <span>(29)</span>
                </label>
            </div>
        </div>
    </div>
    <div class="filter-widget mb-0">
        <h2 class="fw-title">Size</h2>
        <div class="fw-size-choose">
            <div class="sc-item">
                <input type="radio" name="sc" id="xs-size">
                <label for="xs-size">XS</label>
            </div>
            <div class="sc-item">
                <input type="radio" name="sc" id="s-size">
                <label for="s-size">S</label>
            </div>
            <div class="sc-item">
                <input type="radio" name="sc" id="m-size"  checked="">
                <label for="m-size">M</label>
            </div>
            <div class="sc-item">
                <input type="radio" name="sc" id="l-size">
                <label for="l-size">L</label>
            </div>
            <div class="sc-item">
                <input type="radio" name="sc" id="xl-size">
                <label for="xl-size">XL</label>
            </div>
            <div class="sc-item">
                <input type="radio" name="sc" id="xxl-size">
                <label for="xxl-size">XXL</label>
            </div>
        </div>
    </div>
    <div class="filter-widget">
        <h2 class="fw-title">Brand</h2>
        <ul class="category-menu">
            <li><a href="#">Abercrombie & Fitch <span>(2)</span></a></li>
            <li><a href="#">Asos<span>(56)</span></a></li>
            <li><a href="#">Bershka<span>(36)</span></a></li>
            <li><a href="#">Missguided<span>(27)</span></a></li>
            <li><a href="#">Zara<span>(19)</span></a></li>
        </ul>
    </div>
</div>