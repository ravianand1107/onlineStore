
package com.daos;

import com.beans.Cart;
import com.jdbc.ConnectionPool;
import java.sql.*;
import java.util.ArrayList;

public class CartDao {
    
    public boolean add(Cart cart) {
        boolean status = false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "Insert into cart(customer_id,product_id,qty) values (?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, cart.getCustomer_id());
                smt.setInt(2, cart.getProduct_id());
                smt.setInt(3, cart.getQty());
                
                int n = smt.executeUpdate();
                if (n > 0) {
                    status = true;
                    System.out.println("Record Inserted!!");
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return status;
    }
    
    public boolean removeByCustomerId(int customer_id) {
        boolean status = false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "delete from cart where customer_id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, customer_id);

                int n = smt.executeUpdate();
                if (n > 0) {
                    status = true;
                    System.out.println("Record removed!!");
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return status;
    }
    
    public boolean removeByProductId(int product_id) {
        boolean status = false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "delete from cart where product_id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, product_id);

                int n = smt.executeUpdate();
                if (n > 0) {
                    status = true;
                    System.out.println("Record removed!!");
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return status;
    }
    
    public ArrayList<Cart> getAllCartRecordsByCustomerId(int customer_id) {
        ArrayList<Cart> carts = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from cart where customer_id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, customer_id);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Cart cart = new Cart();
                    cart.setId(rs.getInt("id"));
                    cart.setCustomer_id(rs.getInt("customer_id"));
                    cart.setProduct_id(rs.getInt("product_id"));
                    cart.setQty(rs.getInt("qty"));
                    
                    carts.add(cart);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return carts;
    }
    
    
}
