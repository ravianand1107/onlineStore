package com.daos;

import com.beans.Customer;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDao {

    public boolean add(Customer customer) {
        boolean status = false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "Insert into customer(name,gender,email,mobile,password,address,city,state,userid) values (?,?,?,?,?,?,?,?,?)";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, customer.getName());
                smt.setString(2, customer.getGender());
                smt.setString(3, customer.getEmail());
                smt.setInt(4, customer.getMobile());
                smt.setString(5, customer.getPassword());
                smt.setString(6, customer.getAddress());
                smt.setString(7, customer.getCity());
                smt.setString(8, customer.getState());
                smt.setString(9, customer.getUserid());
                
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

    public boolean removeById(int id) {
        boolean status = false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "delete from customer where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id);

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

    public boolean remove(Customer customer) {
        boolean status = false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "delete from customer where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, customer.getId());

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

    public Customer getById(int id) {
        Customer customer = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from customer where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, id);
                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    customer = new Customer();
                    customer.setId(rs.getInt("id"));
                    customer.setName(rs.getString("name"));
                    customer.setGender(rs.getString("gender"));
                    customer.setEmail(rs.getString("email"));
                    customer.setMobile(rs.getInt("mobile"));
                    customer.setPassword(rs.getString("password"));
                    customer.setAddress(rs.getString("address"));
                    customer.setCity(rs.getString("city"));
                    customer.setState(rs.getString("state"));
                    customer.setUserid(rs.getString("userid"));
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return customer;
    }

    public ArrayList<Customer> getAllRecords() {
        ArrayList<Customer> customers = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from customer";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getInt("id"));
                    customer.setName(rs.getString("name"));
                    customer.setGender(rs.getString("gender"));
                    customer.setEmail(rs.getString("email"));
                    customer.setMobile(rs.getInt("mobile"));
                    customer.setPassword(rs.getString("password"));
                    customer.setAddress(rs.getString("address"));
                    customer.setCity(rs.getString("city"));
                    customer.setState(rs.getString("state"));
                    customer.setUserid(rs.getString("userid"));
                    customers.add(customer);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return customers;
    }

    public ArrayList<Customer> getRowsByLimit(int start, int end) {
        ArrayList<Customer> customers = new ArrayList();

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from customer limit ?,?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, start);
                smt.setInt(2, end);

                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getInt("id"));
                    customer.setName(rs.getString("name"));
                    customer.setGender(rs.getString("gender"));
                    customer.setEmail(rs.getString("email"));
                    customer.setMobile(rs.getInt("mobile"));
                    customer.setPassword(rs.getString("password"));
                    customer.setAddress(rs.getString("address"));
                    customer.setCity(rs.getString("city"));
                    customer.setState(rs.getString("state"));
                    customer.setUserid(rs.getString("userid"));
                    
                    customers.add(customer);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
        return customers;
    }
    
    public boolean isUserIdExist(String userid) {
        boolean status = false;

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from customer where userid=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, userid);

                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
        return status;
    }
    
    public boolean isEmailExist(String email) {
        boolean status = false;

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from customer where email=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, email);

                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
        return status;
    }
    
    public boolean isMobileExist(int mobile) {
        boolean status = false;

        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from customer where mobile=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, mobile);

                ResultSet rs = smt.executeQuery();
                if (rs.next()) {
                    status = true;
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
        return status;
    }
    
     public boolean update(Customer customer) {
        boolean status = false;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "update customer set name=?,gender=?,email=?,mobile=?,password=?,address=?,city=?,state=?,userid=? where id=?";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setString(1, customer.getName());
                smt.setString(2, customer.getGender());
                smt.setString(3, customer.getEmail());
                smt.setInt(4, customer.getMobile());
                smt.setString(5, customer.getPassword());
                smt.setString(6, customer.getAddress());
                smt.setString(7, customer.getCity());
                smt.setString(8, customer.getState());
                smt.setString(9, customer.getUserid());
                smt.setInt(10, customer.getId());
                
                int n = smt.executeUpdate();
               // System.out.println("n:"+n);
                if (n > 0) {
                    //System.out.println("Customer:"+customer);
                    status = true;
                    System.out.println("Record Updated!!!");
                }
                cp.putConnection(con);
                smt.close();

            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return status;
    }
     
     public int getRecordCount() {
        int total = 0;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();

            if (con != null) {
                String sql = "select count(*) from customer";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();

                if (rs.next()) {
                    total = rs.getInt(1);
                    System.out.println("total records:" + total);
                }

                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        }
        return total;
    }
    

}
