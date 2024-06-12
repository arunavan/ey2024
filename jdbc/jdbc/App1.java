package com.ey.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class App1 {

	public static void main(String[] args)throws ClassNotFoundException,SQLException
	{
		//1
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","pass@word1");
		
		System.out.println("connection created");
		
		Statement st=con.createStatement();
		
	//	st.executeUpdate("create table employee(id int primary key,name varchar(10),email varchar(20))");

		//System.out.println("table created");
		//st.executeUpdate("insert into employee values(1,'ram','ram@gmail.com')");
		//st.executeUpdate("insert into employee values(2,'ravi','ravi@gmail.com')");
		//st.executeUpdate("insert into employee values(3,'kiran','kiran@gmail.com')");
		
		st.executeUpdate("update  employee set name='kumar' where id=2");
		st.executeUpdate("delete from employee where id=3");
		
		System.out.println("inserted...");
		

	}

}
