package com.example.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseMathTest {
    @Test
    void _マイナス1を渡すと例外が発生する() {
        // 準備
        ExerciseMath exercise = new ExerciseMath();
        // 実行
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> exercise.factorial(-1));
        // 検証
        assertEquals("0以下は不正な値です", exception.getMessage());
    }

    @Test
    void _0を渡すと例外が発生する() {
        // 準備
        ExerciseMath exercise = new ExerciseMath();
        // 実行
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> exercise.factorial(0));
        // 検証
        assertEquals("0以下は不正な値です", exception.getMessage());
    }

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

    @Test
    void _4を渡すと24が返る () {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();
        // 実行
        int actual = exerciseMath.factorial(4);
        // 検証
        assertEquals(24, actual);
    }

    @Test
    void _11を渡すと39916800が返る () {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();
        // 実行
        int actual = exerciseMath.factorial(11);
        // 検証
        assertEquals(39916800, actual);
    }

    @Test
    void _12を渡すと479001600が返る() {
        // 準備
        ExerciseMath exerciseMath = new ExerciseMath();
        // 実行
        int actual = exerciseMath.factorial(12);
        // 検証
        assertEquals(479001600, actual);
    }

    @Test
    void _13を渡すと例外が発生する() {
        // 準備
        ExerciseMath exercise = new ExerciseMath();
        // 実行
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> exercise.factorial(13));
        // 検証
        assertEquals("最大値を超えています", exception.getMessage());
    }

    @Test
    void _14を渡すと例外が発生する() {
        // 準備
        ExerciseMath exercise = new ExerciseMath();
        // 実行
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> exercise.factorial(14));
        // 検証
        assertEquals("最大値を超えています", exception.getMessage());
    }
}
