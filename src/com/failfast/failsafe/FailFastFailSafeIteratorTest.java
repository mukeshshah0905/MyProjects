package com.failfast.failsafe;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastFailSafeIteratorTest {
    public static void main(String[] args) {
        //failFast();
        failSaif();
    }

    public static void failFast() {
        //Map<String, String> phones=new HashMap<String, String>();
        Map<String, String> phones=Collections.synchronizedMap(new HashMap<String, String>());
        phones.put("Apple", "iPhone 6S");
        phones.put("Sony", "Xperia C3");
        phones.put("Samsung", "Galaxy S1");
        
        for(String phone:phones.keySet()){
            System.out.println(phones.get(phone));
        }
       /* Set<String> keys=phones.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            System.out.println(phones.get(it.next()));
            phones.put("Motorola", "Moto G");
        }*/
    }

    public static void failSaif() {
        ConcurrentHashMap<String, String> phones=new ConcurrentHashMap<String, String>();
        phones.put("Apple", "iPhone 6S");
        phones.put("Sony", "Xperia C3");
        phones.put("Samsung", "Galaxy S1");
        
        Set<String> keys=phones.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            System.out.println(phones.get(it.next()));
            phones.put("Motorola", "Moto G");
        }
    }
}
