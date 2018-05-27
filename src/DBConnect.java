import java.sql.*;

import com.themeParkSystem.database.DatabaseConnection;

public class DBConnect {

	public static void main(String args[]) {
		try(Connection connect = DatabaseConnection.getInstance();) {
			System.out.println(connect.isClosed());
		} catch(SQLException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
		}
	}
}
