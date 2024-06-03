package CRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
public static void main(String[] args) {
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/m9";
		Connection connection= DriverManager.getConnection(url,"root","root");
		System.out.println("connected");
		connection.close();
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
}
}