package jdbc;




	import java.sql.*;
import java.util.Scanner;

import javax.sql.*;

	public class PreparedStatemnetDemo {
		static Connection con=null;
		public static void main(String[] args) {
				try {
				Class.forName("org.postgresql.Driver");
				con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/capgemini","postgres","postgres");
				PreparedStatement pst=con.prepareStatement("insert into hospital values(?,?)");
				System.out.println("enter data");
				Scanner sc=new Scanner(System.in);
				for(int i=0;i<3;i++) {		
				int id=sc.nextInt(); sc.nextLine();
				String name=sc.nextLine();
				
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.executeUpdate();
				}
				System.out.println("enter hospital is ");
				int x=sc.nextInt();
				PreparedStatement pst1=con.prepareStatement("delete from hospital where id=?");
				pst1.setInt(1, x);
				pst1.execute();
				System.out.println("deleted...");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from hospital" );  //select 
				ResultSetMetaData rsmd=rs.getMetaData(); //columns
				for(int i=1;i<=rsmd.getColumnCount();i++)
				{
					System.out.print(rsmd.getColumnName(i)+"  ");
				}
				System.out.println();
				while(rs.next()) {   //data or record
					System.out.println(rs.getString(1)+"  "+rs.getString(2));
				}
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				finally {
					try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			
		}
		
		
	}















	/*
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	//https://jdbc.postgresql.org/download.html
	public class PostgresJdbcApp{
	   public static void main(String args[]) {
	      Connection c = null;
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager
	            .getConnection("jdbc:postgresql://localhost:5433/capgemini",
	            "postgres", "postgres");
	         Statement st=c.createStatement();
	     ResultSet rs=st.executeQuery("select * from company");
	     while(rs.next()) {
	    	 System.out.println(rs.getString(1)+"  "+rs.getString(2));
	     }
	      } catch (Exception e) {
	         e.printStackTrace();
	      
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	   }
	}

	*/