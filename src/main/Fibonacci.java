package main;

class Fibonacci {
    public static void main(String args[]) {
        int pre,next,sum,n;
        pre=0;next=1;n=10;
        for(int i=1;i<=n;i++){
            System.out.println(pre);
            sum=pre+next;
            pre=next;
            next=sum;
        }
    }
}