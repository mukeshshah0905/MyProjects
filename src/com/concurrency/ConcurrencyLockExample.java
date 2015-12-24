package com.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample {
	public static void main(String[] args) {
		Resource rs=new Resource();
		ConcurrencyLock cl=new ConcurrencyLock(rs);
		Thread th1=new Thread(cl,"th1");
		th1.start();
		Thread th2=new Thread(cl,"th2");
		th2.start();
	}

}

class ConcurrencyLock implements Runnable {
	private Resource resource;
	private Lock lock;

	public ConcurrencyLock(Resource resource) {
		this.resource = resource;
		this.lock=new ReentrantLock();
	}

	@Override
	public void run() {
		try {
			/*synchronized (resource) {
				resource.doSomething();
			}*/
			if(lock.tryLock(10,TimeUnit.SECONDS)){
				resource.doSomething();
			}
			resource.doLogging();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}

class Resource {
	public void doSomething() {
		System.out.println("inside doSomething");
	}

	public void doLogging() {
		System.out.println("inside doLogging");
	}
}