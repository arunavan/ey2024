package com.ey.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.Scanner;
public class App4 {
	public static void main(String[] args) throws Exception {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","pass@word1");
				CallableStatement pst=con.prepareCall("{ ?=CALL sum13(?,?) }");
				Scanner sc=new Scanner(System.in);
				System.out.println("enter any 2 numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				pst.setInt(2,a);
				pst.setInt(3, b);
				pst.registerOutParameter(1,Types.INTEGER);
				pst.execute();
				int result=pst.getInt(1);
				System.out.println(" Result:"+result);
	}

}

/*

DELIMITER $$
CREATE FUNCTION sum13( a int, b int ) returns int
BEGIN
		return a+b;
END $$
DELIMITER $$
SET GLOBAL log_bin_trust_function_creators = 1;
select sum13(4,5);
select sum13(5,6);

*/