
package com.daos;

import com.beans.WearType;
import com.jdbc.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class WeartypeDao {
    
    public ArrayList<WearType> getAllWeartype() {
        ArrayList<WearType> weartypeList = new ArrayList();
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = " select * from weartype";
                PreparedStatement smt = con.prepareStatement(sql);
                ResultSet rs = smt.executeQuery();
                while (rs.next()) {
                    WearType weartype = new WearType();
                    weartype.setId(rs.getInt("id"));
                    weartype.setName(rs.getString("name"));
                    
                    weartypeList.add(weartype);
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return weartypeList;
    }
    
    public WearType getWeartypeByProductId(int product_id) {
        WearType weartype = null;
        try {
            ConnectionPool cp = ConnectionPool.getInstance();
            cp.initialize();
            Connection con = cp.getConnection();
            if (con != null) {
                String sql = " select * from weartype where id in(select weartype_id from product_details where product_id=? )";
                PreparedStatement smt = con.prepareStatement(sql);
                smt.setInt(1, product_id);
                ResultSet rs = smt.executeQuery();
                if(rs.next()){
                    weartype = new WearType();
                    weartype.setId(rs.getInt("id"));
                    weartype.setName(rs.getString("name"));
                }
                cp.putConnection(con);
                smt.close();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return weartype;
    }
    
   /* public static void main(String[] args) {
        WeartypeDao wd = new WeartypeDao();
        System.out.println(wd.getWeartypeByProductId(1).getName());
    }*/
}
