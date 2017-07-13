package com.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jdbc.util.jdbcUtil;
import com.mysql.jdbc.PreparedStatement;
import com.obj.User;

public class UserService {
	static Connection conn = jdbcUtil.getCont();
	public static User selectAll(String name){
		User user = new User();
		String sql = "select * from user_test where name='"+name+"'";
		PreparedStatement pstemt ;
		try {
			pstemt  = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = pstemt.executeQuery();
			while(rs.next()){
				user.setName(rs.getString("name")); 
				user.setSex(rs.getString("sex"));
				user.setAge(rs.getInt("age"));
			}
			System.out.println(user.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	/*public static void main(String[] args) {
		selectAll();
	}*/

}
