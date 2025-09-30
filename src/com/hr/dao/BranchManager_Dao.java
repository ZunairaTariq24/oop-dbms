package com.hr.dao;
import com.hr.util.DBUtil;
public class BranchManager_Dao {

	public static void insert_user(String city , String distance ,  String Charges) throws Exception {
		String sql =" INSERT INTO BRANCHES (CHARGES, DISTANCE, CITY) VALUES ('"+Charges+"','"+distance+"','"+city+"')";
					DBUtil.executeQuery(sql);
					System.out.println("tested");
					DBUtil.conn.close();
				}
}