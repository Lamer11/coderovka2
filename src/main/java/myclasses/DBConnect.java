package myclasses;

import java.sql.*;
import java.net.URISyntaxException;


public class DBConnect {

		private static Connection getConnection() throws URISyntaxException, SQLException {
    	String dbUrl = System.getenv("JDBC_DATABASE_URL");
 	   	return DriverManager.getConnection(dbUrl);
	}	

	public void queryInsert(String namePage) throws SQLException, URISyntaxException{
			Connection connection = getConnection();
			
			if(connection != null) {
				Statement statement = connection.createStatement();
				// Вставить запись
				statement.executeUpdate("INSERT INTO pages (namepage) values ('" + namePage + "');");
				connection.close();
			}else {
				System.out.println("connection = null SESESE");
				connection.close();
			}	
		}



}