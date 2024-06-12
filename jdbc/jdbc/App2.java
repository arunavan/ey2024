package com.ey.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App2 {

	public static void main(String[] args)//throws ClassNotFoundException,SQLException
	{
		//1
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","pass@word1");
		
		
		Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from employee");
	    while(rs.next()) {
	    	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
	    }
			
		System.out.println("inserted...");
		}
		catch(Exception e) {
			
		}
		finally {
			
		}

	}

}
