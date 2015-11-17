package com.fibonacciseries;

public class FabonacciSeries {
    public static void main(String[] args) {
        int prev,next,sum,n;
        prev=0;next=1;n=10;
        System.out.println(prev);
        System.out.println(next);
        for(int i=2;i<=n;i++){
                sum=prev+next;
                System.out.println(sum);
                prev=next;
                next=sum;
        }
    }
}
