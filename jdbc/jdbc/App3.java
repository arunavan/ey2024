package com.ey.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App3{

	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		//1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","pass@word1");
		//con.setAutoCommit(false);		
		PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 employee records");
		for(int i=1;i<=3;i++) {
			pst.setInt(1, sc.nextInt());  sc.nextLine();
			pst.setString(2, sc.nextLine());
			pst.setString(3, sc.nextLine());
			pst.execute();//run
		}
		//con.rollback();
		//con.commit();
		Statement st=con.createStatement();
	
	    ResultSet rs=st.executeQuery("select * from employee");
		ResultSetMetaData rsmd=rs.getMetaData(); //table structure 
		System.out.println(rsmd.getColumnCount());
		System.out.println();
		for(int i=1;i<=rsmd.getColumnCount();i++)
			System.out.print(rsmd.getColumnName(i)+ "   ");
		
		System.out.println();
	    while(rs.next()) {
	    	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
	    }
			
		System.out.println("inserted...");
		

	}

}
