package com.ey.threads;
class TT1 implements Runnable{
	public void run() {
		try {
			//wait();
			for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);  
			}
			//notify();   //java.lang.Object   ,JVM,synhcronized 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		TT1 tt1=new TT1();
        Thread t=new Thread(tt1);
        t.setName("Child");
       // tt1.start();
        t.start();
        
		try {
			for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);  
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.activeCount());
	}

}
