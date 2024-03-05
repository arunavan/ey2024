package com.ey.collections;

//inner classes..
//1. member inner
//2.local inner class
//3. static inner class// inner class can be static 
//4. ananymous inner class

 class A{
	 
	 int x;
	 class B{ //declare class inside another class
		  int y; 
		  
		  void memberInnerMethod() {
			  System.out.println(y +" "+x);
			  show();
		  }
	  }
	 
	 void outerMethod() {
		// System.out.println(x+"  "+y);
		 
	 }
	 
	public static class B2{
		
	public	static void b2Method() {
			System.out.println("sttaic inner method..");
		}
		
	}
	
	 
	
	Integer id;
	
	static{
		
	}
	{
		
	}
	
	A(){
		
	}
	void show() {
		//2
		class B1{  //local
			void localMethod(){
				System.out.println("local inner class");
			}
		}
		//2 invoking local inner class
		B1 b1=new B1();
		b1.localMethod();
		
	}
	void disp() {
		System.out.println(" class a");
	}
	
}
 //create class,sub ovveride
 
 class B extends A{
	 @Override
	 void disp() {
			System.out.println(" class b overriden");
		}
 }
 
 
public class InnerDemo1 {

	public static void main(String[] args) {
		A a2=new A();
		//4
		A a1= new A() {  //ananymous inner class
					@Override
			 		void disp() {
					System.out.println(" ananymous inner class  overriden method");
				      }
			
					};
		a2.disp();	
		//4 invoking annaymous innre class
		a1.disp();
		//3 invoking static inner class
		A.B2.b2Method();
		a2.show();
		//1 invoking member inner class 
		A.B memberInnerObj=new A().new B();
		memberInnerObj.memberInnerMethod();
		System.out.println(memberInnerObj.y);
	}

}
