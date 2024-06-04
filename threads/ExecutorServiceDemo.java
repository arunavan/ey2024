package com.ey.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread implements Runnable {
	
	public void run() {
		for(int i=0;i<=5;i++)
			System.out.println(Thread.currentThread().getName());
	}
}

class FactorialTask implements Callable<Integer> {
int number=5;
public Integer call() {
	int fact = 1;
	for(int count = number; count > 1; count--) {
		fact = fact * count;
	}
	return fact;
}
}
public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException,ExecutionException{
		
		
		
	//	MyThread t1=new MyThread();
	//	Thread t=new Thread(t1);
	//	t.start();
		
	//	for(int i=0;i<=5;i++)
		//System.out.println(Thread.currentThread().getName());
		
		ExecutorService es = Executors.newSingleThreadExecutor();
				//.newScheduledThreadPool(corePoolSize)
			//	newCachedThreadPool()
			//	newFixedThreadPool(10);
				
		//Runnable t1= new MyThread();
		//es.execute(t1);
		
		
		
		Callable c1=new FactorialTask();
	//	es.execute(arg0);
		Future f=es.submit(c1);
		System.out.println(f.get());
		
		es.shutdown();
		

	}

}
