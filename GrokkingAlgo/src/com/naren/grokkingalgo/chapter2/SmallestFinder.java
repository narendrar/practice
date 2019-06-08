package com.naren.grokkingalgo.chapter2;

import java.util.ArrayList;
import java.util.List;

public class SmallestFinder {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(5);
        integers.add(3);
        integers.add(1);
        integers.add(10);
        integers.add(4);

        Integer smallest = integers.get(0);
        Integer smallest_index = 0;
        for(int start =1 ; start < integers.size() ; start++){
            if(smallest > integers.get(start)){
                smallest = integers.get(start);
                smallest_index = start;
            }
        }
        System.out.println("Smallest index : " + smallest_index + " smallest number : "+ smallest);

    }

    public Integer findSmallest(List<Integer> integers ){
        Integer smallest = integers.get(0);
        Integer smallest_index = 0;
        for(int start =1 ; start < integers.size() ; start++){
            if(smallest > integers.get(start)){
                smallest = integers.get(start);
                smallest_index = start;
            }
        }
        return smallest_index;
    }
}
