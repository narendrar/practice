package com.naren.grokkingalgo.chapter3;

public class CountDown {
    public static void main(String[] args) {
        int number = 10;
        countDown(number);

    }

    private  static  void countDown(int i){
        if (i <= 0)
            return;
        else countDown(i-1);
        System.out.print(i);



    }
}
