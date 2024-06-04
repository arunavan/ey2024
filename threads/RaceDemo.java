package com.ey.threads;
// method, block/statement 
class CallMe{
	//wait  , notify ,notifyAll
	//synchronized	
	void   call(String s ) {
		synchronized(this) {
		try {
			System.out.print("  [ ");
			System.out.print(" Welcome :"+ s);
			Thread.sleep(1000);
			System.out.print(" ] ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		//
	}
	
}

class Caller extends Thread{
	CallMe c;
	String s;
	Caller(String s,CallMe c1){
		this.s=s;
		this.c=c1;
		//this.start();
	}
	public void run() {
		c.call(s);
		
	}
}

public class RaceDemo {

	public static void main(String[] args) {
		CallMe cm=new CallMe();
	   Caller c=new Caller("EY-USer1",cm);
	   c.start();
	   Caller c1=new Caller("EY-USer2",cm);
	   c1.start();
	   Caller c2=new Caller("EY-USer3",cm);
	   c2.start();
	}

}
