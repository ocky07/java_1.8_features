package CRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class TestConnection2 {
public static void main(String[] args) {
	 
	Driver driver;
	
	try {
		driver=new Driver();
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
		String user="root";
		String password="root";
		
		Connection connection = DriverManager.getConnection(url,user,password);
		System.out.println("connnected");
			Statement  statement = connection.createStatement();
			String query="INSERT INTO customer(`idcustomer`,`name`,`email`,`age`,`address`) values (9,'wolex','walwexx@123',25,'us')";
		boolean res=statement.execute(query);
		System.out.println(res);
		connection.close();
			
	} catch (SQLException e) {
	
		e.printStackTrace();
	}
}
}
