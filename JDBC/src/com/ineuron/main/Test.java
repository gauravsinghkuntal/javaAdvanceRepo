package com.ineuron.main;

import java.sql.*;
import java.io.*;
import java.util.*;

import com.ineuron.redundant.RedundantCode;

public class Test{
	
	public static void main(String[] args){
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		
		try {
			connection=RedundantCode.getConnection();
			if(connection!=null)
			resultSet=connection.createStatement().executeQuery("Select * from student");
			if(resultSet!=null) {
				while(resultSet.next())
				System.out.println(resultSet.getString(1)+" "+resultSet.getInt(2));;;;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				RedundantCode.cleanUp(connection, resultSet);
			} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("program terminated successfully");
		}
	
	}
	
}