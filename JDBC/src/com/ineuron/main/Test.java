package com.ineuron.main;

import java.io.*;
import java.sql.*;

public class Test {

	public static void main(String[] args) throws Exception {

		ResultSet resultSet=null;
		
	  Class.forName("com.mysql.cj.jdbc.Driver");	
      System.out.println("driver class loaded successfully by DriverManager");
      Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pwskills","root","Qpalzm231998@");
      Statement statement=connection.createStatement();
      boolean bool=statement.execute("update student set studentid=1003 where studentname='gaurav'");
      
      if(bool=true) {
    	  resultSet=statement.executeQuery("Select * from student");
    	  while(resultSet.next()) {
    		  String s=resultSet.getString(1);
    		  int i   = resultSet.getInt(2);
    		  System.out.println(s+" "+i);
    	  }
      }
      else {
    	  int rowsUpdateCount=statement.getUpdateCount();
    	  System.out.println("rows updated:- "+ rowsUpdateCount);
      }
      int deletedRows=statement.executeUpdate("insert into student values('gaurav singh kuntal',123)");
      System.out.println(connection.getClass().getName()+" "+ resultSet.getClass().getName()+" "+statement.getClass().getName());
	}
}
