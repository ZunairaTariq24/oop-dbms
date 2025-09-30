package com.hr.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import com.hr.bean.Sender;
import com.hr.util.DBUtil;

public class SenderDao {
    public static ArrayList<Sender> getAllSenders() throws Exception {
        ArrayList<Sender> senders = new ArrayList<>();
        String sql = "SELECT * FROM Sender";
        ResultSet rs = DBUtil.executeQuery(sql);
        while (rs.next()) {
            Sender sender = new Sender();
            sender.setSend_id(rs.getInt("Send_ID"));
            sender.setSend_Phone(rs.getString("SEND_PHONE"));
            sender.setSend_email(rs.getString("SEND_Email"));
            sender.setSend_Name(rs.getString("SEND_NAME"));
            sender.setSend_Address(rs.getString("SEND_ADDRESS"));
            sender.setSend_city(rs.getString("SEND_CITY"));
            senders.add(sender);
        }
        try {
            DBUtil.conn.close();
            System.out.println("Connection closed successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return senders;
    }
    
    public static void insert_user(String Send_phone, String send_Email, String send_Name, String send_address, String send_city) throws Exception {
	    String sql = "INSERT INTO SENDER (Send_ID, SEND_PHONE, SEND_Email, SEND_NAME, SEND_ADDRESS, SEND_CITY) " +
	                 "VALUES (SEQ_SENDER_ID.nextval, '" + Send_phone + "', '" + send_Email + "', '" + send_Name + "', '" + send_address + "', '" + send_city + "')";
	    DBUtil.executeQuery(sql);
	    System.out.println("Sender inserted successfully.");
	    DBUtil.conn.close();
	}
    
    public static void delete(int send_id, String role) throws Exception {
	    String sql = "DELETE FROM Sender WHERE send_id =" + send_id;
	    DBUtil.executeQuery(sql);
	    System.out.println("tested");
	    DBUtil.conn.close();
	}

	public static void updateSender(String send_id, String string, String send_name, String send_city, String send_email) throws Exception {
	    String sql = "UPDATE Sender SET send_phone = " + string + ", send_name = '" + send_name + "', send_city = '" + send_city + "', send_email = '" + send_email + "' WHERE send_id = " + send_id;
	    DBUtil.executeQuery(sql);
	    System.out.println("tested");
	    DBUtil.conn.close();
	}

	public static ArrayList<Sender> getSendName() {
		// TODO Auto-generated method stub
		return null;
	}

	public static ArrayList<Sender> getSenderbyId(String Send_id) throws Exception {
	    ArrayList<Sender> senders = new ArrayList<>();
	    String sql = "SELECT * FROM Sender WHERE Send_id = '" + Send_id + "'";
	    ResultSet rs = DBUtil.executeQuery(sql);

	    try {
	        if (rs.next()) { // Check if there's at least one row
	            Sender sender = new Sender();
	            sender.setSend_id(rs.getInt("Send_ID"));
	            sender.setSend_Phone(rs.getString("SEND_PHONE"));
	            sender.setSend_email(rs.getString("SEND_Email"));
	            sender.setSend_Name(rs.getString("SEND_NAME"));
	            sender.setSend_Address(rs.getString("SEND_ADDRESS"));
	            sender.setSend_city(rs.getString("SEND_CITY"));
	            senders.add(sender);
	        } else {
	            System.out.println("No sender found for Send_id: " + Send_id);
	        }
	    } finally {
	        rs.close();
	    }

	    try {
	        DBUtil.conn.close();
	        System.out.println("Connection closed successfully");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return senders;
	}
}
