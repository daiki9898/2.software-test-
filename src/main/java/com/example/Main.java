package com.example;

public class Main {
    public static void main(String[] args) {
        long factorial = ExerciseMath.factorial(11);
        double intMaxNum = Math.pow(2, 31) - 1;
        System.out.println(factorial);
        System.out.println(intMaxNum);

        if (factorial > intMaxNum) {
            System.out.println("でかすぎます");
        }
    }
}
