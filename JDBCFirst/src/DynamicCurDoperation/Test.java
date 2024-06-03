package DynamicCurDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String url="jdbc:mysql://localhost:3306/wakanda";
			 String user="root";
			 String pass="root";
			  
			 Connection connection=DriverManager.getConnection(url,user,pass);
			 String query="SELECT * FROM customer WHERE idcustomer=?";
			 
			 PreparedStatement ps = connection.prepareStatement(query);
			 
			 ps.setInt(1, 2);
			 Boolean res=ps.execute();
			 System.out.println("no of the row added ="+res);
			 if(res) {
				 ResultSet resultSet = ps.getResultSet();
				 while(resultSet.next()) {
					 System.out.println(" id of customer ="+resultSet.getInt(1));	
						System.out.println(" name of the customer ="+resultSet.getString(2));
						System.out.println(" email ofthe customer ="+resultSet.getString(3));
						System.out.println(" age of the customer ="+resultSet.getInt(4));
						System.out.println(" address of the customer ="+resultSet.getString(5));
						System.out.println("---------------------------------------------------"); 
				 }
			 }
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
