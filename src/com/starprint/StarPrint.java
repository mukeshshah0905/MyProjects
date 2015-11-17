package com.starprint;

import java.util.ArrayList;

public class StarPrint {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
           for(int k=0;k<=i;k++) {
               System.out.print("$ ");
           }
           System.out.println();  
       }
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        
        for(int i=0;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        ArrayList<Integer> list1=new ArrayList<Integer>();
        ArrayList<Integer> list2=new ArrayList<Integer>();
        list1.add(new Integer(1));
        list1.add(new Integer(2));
        list1.add(new Integer(3));
        list1.add(new Integer(4));
        list1.add(new Integer(5));
        list2.add(new Integer(3));
        list2.add(new Integer(5));
        list2.add(new Integer(10));
        list2.add(new Integer(7));
        for(Integer ls1:list1){
            
        }
    }
}
