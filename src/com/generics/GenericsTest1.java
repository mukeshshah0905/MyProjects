package com.generics;

import java.util.Arrays;
import java.util.Collection;

public class GenericsTest1 {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = GenericsTest1.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}
