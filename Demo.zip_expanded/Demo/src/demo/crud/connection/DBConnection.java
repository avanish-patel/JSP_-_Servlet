package demo.crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private static Connection connection = null;
	private static final String DBNAME = "LoginUser";
	private static final String DBURL = "jdbc:mysql://localhost:3306/"+DBNAME;
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "einstein";
	
	public static Connection getConnection(){
		if(connection == null){
			createConnection();
		}
		return connection;
	}
	
	public static void createConnection(){
		try {
			connection = DriverManager.getConnection(DBURL, DB_USERNAME, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
