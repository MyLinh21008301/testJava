package iuh.se.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	private Connection connection;
	
	public ConnectDB() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/myDB", "root", "sapassword");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		return this.connection;
	}
	public void closeConnection() throws SQLException {
		connection.close();
	}
	
}
