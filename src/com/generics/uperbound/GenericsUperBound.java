package com.generics.uperbound;

import java.util.Arrays;
import java.util.List;

public class GenericsUperBound {
    /*public static void main(String[] args) {
        String s1="Mukesh";
        String s2=new String("Mukesh");
        String s3=s2.intern();
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
        char s4=s1.charAt(1);
        System.out.println(s4);
        int i=s1.codePointAt(2);
        System.out.println(i);
    }*/
    
    public static void main(String[] args) {
        List<Parent> plist=Arrays.asList(new Parent(1,"Mukesh"),new Parent(2,"Yesendra"),new Parent(3,"Niraj"));
        List<Child> clist=Arrays.asList(new Child(1,"Mukesh1"),new Child(2,"Yesendra"),new Child(3,"Niraj"));
        List<Other> olist=Arrays.asList(new Other(1,"Mukesh"),new Other(2,"Yesendra"),new Other(3,"Niraj"));
        addUper(clist);
    }
    
    public static void addUper(List<? extends Parent> list) {
        for(Parent plist:list){
            System.out.println(plist.getpName());
        }
    }
}
