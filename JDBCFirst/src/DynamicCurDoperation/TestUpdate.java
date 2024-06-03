package DynamicCurDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class TestUpdate {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		 String url="jdbc:mysql://localhost:3306/wakanda";
		 String user="root";
		 String pass="root";
		  
		 Connection connection=DriverManager.getConnection(url,user,pass);
		 String query="UPDATE customer set name=?,email=?,age=? WHERE idcustoer=?";
		 
		 PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(566, query);
		
		//update preper statement i want
		
		
		
		
		
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
