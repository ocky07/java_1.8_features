 package CRUDoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserGivenQuery {
public static void main(String[] args) {
	
	try {
		System.out.println("Enter the query");
		
		BufferedReader reader= new 
				BufferedReader(new InputStreamReader(System.in));
		String query=reader.readLine();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
		Connection connection= DriverManager.getConnection(url,"root","root");
	
			Statement  statement = connection.createStatement();
			
			if(statement.execute(query)) {
				ResultSet resultSet = statement.getResultSet();	
				while(resultSet.next()) {
					System.out.println("Id of customer ="+resultSet.getInt(1));
					System.out.println("Name of the customer ="+resultSet.getString(2));
					System.out.println("Email of the customer ="+resultSet.getString(3));
					System.out.println("Age of the customer ="+resultSet.getInt(4));
					System.out.println("Address of the customer ="+resultSet.getString(5));
					System.out.println("--------------------------------------------");
				}
			} else System.out.println("data updated successfully");
			
		
		
	} catch (ClassNotFoundException | SQLException | IOException e) {
		
		e.printStackTrace();
	}
}
}
