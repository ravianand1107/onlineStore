
package com.controller;

import com.beans.Address;
import com.beans.Customer;
import com.daos.AddressDao;
import com.daos.ProductDao;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddressController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");
        System.out.println("hello");
        if (op != null && op.equalsIgnoreCase("delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            AddressDao ad = new AddressDao();
            if (ad.removeById(id)){
                response.sendRedirect("billingAddress.jsp");
            }
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String op = request.getParameter("op");
        if (op != null && op.equalsIgnoreCase("add")) {
            HttpSession session = request.getSession();
            Customer customer = (Customer)session.getAttribute("customer");
            //String customer_id = request.getParameter("customer_id");
            System.out.println("cust id: "+customer.getId());
            Address address = (Address) session.getAttribute("address");
            AddressDao ad = new AddressDao();
            System.out.println("Address:"+address.getName());
            address.setCustomer_id(customer.getId());
            if(ad.add(address)){
               response.sendRedirect("billingAddress.jsp");
                
           }
        }
    }

}
