
package com.daos;

import com.beans.Category;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryDao {
    
    public ArrayList<Category> getAllCategory() {
        ArrayList<Category> categoryList = new ArrayList();
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = " select * from category";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Category category = new Category();
                    category.setId(rs.getInt("id"));
                    category.setName(rs.getString("name"));
                    
                    categoryList.add(category);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return categoryList;
    }
    
    public ArrayList<Category> getAllCategoryByWearId(int wear_id) {
        ArrayList<Category> categoryList = new ArrayList();
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = "select * from category where id in(select cat_id from product_details where weartype_id in(select id from weartype where id=?))";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, wear_id);
                
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    Category category = new Category();
                    category.setId(rs.getInt("id"));
                    category.setName(rs.getString("name"));
                    
                    categoryList.add(category);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return categoryList;
    }
    
}
