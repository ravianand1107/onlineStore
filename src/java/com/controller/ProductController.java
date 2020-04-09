package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.beans.Category;
import com.beans.Product;
import com.beans.WearType;
import com.daos.ProductDao;
import com.daos.WeartypeDao;
import com.daos.CategoryDao;
import com.utilities.FileUploader;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.*;

public class ProductController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");
        System.out.println("hello");
        if (op != null && op.equalsIgnoreCase("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            ProductDao pd = new ProductDao();
            if (pd.removeById(id)){
                response.sendRedirect("admin/allProducts.jsp");
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");
        if (op != null && op.equalsIgnoreCase("add")) {
            HttpSession session = request.getSession();
            Product product = (Product) session.getAttribute("product");
            WearType weartype = (WearType) session.getAttribute("weartype");
            Category category = (Category) session.getAttribute("category");
            ProductDao pd = new ProductDao();
            System.out.println("Beans received product " + product);
            System.out.println("wear name=" + weartype.getId());
            System.out.println("cat name=" + category.getId());

            String imagePath = "";
            imagePath = FileUploader.getUploadedPath(getServletContext(), "media/product", request);
            product.setImage(imagePath);
            if (pd.addProduct(product, weartype.getId(), category.getId())) {
                out.println("Product Saved");
                session.removeAttribute("product");
                session.removeAttribute("weartype");
                session.removeAttribute("cate");
            }
        }
    }

}
