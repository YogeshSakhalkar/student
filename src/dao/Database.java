package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database
{
	public Connection getConnection() throws Exception
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String connectionURL = "jdbc:mysql://localhost:3307/studentproject";
			Connection connection = null;
			connection = DriverManager.getConnection(connectionURL, "root", "root");
			return connection;
		} 
		catch (Exception e)
		{
			throw e;
	}
	
	}

}

