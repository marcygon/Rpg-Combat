package com.katas.demo;

public class Fizzbuzz {

    public String fizzbuzz (Integer num){
        if((num%3 == 0) && (num%5== 0)){
            return "Fizzbuzz";
        } else if (num%5 == 0) {
            return "Buzz";
        } else if (num%3 == 0) {
            return "Fizz";
        }
        return Integer.toString(num);
    };
}
