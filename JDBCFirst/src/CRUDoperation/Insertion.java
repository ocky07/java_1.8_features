package CRUDoperation;
import java.sql.*;

public class Insertion {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/wakanda";
	 	String uname="root";
		String pass="root";
		String query="insert into Abc (idAbc,name)values(4,'army lover')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,uname,pass);
		Statement statement = connection.createStatement();
		int i = statement.executeUpdate(query);
		System.out.println(i+" row/s updated");
		statement.close();
		connection.close();
		
	}

}
