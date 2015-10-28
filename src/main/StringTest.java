package main;

public class StringTest {

    public static void main(String[] args) {
        String s1="Hello";
        String s2="hello";
        String s3=new String("hello");
        String s4="hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("==========");
        System.out.println(s4.hashCode());
        System.out.println(s2==s3);
        System.out.println(s2==s4);
    }

}
