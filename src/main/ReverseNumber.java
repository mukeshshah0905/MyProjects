package main;

public class ReverseNumber {

    /*
     * public int reverseNumber(int number){
     * 
     * int reverse = 0; while(number != 0){ reverse = (reverse*10)+(number%10);
     * number = number/10; } return reverse; }
     */

    public static void main(String a[]) {
        /*
         * ReverseNumber nr = new ReverseNumber();
         * System.out.println("Result: "+nr.reverseNumber(17868));
         */
        System.out.println(Integer.parseInt(new StringBuffer(Integer.valueOf(17868).toString()).reverse().toString()));
        System.out.println(new StringBuffer(Integer.valueOf(45625).toString()).reverse().toString());
    }
}
