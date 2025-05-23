package com.example.tdd;

public class ExerciseMath {
    public int factorial(int n) {
        final int MAX_NUM = 13;

        if (n <= 0) {
            throw new IllegalArgumentException("0以下は不正な値です");
        }
        if (n == 1) {
            return 1;
        }
        if (n >= MAX_NUM) {
            throw new IllegalArgumentException("最大値を超えています");
        }

        return n * factorial(n - 1);
    }
}
