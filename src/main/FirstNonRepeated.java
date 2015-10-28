package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class FirstNonRepeated {
    public static void main(String[] args) {
        char ch=firstNonRepeatingChar("teeter");
        System.out.println(ch);
    }
    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>(); 
        List<Character> nonRepeating = new ArrayList<>(); 
        for (int i = 0; i < word.length(); i++) { 
            char letter = word.charAt(i); 
            if (repeating.contains(letter)) { 
                continue; 
                } if (nonRepeating.contains(letter)) {
                    nonRepeating.remove((Character) letter); 
                    repeating.add(letter); 
                    } else {
                        nonRepeating.add(letter); 
                        } 
                } 
        return nonRepeating.get(0); 
        }

    /*public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        String s="teeter";
        char c=firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + c);
    }
    
    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer>  characterhashtable= 
                     new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  // Scan string and build hash table
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
            if(characterhashtable.containsKey(c))
            {
                // increment count corresponding to c
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        // Search characterhashtable  in order of string str
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            return c;
        }
        return null ;
    }*/
} 
