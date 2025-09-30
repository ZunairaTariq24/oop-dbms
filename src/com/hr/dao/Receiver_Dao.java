package com.hr.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.hr.bean.Receiver;
import com.hr.util.DBUtil;

public class Receiver_Dao {

    public static void insert_user(String send_phone, String send_email, String send_name, String send_address, String send_city) throws Exception {
        String sql = "INSERT INTO RECEIVER (REC_ID, REC_NAME, REC_ADDRESS, REC_PHONE, REC_EMAIL, REC_CITY) " +
                     "VALUES (SEQ_RECEIVER_ID.nextval, '" + send_name + "', '" + send_address + "', '" + send_phone + "', '" + send_email + "', '" + send_city + "')";
        Connection conn = DBUtil.getConnection();
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
        System.out.println("Receiver inserted successfully.");
    }

    public static void delete(int rec_id, String role) throws Exception {
        String sql = "DELETE FROM " + role + " WHERE REC_ID = " + rec_id;
        Connection conn = DBUtil.getConnection();
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
        System.out.println("Receiver deleted successfully.");
    }

    public static void updateReceiver(String rec_id, String rec_phone, String rec_name, String rec_city, String rec_email) throws Exception {
        String sql = "UPDATE RECEIVER SET REC_PHONE = '" + rec_phone + "', REC_NAME = '" + rec_name + "', REC_CITY = '" + rec_city + "', REC_EMAIL = '" + rec_email + "' WHERE REC_ID = " + rec_id;
        Connection conn = DBUtil.getConnection();
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
        System.out.println("Receiver updated successfully.");
    }

    public static ArrayList<Receiver> getAllReceivers() throws Exception {
        ArrayList<Receiver> receivers = new ArrayList<>();
        String sql = "SELECT * FROM RECEIVER";
        Connection conn = DBUtil.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Receiver receiver = new Receiver();
            receiver.setRec_id(rs.getInt("REC_ID"));
            receiver.setRec_name(rs.getString("REC_NAME"));
            receiver.setRec_address(rs.getString("REC_ADDRESS"));
            receiver.setRec_phone(rs.getString("REC_PHONE"));
            receiver.setRec_email(rs.getString("REC_EMAIL"));
            receiver.setRec_city(rs.getString("REC_CITY"));
            receivers.add(receiver);
        }
        rs.close();
        stmt.close();
        conn.close();
        System.out.println("Connection closed successfully");
        return receivers;
    }

    public static ArrayList<Receiver> getReceiverByID(String rec_id) throws Exception {
        ArrayList<Receiver> receivers = new ArrayList<>();
        String sql = "SELECT * FROM RECEIVER WHERE REC_ID = " + rec_id;
        Connection conn = DBUtil.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Receiver receiver = new Receiver();
            receiver.setRec_id(rs.getInt("REC_ID"));
            receiver.setRec_name(rs.getString("REC_NAME"));
            receiver.setRec_address(rs.getString("REC_ADDRESS"));
            receiver.setRec_phone(rs.getString("REC_PHONE"));
            receiver.setRec_email(rs.getString("REC_EMAIL"));
            receiver.setRec_city(rs.getString("REC_CITY"));
            receivers.add(receiver);
        }
        rs.close();
        stmt.close();
        conn.close();
        return receivers;
    }
}

