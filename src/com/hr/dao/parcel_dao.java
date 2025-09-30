package com.hr.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.hr.bean.Package;
import com.hr.util.DBUtil;

public class parcel_dao {

    public static int insert(String Rec_Id, String Send_Id, String Weight, String Description) throws Exception {
        String sql = "INSERT INTO PACKAGE (Pack_id, REC_ID, Send_id, Weight, Description) " +
                     "VALUES (PACK_SEQ.nextval, ?, ?, ?, ?)";
        String sqlGetPackId = "SELECT PACK_SEQ.currval FROM dual";

        int generatedPackId = -1; 

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             PreparedStatement pstmtGetPackId = conn.prepareStatement(sqlGetPackId)) {

            pstmt.setString(1, Rec_Id);
            pstmt.setString(2, Send_Id);
            pstmt.setString(3, Weight);
            pstmt.setString(4, Description);

            pstmt.executeUpdate();

            try (ResultSet rs = pstmtGetPackId.executeQuery()) {
                if (rs.next()) {
                    generatedPackId = rs.getInt(1);
                }
            }

            System.out.println("Pack_id generated: " + generatedPackId);
        } catch (SQLException e) {
            System.err.println("Error inserting package: " + e.getMessage());
            throw e;
        }

        return generatedPackId;
    }
    public static ArrayList<Package> getPackagesByID(String package_id) throws Exception {
        ArrayList<Package> packages = new ArrayList<>();
        String sql = "SELECT * FROM Package WHERE Pack_id = ?";
        
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, package_id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) { // Check if there's at least one row
                Package pkg = new Package();
                pkg.setPack_id(rs.getString("Pack_id"));
                pkg.setSEND_ID(rs.getString("Send_id"));
                pkg.setREC_ID(rs.getString("Rec_id"));
                pkg.setWEIGHT(rs.getString("Weight"));

                packages.add(pkg);
                // Assuming these methods fetch data and possibly add to the packages list or log details
                Receiver_Dao.getReceiverByID(pkg.getREC_ID());
                SenderDao.getSenderbyId(pkg.getSEND_ID());
            } else {
                System.out.println("No package found for package ID: " + package_id);
            }

            rs.close();
        } catch (SQLException e) {
            System.err.println("Error fetching packages: " + e.getMessage());
            throw e; // Re-throw exception to handle it in the calling method
        }

        return packages;
    }
	
}

 