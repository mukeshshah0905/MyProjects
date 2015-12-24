package com.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable{
	private String command;
	
	public WorkerThread(String command) {
		this.command=command;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
		processCommand();
		System.out.println(Thread.currentThread().getName()+" End. Command = "+command);
	}
	
	private void processCommand(){
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return this.command;
	}
}

public class SimpleThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService= Executors.newFixedThreadPool(5);
		for (int i = 0; i <10; i++) {
			WorkerThread workerThread=new WorkerThread(" "+i);
			executorService.execute(workerThread);
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {
			
		}
		System.out.println("Finish All thread");
	}
}
