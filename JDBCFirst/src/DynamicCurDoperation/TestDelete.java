package DynamicCurDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestDelete {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 String url="jdbc:mysql://localhost:3306/wakanda";
		 String user="root";
		 String pass="root";
		  
		 Connection connection=DriverManager.getConnection(url,user,pass);
		 String query="DELETE FROM customer WHERE idcustomer=?";
		 
		 PreparedStatement ps = connection.prepareStatement(query);
	
		
	
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
