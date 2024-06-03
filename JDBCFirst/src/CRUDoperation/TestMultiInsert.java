package CRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMultiInsert {
	
	public static void main(String[] args) {
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
			
			Connection connection= DriverManager.getConnection(url,"root","root");
			Statement statement=connection.createStatement();
			statement.addBatch("INSERT INTO customer VALUES (110,'Raman','ram134@gmail',21,'india')");
			statement.addBatch("INSERT INTO customer VALUES (111,'Raman','ram234@gmail',21,'india')");
			statement.addBatch("INSERT INTO customer VALUES (112,'Raman','ram334@gmail',21,'india')");
			statement.addBatch("INSERT INTO customer VALUES (113,'Raman','ram434@gmail',21,'india')");
		    statement.addBatch("INSERT INTO customer VALUES (114,'Raman','ram534@gmail',21,'india')");
			statement.addBatch("INSERT INTO customer VALUES (115,'Raman','ram634@gmail',21,'india')");
			statement.addBatch("INSERT INTO customer VALUES (116,'Raman','ram734@gmail',21,'india')");
			statement.addBatch("INSERT INTO customer VALUES (117,'Raman','ram854@gmail',21,'india')");
			int[] res=statement.executeBatch();
			System.out.println(res.length);
			connection.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
}
