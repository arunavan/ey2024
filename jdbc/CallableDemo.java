package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class CallableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/capgemini","postgres","postgres");
			CallableStatement cst=con.prepareCall("{ ?=CALL increment1(?) }");
			System.out.println("enter data");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			cst.setInt(2, i);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.execute();
			int result=cst.getInt(1);
			System.out.println("Incremnet values:"+result);
			}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
