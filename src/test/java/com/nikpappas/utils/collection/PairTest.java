package com.nikpappas.utils.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairTest {

    @Test
    void testPrimitiveInt() {
        Pair<Integer, Integer> p = Pair.of(1, 20);
        assertEquals(1, p._1);
        assertEquals(20, p._2);
    }

    @Test
    void testPrimitiveIntNegative() {
        Pair<Integer, Integer> p = Pair.of(-1, 20);
        assertEquals(-1, p._1);
        assertEquals(20, p._2);
    }

    @Test
    void testPrimitiveDoube() {
        Pair<Double, Double> p = Pair.of(-1.2, 20.222222);
        assertEquals(-1.2, p._1);
        assertEquals(20.222222, p._2);
    }

    @Test
    void testEquals() {
        assertEquals(Pair.of(0.1, 0.2), Pair.of(0.1, 0.2));
        assertEquals(Pair.of(0.1f, 0.2f), Pair.of(0.1f, 0.2f));
        assertEquals(Pair.of(1L, -198L), Pair.of(1L, -198L));
        assertEquals(Pair.of(1L, "-198L"), Pair.of(1L, "-198L"));
    }

    @Test
    void testHash() {
        assertEquals(Pair.of(0.1, 0.2).hashCode(), Pair.of(0.1, 0.2).hashCode());
        assertEquals(Pair.of(0.1f, 0.2f).hashCode(), Pair.of(0.1f, 0.2f).hashCode());
        assertEquals(Pair.of(1L, -198L).hashCode(), Pair.of(1L, -198L).hashCode());
        assertEquals(Pair.of(1L, "-198L").hashCode(), Pair.of(1L, "-198L").hashCode());
    }


}