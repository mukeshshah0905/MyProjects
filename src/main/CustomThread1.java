package main;

public class CustomThread1  {
    
    public static void main(String[] args) {
       ThreadA1 tha=new ThreadA1();
        Thread th=new Thread(tha);
        th.start();
        ThreadB1 thb=new ThreadB1();
        Thread th1=new Thread(thb);
        th1.start();
       /* Runnable rn=new Runnable() {
           
            @Override
            public void run() {
                System.out.println("from runnable");
                ThreadA tha=new ThreadA();
                tha.start();
                ThreadB thb=new ThreadB();
                thb.start();
            }
        };*/
        /*Thread th=new Thread(rn);
        th.start();*/
    }
   
}
class ThreadA1 implements Runnable{
    
    @Override
    public void run() {
        Thread th=Thread.currentThread();
        for(int i=0;i<10;i++){
            System.out.println("ThreadA-"+i+" "+"Name-"+th.getName());
        }
    }
}
class ThreadB1 implements Runnable{
    @Override
    public void run() {
        Thread th1=Thread.currentThread();
        for(int i=0;i<10;i++){
            System.out.println("ThreadB-"+i+" "+"Name-"+th1.getName());
        }
    }
}