package DynamicCurDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestInsert {
public static void main(String[] args) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/wakanda";
	
		String user="root";
		String pass="root";
		
		Connection connection = DriverManager.getConnection(url,user,pass);
		String query="INSERT INTO customer VALUES(?,?,?,?,?)";
		
		PreparedStatement ps = connection.prepareStatement(query);
		//Scanner scn=new Scanner(System.in);
		ps.setInt(1, 11);
		ps.setString(2, "Pessaange");
		ps.setString(3, "pess@gmail.com");
		ps.setInt(4, 31);
		ps.setString(5, "north");
		
		ps.addBatch();
		
		ps.setInt(1, 22);
		ps.setString(2, "Rehan");
		ps.setString(3, "reh@gmail.com");
		ps.setInt(4, 26);
		ps.setString(5, "west");

		ps.addBatch();
		
		ps.setInt(1, 33);
		
		ps.setString(2, "semule");
		ps.setString(3, "sekkm@gmail.com");
		ps.setInt(4, 23);
		ps.setString(5, "south");
		
		
		int res=ps.executeUpdate();
		ps.addBatch();
		
		System.out.println("No of the Rows Added ="+res);
		connection.close();
		
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
