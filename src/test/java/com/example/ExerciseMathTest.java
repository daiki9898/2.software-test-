package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseMathTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testFactorial1() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath.factorial(-1));
        assertEquals("0以下の値は不正です", expectedException.getMessage(), "TC1:期待値と実際の結果が異なります");
    }

    @Test
    void testFactorial2() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () -> ExerciseMath.factorial(0));
        assertEquals("0以下の値は不正です", expectedException.getMessage(), "TC2:期待値と実際の結果が異なります");
    }
}