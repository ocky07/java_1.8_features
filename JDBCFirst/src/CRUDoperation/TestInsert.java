 package CRUDoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {

	public static void main(String[] args) {
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/wakanda?user=root&password=root";
				Connection connection= DriverManager.getConnection(url,"root","root");
				System.out.println("connected");
				
				Statement  statement = connection.createStatement();
				String query="INSERT INTO customer(`idcustomer`,`name`,`email`,`age`,`address`)"
				+ " values (13,'Daff','Dlhfli@123',27,'Paries')";
			int res=statement.executeUpdate(query);
			System.out.println("The number of the rows are add :"+res);
			connection.close();
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}

	}

}
