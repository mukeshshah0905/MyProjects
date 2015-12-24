package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomic {
	public static void main(String[] args) throws InterruptedException{
		ProcessThread pt=new ProcessThread();
		Thread th1=new Thread(pt,"t1");
		Thread th2=new Thread(pt,"t2");
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println("Process Count :"+pt.getCount());
		System.out.println("Process Count :"+pt.getCount1());
	}
}
class ProcessThread implements Runnable{
	private AtomicInteger count = new AtomicInteger();
	private int count1;
	
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			processSomething(i);
			count1++;
			count.incrementAndGet();
			
		}
	}
	
	public int getCount(){
		return this.count.get();
	}
	
	public int getCount1(){
		return this.count1;
	}
	
	private void processSomething(int i){
		try {
			Thread.sleep(i*100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}