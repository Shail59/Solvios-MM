package mindFullMarket.db.module3;

import java.sql.*;

public class dbConnection {
	
	Connection connect;
	
	String dbURL = "jdbc:mysql://mm-rds.cobx8slie2ht.us-east-1.rds.amazonaws.com:3306/mbm_redesign";
	String username = "root";
	String passward = "aakash104";
	String driver = "com.mysql.jdbc.Driver";
	
	try {
	
		Class.forName(driver).newInstance();
		connect = DriverManager.getConnection(dbURL, username, passward);
		
		
	}catch (Exception e) {
		
		System.out.println("Some thing goes wrong with DB");
		
	}
	
}	
	

