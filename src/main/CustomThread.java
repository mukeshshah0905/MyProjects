package main;

public class CustomThread {
    public static void main(String[] args) {
        ThreadA tha=new ThreadA();
        ThreadB thb=new ThreadB();
        tha.start();
        thb.start();
    }
}
class ThreadA extends Thread{
    @Override
    public void run() {
        Thread th=Thread.currentThread();
        for(int i=0;i<10;i++){
            System.out.println("ThreadA-"+i+" "+"Name-"+th.getName());
        }
    }
}
class ThreadB extends Thread{
    @Override
    public void run() {
        Thread th1=Thread.currentThread();
        for(int i=0;i<10;i++){
            System.out.println("ThreadB-"+i+" "+"Name-"+th1.getName());
        }
    }
}