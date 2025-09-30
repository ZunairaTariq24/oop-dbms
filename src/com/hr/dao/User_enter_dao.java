package com.hr.dao;
import java.sql.ResultSet;

import com.hr.util.DBUtil;
public class User_enter_dao {
public static void insert_user(String Category , String Email , String Password ) throws Exception {
	
String sql = " INSERT INTO USERS (EMAIL, PASSWORD, CATEGORY) VALUES ('"+Email+"','"+Password+"','"+Category+"')";
	DBUtil.executeQuery(sql);
	System.out.println("tested");
	DBUtil.conn.close();
}

public static Boolean sign_in(String email, String password) throws Exception {
    String sql = "SELECT * FROM users WHERE email = '" + email + "' AND password = '" + password + "'";
    ResultSet resultSet = DBUtil.executeQuery(sql);
    
    if (resultSet.next()) {
        System.out.println("tested");
        
        return true;
    } else {
        return false;
    }
}

}


