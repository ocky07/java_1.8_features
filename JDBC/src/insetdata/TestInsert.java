package insetdata;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestInsert {
public static void main(String[] args) throws SQLException //!communication link failure 
{
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");// provides the info of RDBMS
		
			String url="jdbc:mysql://localhost:3306/jdbc_fistr";
			String user="root";
			String pass="root";
		
			
		Connection	con=DriverManager.getConnection(url,user,pass);
		Statement statement=(Statement) con.createStatement();
		String query="INSERT INTO student(id,name,course,email)"+
		"VALUES (2,'Max','javafullstack'-=,'pee7@gmail.com')";
		int res=statement.executeUpdate(query);// !classnot foundsexception
		System.out.println("no of row ofthe data added= "+res);
		con.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
}
}
