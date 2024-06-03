package CRUDoperation2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddingStudents {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/college?user=root&password=root";
		Connection connection = DriverManager.getConnection(url);
		Statement cs= connection.createStatement();
		cs.addBatch("insert into class1 values(2,'max','454545')");
		cs.addBatch("insert into class1 values(3,'may','154545')");
		cs.addBatch("insert into class1 values(4,'maw','254545')");
		cs.addBatch("insert into class1 values(5,'maq','354545')");
		cs.addBatch("insert into class1 values(6,'mab','554545')");
		cs.addBatch("insert into class1 values(7,'maj','654545')");
		cs.addBatch("insert into class1 values(8,'mak','754545')");
		cs.addBatch("insert into class1 values(9,'mak','754545')");
		int[] eb = cs.executeBatch();
		System.out.println("number of the rows"+eb.length);
		connection.close();
		
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
