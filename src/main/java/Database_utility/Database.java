package Database_utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database 
{
	public static void main(String[] args) throws SQLException
		{
	Connection connection	=DriverManager.getConnection("jdbc:mysql://stagingdb2.careers360.de:3306/", "staging", "cklp0874*&$(#%3rxv?");
	
	
	if(connection.isClosed())
	{
		System.out.println("we have not connected in datatbase");
	}
	else
	{
		System.out.println("we have successfully connected to database");
	}
		}
	

}
