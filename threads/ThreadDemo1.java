package com.ey.threads;
class T1 extends Thread{//child 
	public void run() {
		//bL of thread 
		try {
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(500);  //sleeptimeout
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread.currentThread().setName("Ey-Main");
		System.out.println(Thread.currentThread().getName());
		T1 t1=new T1();  //1 born , new 
		//runnnable
		//t1.run(); cannot be invoked
		t1.setName("EY-User1");
		t1.start();  //to trigger run
		T1 t2=new T1();
		t2.setName("Ey-User2");
		t2.start();
		//t1.suspend();
		//t1.resume();
		//t1.interrupt();
	//	System.out.println(t1.isInterrupted());
	//	t1.setDaemon(true);//worker
	//	System.out.println(t1.isDaemon());// Pre emptive  Timslicing  
		t1.setPriority(Thread.MAX_PRIORITY);   //10 max   5 norm   1 min
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(Thread.activeCount());
		System.out.println(t1.isAlive());
		System.out.println(t1.getPriority()+ t1.getName()  +"  "  + t1.getId());
		//t1.stop();
	//	t2.stop();
		t1.yield();//pause
		try {
			t1.join(); //interrupted exception
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.activeCount());
		

	}

}
