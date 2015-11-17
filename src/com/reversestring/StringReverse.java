package com.reversestring;

public class StringReverse {
    public static void main(String[] args) {
        String str="hello";
        char [] strArray=str.toCharArray();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(strArray[i]);
        }
    }
}
