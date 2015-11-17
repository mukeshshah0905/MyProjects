package com.produceconsumer1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerTest1 {
    public static void main(String[] args) {
        BlockingQueue bq = new LinkedBlockingQueue();

        Thread proThread = new Thread(new Producer(bq));
        Thread conThread = new Thread(new Consumer(bq));
        proThread.start();
        conThread.start();
    }
}

class Producer implements Runnable {

    private final  BlockingQueue sharedQueue;

    public Producer(BlockingQueue shQueue) {
        this.sharedQueue = shQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Producer :" + i);
                sharedQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Consumer implements Runnable {

    private final BlockingQueue sharedQueue;

    public Consumer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumer :" + sharedQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}