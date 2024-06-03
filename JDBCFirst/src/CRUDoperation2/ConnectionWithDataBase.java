package CRUDoperation2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionWithDataBase {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/college?user=root&password=root";
		Connection connection = DriverManager.getConnection(url);
		Statement cs = connection.createStatement();
		cs.executeUpdate("INSERT INTO class1 values(1,'pru','901455')");
		
		connection.close();
		
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
}
}
