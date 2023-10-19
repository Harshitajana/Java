package org.example;

import my_mathematices.my_Math;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        my_Math myMath=new my_Math();
        System.out.println("Sum is : "+myMath.sumTwoNums(10,20));
        System.out.println("Multiply is :"+myMath.mulTwoNums(10,2));
    }
}