package com.daos;

import com.beans.Cart;
import com.beans.Customer;
import com.beans.Product;
import com.beans.Orders;
import com.beans.OrderItems;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class OrderDao {

    public boolean addOrderItems(Customer customer, Cart cart, Product product, String mode, int order_id, String sts) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                con.setAutoCommit(false);

                String sql = "insert into order_items(product_id,order_id,quantity,price,status,date)values(?,?,?,?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);

                smt = con.prepareStatement(sql);
                smt.setInt(1, product.getId());
                smt.setInt(2, order_id);
                smt.setInt(3, cart.getQty());
                smt.setInt(4, product.getPrice());
                smt.setString(5, sts);
                LocalDate date1 = LocalDate.now();
                String date = date1.toString();
                smt.setString(6, date);
                
                int n = smt.executeUpdate();

                sql = "select id from order_items order by id desc limit 1";
                smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                int orderItemId = 0;
                if (rs.next()) {
                    orderItemId = rs.getInt("id");
                }
                sql = "insert into payment(amount,mode,status,date,order_id,order_item_id)values(?,?,?,?,?,?)";
                smt = con.prepareStatement(sql);
                smt.setInt(1, product.getPrice()*cart.getQty());
                smt.setString(2, mode);
                if (mode.equalsIgnoreCase("cod")) {
                    smt.setString(3, "pending");
                } else {
                    smt.setString(3, "success");
                }
                LocalDate date2 = LocalDate.now();
                String order_date = date2.toString();
                smt.setString(4, order_date);
                smt.setInt(5, order_id);
                smt.setInt(6, orderItemId);
                n = smt.executeUpdate();

                if (n > 0) {
                    status = true;
                }
                con.commit();
                System.out.println("Record inserted");

                con.close();
            } catch (Exception e) {
                try {
                    con.rollback();
                } catch (Exception x) {
                }
                System.out.println("Error:" + e.getMessage());
            } finally {
                cp.putConnection(con);
            }
        }
        return status;
    }

    public boolean addOrders(int cId, String date,int addId) {
        boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        if (con != null) {
            try {
                String sql = "insert into orders(customer_id,date,address_id) values(?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, cId);
                smt.setString(2, date);
                smt.setInt(3, addId);
                

                int n = smt.executeUpdate();

                if (n > 0) {
                    status = true;
                    System.out.println("ordered");
                }

            } catch (Exception e) {
                System.out.println("DbError:" + e.getMessage());
            }
        }
        return status;

    }

    public int getOrderId() {
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();
        int orderId = 0;
        if (con != null) {
            try {
                String sql = "select id from orders order by id desc limit 1";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    orderId = rs.getInt("id");
                }
            } catch (Exception e) {
            }
        }

        return orderId;
    }
    
    public ArrayList<Orders> getAllOrdersByCustomerId(int customer_id) {
        ArrayList<Orders> orders = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from orders where customer_id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, customer_id);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Orders order = new Orders();
                    order.setId(rs.getInt("id"));
                    order.setCustomer_id(rs.getInt("customer_id"));
                    order.setDate(rs.getString("date"));
                    order.setAddress_id(rs.getInt("address_id"));
                    
                    orders.add(order);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return orders;
    }
    
    public ArrayList<Orders> getAllOrdersInDescByCustomerId(int customer_id) {
        ArrayList<Orders> orders = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from orders where customer_id=? order by id desc";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, customer_id);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Orders order = new Orders();
                    order.setId(rs.getInt("id"));
                    order.setCustomer_id(rs.getInt("customer_id"));
                    order.setDate(rs.getString("date"));
                    order.setAddress_id(rs.getInt("address_id"));
                    
                    orders.add(order);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return orders;
    }
    
    public ArrayList<OrderItems> getAllOrdersItemsesByOrderId(int order_id) {
        ArrayList<OrderItems> orderItems = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from order_items where order_id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, order_id);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    OrderItems orderItem = new OrderItems();
                    orderItem.setId(rs.getInt("id"));
                    orderItem.setProduct_id(rs.getInt("product_id"));
                    orderItem.setOrder_id(rs.getInt("order_id"));
                    orderItem.setQuantity(rs.getInt("quantity"));
                    orderItem.setPrice(rs.getInt("price"));
                    orderItem.setStatus(rs.getString("status"));
                    orderItem.setDate(rs.getString("date"));
                    
                    orderItems.add(orderItem);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return orderItems;
    }
    
    public ArrayList<Orders> getAllOrders() {
        ArrayList<Orders> orders = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from orders";
                PreparedStatement smt = con.prepareStatement(sql);
                
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Orders order = new Orders();
                    order.setId(rs.getInt("id"));
                    order.setCustomer_id(rs.getInt("customer_id"));
                    order.setDate(rs.getString("date"));
                    order.setAddress_id(rs.getInt("address_id"));
                    
                    orders.add(order);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return orders;
    }
    
    public ArrayList<Orders> getAllOrdersInDesc() {
        ArrayList<Orders> orders = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from orders order by id desc";
                PreparedStatement smt = con.prepareStatement(sql);
                
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Orders order = new Orders();
                    order.setId(rs.getInt("id"));
                    order.setCustomer_id(rs.getInt("customer_id"));
                    order.setDate(rs.getString("date"));
                    order.setAddress_id(rs.getInt("address_id"));
                    
                    orders.add(order);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return orders;
    }
    
    public ArrayList<OrderItems> getAllOrdersItemsesByOrderIdAndStatus(int order_id, String status) {
        ArrayList<OrderItems> orderItems = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from order_items where order_id=? and status=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, order_id);
                smt.setString(2, status);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    OrderItems orderItem = new OrderItems();
                    orderItem.setId(rs.getInt("id"));
                    orderItem.setProduct_id(rs.getInt("product_id"));
                    orderItem.setOrder_id(rs.getInt("order_id"));
                    orderItem.setQuantity(rs.getInt("quantity"));
                    orderItem.setPrice(rs.getInt("price"));
                    orderItem.setStatus(rs.getString("status"));
                    orderItem.setDate(rs.getString("date"));
                    
                    orderItems.add(orderItem);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return orderItems;
    }
    
    public ArrayList<OrderItems> getAllOrdersItemsByStatus(String status) {
        ArrayList<OrderItems> orderItems = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from order_items where status=?";
                PreparedStatement smt = con.prepareStatement(sql);
                
                smt.setString(1, status);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    OrderItems orderItem = new OrderItems();
                    orderItem.setId(rs.getInt("id"));
                    orderItem.setProduct_id(rs.getInt("product_id"));
                    orderItem.setOrder_id(rs.getInt("order_id"));
                    orderItem.setQuantity(rs.getInt("quantity"));
                    orderItem.setPrice(rs.getInt("price"));
                    orderItem.setStatus(rs.getString("status"));
                    orderItem.setDate(rs.getString("date"));
                    
                    orderItems.add(orderItem);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return orderItems;
    }
    
    public boolean updateOrderStatus(String status, int orderItem_id) {
        boolean sts = false;
        ConnectionPool cp = ConnectionPool.getInstance();
        cp.initialize();
        Connection con = cp.getConnection();

        if (con != null) {
            try {
                String sql = "update order_items set status=?, date=? where id = ?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, status);
                LocalDate date = LocalDate.now();
                String order_date = date.toString();
                smt.setString(2, order_date);
                smt.setInt(3, orderItem_id);
                
                smt.executeUpdate();
                cp.putConnection(con);
                sts = true;
                smt.close();

            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
        }
        return sts;
    }
}
