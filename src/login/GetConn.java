package login;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConn {
	
	public static Connection getConnection()throws Exception{
		String url="jdbc:mysql://localhost:3306/oaoffice";
		String username="root";
		String password="123456789";
		Connection con = DriverManager.getConnection(url, username, password);
		return con;
		
	}
}
