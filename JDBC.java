package Nisarga;
import java.sql.*;
import java.util.concurrent.Callable;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver"); // is a static method of the Class class used to load a class dynamically at runtime.
			   
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Wiprodb", "root", "Nisu@2003");
		 
		CallableStatement cstmt=con.prepareCall("{CALL getAllEmployees()}");
		 
		ResultSet rs=cstmt.executeQuery();
		
		
		 
		while (rs.next())
		{
			
			System.out.println(rs.getInt("id") + " " + rs.getString("name")+ " "+rs.getString("salary"));
		}
		con.close();
		}
			catch (Exception e)
		   {
				System.out.println(e);
		   }
		}
		 
		}
	


