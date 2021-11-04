package com.nikpappas.utils.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoupleTest {
    @Test
    public void testPrimitiveInt() {
        Couple<Integer> c = Couple.of(1, 20);
        assertEquals(1, c._1);
        assertEquals(20, c._2);
    }

    @Test
    public void testPrimitiveIntNegative() {
        Couple<Integer> c = Couple.of(-1, 20);
        assertEquals(-1, c._1);
        assertEquals(20, c._2);
    }

    @Test
    public void testPrimitiveDoube() {
        Couple<Double> c = Couple.of(-1.2, 20.222222);
        assertEquals(-1.2, c._1);
        assertEquals(20.222222, c._2);
    }

}