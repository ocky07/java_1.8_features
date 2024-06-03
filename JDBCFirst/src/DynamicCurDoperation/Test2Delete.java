package DynamicCurDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test2Delete {
public static void main(String[] args) throws ClassNotFoundException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
	try {
		Connection connection= DriverManager.getConnection(url,"root","root");
	
	String sql="DELETE FROM customer WHERE idcustomer=?";
	PreparedStatement ps = connection.prepareStatement(sql);
	int res=ps.executeUpdate();
	
	System.out.println(res);
	
	connection.close();
	
	} catch (SQLException e) {
		
		
		
		e.printStackTrace();
	}
}
}
