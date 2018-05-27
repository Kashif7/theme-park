package com.themeParkSystem.database;

import java.sql.*;

public class DBAccess {
	
	public static boolean loginStatus(String userId, String password) {
		Connection conn;
		boolean result;
		
		try {
			conn = DatabaseConnection.getInstance();
			Statement statement = conn.createStatement();
			PreparedStatement ps = null;
			if(userId.startsWith("A")){
				String query = "SELECT * FROM admin WHERE id = ?";
				ps = conn.prepareStatement(query);
				ps.setString(1, "userId");
				ResultSet resultSet  = ps.executeQuery();
				
				return true;
			}
			
		} catch(SQLException ex) {
            System.out.println("Database Connection Failed : " + ex.getMessage());
		}
		
		
	}
}
