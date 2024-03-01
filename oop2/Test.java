package com.ey.oop2;

import com.ey.oop2.p1.Product;

class OnlineProduct extends Product{
	
}

public class Test { //non subclass
	public static void main(String[] args) {
		Product p=new Product();
		p.show2();
		System.out.println(p.mname);
		
		OnlineProduct op=new OnlineProduct();
		System.out.println(op.mname);
		op.show2();
		
	}

}
