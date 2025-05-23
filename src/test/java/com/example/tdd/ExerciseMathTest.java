package com.example.tdd;

import com.example.tdd.ExerciseMath;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseMathTest {
//    @Test
//    void _-1を渡すと例外が発生する() {
//        // 準備
//        ExerciseMath exercise = new ExerciseMath();
//
//        // 実行
//
//        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
//                () -> exercise.factorial(-1));
//        // 検証
//        assertEquals("0以下は不正な値です", exception.getMessage());
//    }

    @Test
    void _1を渡すと1が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();
        // 実行
        int actual = exerciseMath.factorial(1);
        // 検証
        assertEquals(1, actual);
    }

    @Test
    void _2を渡すと2が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();
        // 実行
        int actual = exerciseMath.factorial(2);
        // 検証
        assertEquals(2, actual);
    }

    @Test
    void _3を渡すと6が返る () {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();
        // 実行
        int actual = exerciseMath.factorial(3);
        // 検証
        assertEquals(6, actual);
    }
}
