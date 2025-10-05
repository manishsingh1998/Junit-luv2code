package com.luv2code.tdd;

public class FizzBuzz {

    public static String compute(int n){

        if(n%(3*5)==0){
            return "FizzBuzz";
        }else if(n%3==0){
            return "Fizz";
        }else if(n%5==0){
            return "Buzz";
        }

        String s=Integer.toString(n);

        return s;
    }

}
