package com.ey.collections;


class ADemo extends AnanymousDemo
{   @Override
	public void taste() {
    	System.out.println(" Sour");
	
    }
}

//outer
public class AnanymousDemo {
	
	public void taste() {
		System.out.println(" sweet ");
	}

	void show() {
		
	}
	public static void main(String[] args) {
		AnanymousDemo a=new AnanymousDemo() { //innner
			
			            public void taste() {
			            	System.out.println(" Spicy");
			        	
			            }
			            void show() {
			            	
			            }
						};
		
		AnanymousDemo  a1=new AnanymousDemo ();
		a1.taste();
		a.taste();
		a.show();
		
		
	}

}
