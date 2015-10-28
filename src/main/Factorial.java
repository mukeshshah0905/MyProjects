package main;

public class Factorial {
    public static void main(String[] args) {
        int result =1;
        int n=4;
        for(int i=1;i<=n;i++){
            result = result*i;
        }
        System.out.println(result);
    }
}
