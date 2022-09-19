package placement_major;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBconnection {

	//Create two interface
	public Connection c;  // used to set up connection with mysql
	public Statement st;  // used to execute all queries of mysql
	
	public DBconnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Load mysql jdbc driver
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement_major","root","Ratayu@1801");
			st = c.createStatement(); 
			System.out.println("Connected");// helpful to execute query
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DBconnection();
	}
	
}

