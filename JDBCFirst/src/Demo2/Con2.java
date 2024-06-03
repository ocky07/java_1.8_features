package Demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Con2 {
	public static void main(String[] args) {
		
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/prudhvi?user=root&password=root";
				Connection connection = DriverManager.getConnection(url);
				Statement cs = connection.createStatement();
				int res=cs.executeUpdate("INSERT INTO time VALUES(1,'aaj','pg','dbc')");
				System.out.println(res);
				connection.close();
				
				
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
			
}
}