package com.education;

import java.util.*;
import java.lang.*;


public class Arrays {
    public static void main(String[] args) {
        System.out.println("--Task 5.1--");
        ArrayList<Integer> Number = new ArrayList<>();
        Number.add(6);
        Number.add(4);
        Number.add(4);
        Number.add(10);
        int AverageSum = 0;

        for (int Sum = 0; Sum < Number.size(); Sum++) {
            AverageSum += Number.get(Sum);
        }
        AverageSum = AverageSum / Number.size();
        System.out.print(AverageSum);
    }

}


class ArrayTaskTwo {
    public static void main(String[] args) {
        System.out.println("--Task 5.2--");
        int[] Array1 = {1, 2, 3, 4};
        int[] Array2 = {5, 6, 7};
        ArrayList<Integer> Arrays = new ArrayList<Integer>();
        for (int first : Array1) {
            Arrays.add(first);
        }
        for (int second : Array2) {
            Arrays.add(second);
        }
        System.out.print("Here is the result of merging given arrays: " + Arrays);
    }
}

class arrayTask3 {
    public static void main(String[] args) {
        System.out.println("--Task 5.3--");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            max = Math.max(max, array[i]);
        {
            System.out.print(max);
        }
    }
}