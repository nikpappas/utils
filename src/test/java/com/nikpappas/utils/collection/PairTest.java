package com.nikpappas.utils.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairTest {

    @Test
    public void testPrimitiveInt() {
        Pair<Integer, Integer> p = Pair.of(1, 20);
        assertEquals(1, p._1);
        assertEquals(20, p._2);
    }

    @Test
    public void testPrimitiveIntNegative() {
        Pair<Integer, Integer> p = Pair.of(-1, 20);
        assertEquals(-1, p._1);
        assertEquals(20, p._2);
    }

    @Test
    public void testPrimitiveDoube() {
        Pair<Double, Double> p = Pair.of(-1.2, 20.222222);
        assertEquals(-1.2, p._1);
        assertEquals(20.222222, p._2);
    }

}