package com.ineuron.redundant;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class RedundantCode {

	private RedundantCode() {}
	
	public static Connection getConnection() throws SQLException, IOException  {

		FileInputStream fis= new FileInputStream("E:\\softwares\\eclipse\\workspace\\jdbcDynamicInsert\\application.properties");
		Properties properties= new Properties();
		properties.load(fis);

	    Connection connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
        return connection;
	}
	
	public static void cleanUp(Connection connection,ResultSet resultSet) throws SQLException {
		
		connection.close();
		resultSet.close();
	}
}