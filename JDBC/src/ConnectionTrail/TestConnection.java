package ConnectionTrail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
public static void main(String[] args) throws SQLException {
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.
			 getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","root");
	System.out.println("connected");
    }catch(ClassNotFoundException e) {
	 
    	e.printStackTrace();
	}
}
}
