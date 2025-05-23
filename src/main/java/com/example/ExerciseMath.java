package com.example;

public class ExerciseMath {
    private static final int MAX_NUM = 13;

    public static long factorial(int n) {
        if (lessThan0(n)) {
            throw new IllegalArgumentException("0以下の値は不正です");
        }
        if (n == 1) {
            return 1;
        }
        if (n == MAX_NUM) {
            throw new IllegalArgumentException("不正な値です");
        }

        return n * factorial(n - 1);
    }

    private static boolean lessThan0(int n) {
        return n <= 0;
    }
}
