package com.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.concurrency.Producer.Consumer;

class Message {
	String msg;

	public Message(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}

class Producer implements Runnable {

	private BlockingQueue<Message> blockingQueue;

	public Producer(BlockingQueue<Message> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Message message = new Message("" + i);
			try {
				Thread.sleep(i);
				blockingQueue.put(message);
				System.out.println("Produced :" + message.getMsg());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Message message = new Message("Exit");
		try {
			blockingQueue.put(message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	class Consumer implements Runnable {
		private BlockingQueue<Message> blockQueue;

		public Consumer(BlockingQueue<Message> blockingQueue) {
			this.blockQueue = blockingQueue;
		}

		@Override
		public void run() {
			Message msg;
			for (int i = 0; i < 10; i++) {
				try {
					while ((msg = blockingQueue.take()).getMsg() != "Exit") {
						Thread.sleep(10);
						System.out.println("Consumer :"+msg.getMsg());
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

public class ProducerConsumerService {
	public static void main(String[] args) {
		BlockingQueue<Message> blockingQueue=new ArrayBlockingQueue<Message>(10);
		Producer ps=new Producer(blockingQueue);
		Consumer con=ps.new Consumer(blockingQueue);
		new Thread(ps).start();
		new Thread(con).start();
	}
}
