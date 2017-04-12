package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	//write code to connect to JDBC to get rows from employee table
	

	   public static void main(String[] args)
	   {
		   try {
			   String url = "jdbc:sqlserver://localhost:1433;databasename=company;integratedSecurity=true";
		         String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		         String userName = "NAVYA//chinni"; 
		         String password = "";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url,userName,password);
			System.out.println("test");
			Statement sta = conn.createStatement();
			String Sql = "select * from dbo.employee";
			ResultSet rs = sta.executeQuery(Sql);
			while (rs.next()) {
				System.out.println(rs.getInt(0));
				System.out.println(rs.getString(1));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
			
	   }

}
