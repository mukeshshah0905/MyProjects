package main.String.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String s="arora";
        String rev="";
      //first way
        for(int i=s.length()-1;i>=0;i--){
               rev=rev+s.charAt(i);
        }
        if(rev.trim().equals(s.trim())){
            System.out.println("Yes");
        }
        //second way
        StringBuffer sb=new StringBuffer("arora");
        System.out.println(sb.reverse().toString().equals(s));
    }
}
