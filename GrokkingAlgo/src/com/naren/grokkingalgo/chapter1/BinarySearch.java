package com.naren.grokkingalgo.chapter1;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        list.add(15);
        BinarySearch binarySearch = new BinarySearch();
        Integer location = binarySearch.binarySearch(list, 20);
        System.out.print(location.intValue());
        StringBuffer sb = new StringBuffer("abcde");
        sb.reverse();

    }

    private Integer binarySearch(List<Integer> list , Integer item){
        Integer low = 0;
        Integer high = list.size() -1 ;
        while (low < high){
            Integer mid = (low + high )/2;
            Integer guess = list.get(mid);
            if(guess.equals(item))
                return mid;
            if(guess > item)
                high = mid - 1;
            else
                low = mid+1;

        }
        return 0;

    }
}
