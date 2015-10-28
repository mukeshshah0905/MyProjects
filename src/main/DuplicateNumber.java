package main;

import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumber {
 
        public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(new Integer(10));
        numbers.add(new Integer(5));
        numbers.add(new Integer(7));
        numbers.add(new Integer(8));
        numbers.add(new Integer(5));
        finddupe(numbers);
        }
        private static void finddupe(List<Integer> numbers){
        List<Integer> withoutdupes = new ArrayList<Integer>();
        for(Integer i:numbers){
        if(withoutdupes.contains(i)) 
            System.out.println( "This is duplicate :"+i);
        else withoutdupes.add(i);
        }

        }
        }