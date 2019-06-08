package com.naren.grokkingalgo.chapter3;

public class Factorial {

    public static void main(String[] args) {

        int number = 3;
        int fact = fact(number);
        System.out.print("Factorial of "+number+" is: "+ fact);

    }

    private static int fact(int number){
        if(number == 1)
            return number;
         return  number * fact(number -1);
    }
}
