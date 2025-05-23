package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @BeforeAll
    static void setUpBeforeClass() {
        System.out.println("- MathUtilsのテスト開始 -");
    }

    @AfterAll
    static void setUpAfterClass() {
        System.out.println("- MathUtilsのテスト終了 -");
    }

    @BeforeEach
    void setUp() {
        System.out.println("テストメソッドの実行");
    }

    @AfterEach
    void tearDown() {
        System.out.println("テストメソッドの終了");
    }

    @Test
    void testPower1() {
        double actualAnswer = MathUtils.power(0, -2);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC1:期待値と実際の結果が異なります");
    }

    @Test
    void testPower2() {
        double actualAnswer = MathUtils.power(0, -1);
        assertEquals(Double.POSITIVE_INFINITY, actualAnswer, "TC2:期待値と実際の結果が異なります");
    }

    @Test
    void testPower3() {
        double actualAnswer = MathUtils.power(0, 0);
        assertEquals(1, actualAnswer, "TC3:期待値と実際の結果が異なります");
    }

    @Test
    void testPower4() {
        double actualAnswer = MathUtils.power(0, 1);
        assertEquals(0, actualAnswer, "TC4:期待値と実際の結果が異なります");
    }

    @Test
    void testPower5() {
        double actualAnswer = MathUtils.power(0, 2);
        assertEquals(0, actualAnswer, "TC5:期待値と実際の結果が異なります");
    }

    @Test
    void testPower6() {
        double actualAnswer = MathUtils.power(1, -2);
        assertEquals(1, actualAnswer, "TC6:期待値と実際の結果が異なります");
    }

    @Test
    void testPower7() {
        double actualAnswer = MathUtils.power(1, -1);
        assertEquals(1, actualAnswer, "TC7:期待値と実際の結果が異なります");
    }

    @Test
    void testPower8() {
        double actualAnswer = MathUtils.power(1, 0);
        assertEquals(1, actualAnswer, "TC8:期待値と実際の結果が異なります");
    }

    @Test
    void testPower9() {
        double actualAnswer = MathUtils.power(1, 1);
        assertEquals(1, actualAnswer, "TC9:期待値と実際の結果が異なります");
    }

    @Test
    void testPower10() {
        double actualAnswer = MathUtils.power(1, 2);
        assertEquals(1, actualAnswer, "TC10:期待値と実際の結果が異なります");
    }

    @Test
    void testPower11() {
        double actualAnswer = MathUtils.power(-1, -2);
        assertEquals(1, actualAnswer, "TC11:期待値と実際の結果が異なります");
    }

    @Test
    void testPower12() {
        double actualAnswer = MathUtils.power(-1, -1);
        assertEquals(-1, actualAnswer, "TC12:期待値と実際の結果が異なります");
    }

    @Test
    void testPower13() {
        double actualAnswer = MathUtils.power(-1, 0);
        assertEquals(1, actualAnswer, "TC13:期待値と実際の結果が異なります");
    }

    @Test
    void testPower14() {
        double actualAnswer = MathUtils.power(-1, 1);
        assertEquals(-1, actualAnswer, "TC14:期待値と実際の結果が異なります");
    }

    @Test
    void testPower15() {
        double actualAnswer = MathUtils.power(-1, 2);
        assertEquals(1, actualAnswer, "TC15:期待値と実際の結果が異なります");
    }

    @Test
    void testPower16() {
        double actualAnswer = MathUtils.power(2, -2);
        assertEquals(0.25, actualAnswer, "TC16:期待値と実際の結果が異なります");
    }

    @Test
    void testPower17() {
        double actualAnswer = MathUtils.power(2, -1);
        assertEquals(0.5, actualAnswer, "TC17:期待値と実際の結果が異なります");
    }

    @Test
    void testPower18() {
        double actualAnswer = MathUtils.power(2, 0);
        assertEquals(1, actualAnswer, "TC18:期待値と実際の結果が異なります");
    }

    @Test
    void testPower19() {
        double actualAnswer = MathUtils.power(2, 1);
        assertEquals(2, actualAnswer, "TC19:期待値と実際の結果が異なります");
    }

    @Test
    void testPower20() {
        double actualAnswer = MathUtils.power(2, 2);
        assertEquals(4, actualAnswer, "TC20:期待値と実際の結果が異なります");
    }

    @Test
    void testPower21() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () ->MathUtils.power(100, 0));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC21:期待値と実際の結果が異なります");
    }

    @Test
    void testPower22() {
        IllegalArgumentException expectedException = assertThrows(IllegalArgumentException.class,
                () ->MathUtils.power(0, 100));
        assertEquals("100以上の値は不正です", expectedException.getMessage(), "TC22:期待値と実際の結果が異なります");
    }
}