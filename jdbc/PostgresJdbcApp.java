package jdbc;

import java.sql.*;
import javax.sql.*;

class PostgresJdbcApp {
	
	public static void main(String[] args) {
		//1   drivername 
		try {
			Class.forName("org.postgresql.Driver");
			//2    url,id,pwd
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5433/capgemini","postgres","postgres");
			
			System.out.println("Connection is succes");
			//con.setAutoCommit(false);
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDriverName());
			//3 Statement
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			//st.executeUpdate("create table hospital(id int ,name text)"); //ddl,dml
			
			//st.executeUpdate("insert into  hospital values(1,'Medwin Hospital')");
			//st.executeUpdate("insert into  hospital values(2,'CVR Hospital')");
			
			Savepoint s1=con.setSavepoint("s1");
			
			//st.executeUpdate("update   hospital set name='Apollo Hospital' where id=3");
			//st.execute("delete from hospital where id=2");
			Savepoint s2=con.setSavepoint("s1");
			
			
			con.rollback(s1);
			con.releaseSavepoint(s1);
			//con.commit();
			System.out.println("table creation  succes");
			
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