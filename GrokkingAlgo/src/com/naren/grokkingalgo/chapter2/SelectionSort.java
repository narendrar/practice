package com.naren.grokkingalgo.chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(3);
        integers.add(1);
        integers.add(10);
        integers.add(4);

        SmallestFinder smallestFinder = new SmallestFinder();
        List<Integer> sortedIntegers = new ArrayList<>();
        int size = integers.size();
        for(int i = 0 ; i < size ; i++){
            Integer smallest = smallestFinder.findSmallest(integers);
            sortedIntegers.add(integers.get(smallest));
            integers.remove(integers.get(smallest));
        }

        System.out.print(Arrays.toString(sortedIntegers.toArray()));
    }
}
