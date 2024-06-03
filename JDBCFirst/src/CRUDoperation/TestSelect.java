package CRUDoperation;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestSelect {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/wakanda";
		String user="root";
		String pass="root";
		Connection connection=DriverManager.getConnection(url,user,pass);
		
		Statement statement=connection.createStatement();
		
		String quer="SELECT * FROM customer";
		boolean res= statement.execute(quer);
		System.out.println(res);
		ResultSet resultSet = statement.getResultSet();
		System.out.println(resultSet);
		while(resultSet.next()) {
		System.out.println(" id of customer ="+resultSet.getInt(1));	
		System.out.println(" name of the customer ="+resultSet.getString(2));
		System.out.println(" email ofthe customer ="+resultSet.getString(3));
		System.out.println(" age of the customer ="+resultSet.getInt(4));
		System.out.println(" address of the customer ="+resultSet.getString(5));
		System.out.println("---------------------------------------------------");
		}
		connection.close();
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
