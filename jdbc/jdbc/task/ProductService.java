package com.ey.jdbc.task;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductService {
	
	public void addProduct(Product product) throws Exception {
		Connection con=DbConn.getConenction();
		PreparedStatement pst=con.prepareStatement("insert into product values(?,?)");
			pst.setInt(1, product.id);
			pst.setString(2, product.name);
			pst.execute();//run
		}
	
	

}
