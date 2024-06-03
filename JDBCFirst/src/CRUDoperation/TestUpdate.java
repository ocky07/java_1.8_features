package CRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
			Connection connection= DriverManager.getConnection(url,"root","root");
			Statement  statement = connection.createStatement();
			String query="UPDATE FORM customer set name=Rolex,"
					+"age=22 WHERE name='Rolex'";
			int res=statement.executeUpdate(query);
			System.out.println("The no of rows updated="+res);
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
