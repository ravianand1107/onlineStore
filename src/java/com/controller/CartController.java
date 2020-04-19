
package com.controller;

import com.beans.Customer;
import com.daos.CartDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CartController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op= request.getParameter("op");
        HttpSession session = request.getSession();
        Customer customer = (Customer)session.getAttribute("customer");
        System.out.println("CustomerName: "+customer.getName());
        int cust_id= customer.getId();
        int prod_id = Integer.parseInt(request.getParameter("product_id"));
        
        if(op.equalsIgnoreCase("removeProduct")){
            CartDao cd = new CartDao();
            if(cd.removeByCustomerIdAndProductId(cust_id, prod_id)){
                System.out.println("Product removed from cart");
                response.sendRedirect("cart.jsp");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op= request.getParameter("op");
        int cust_id = Integer.parseInt(request.getParameter("cid"));
        int prod_id = Integer.parseInt(request.getParameter("pid"));
        int qty = Integer.parseInt(request.getParameter("qty"));
        
        if(op.equalsIgnoreCase("add")){
            CartDao cd= new CartDao();
            if(cd.add(cust_id,prod_id,qty)){
                System.out.println("Successfully added to cart");
                response.sendRedirect("cart.jsp");
            }
        }
    }

}
