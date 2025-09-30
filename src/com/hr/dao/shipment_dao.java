package com.hr.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.hr.util.DBUtil;

public class shipment_dao {
    public static void insertShipment(int packId, java.util.Date sqlDispatchDate, String disCity, String desCity, java.util.Date sqlArivalDate) throws Exception {
        String sql = "INSERT INTO SHIPMENT (ARRIVAL_DATE, SHIP_DATE, PACK_ID, DEST_CITY, SEND_CITY) " +
                     "VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDate(1, (Date) sqlArivalDate);
            pstmt.setDate(2, (Date) sqlDispatchDate);
            pstmt.setInt(3, packId);
            pstmt.setString(4, desCity);
            pstmt.setString(5, disCity);

            pstmt.executeUpdate();
            System.out.println("Shipment inserted successfully.");
        } catch (SQLException e) {
            System.err.println("Error inserting shipment: " + e.getMessage());
            throw e;
        }
    }
}
