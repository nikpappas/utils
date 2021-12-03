package com.nikpappas.utils.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoupleTest {
    @Test
    void testPrimitiveInt() {
        Couple<Integer> c = Couple.of(1, 20);
        assertEquals(1, c._1);
        assertEquals(20, c._2);
    }

    @Test
    void testPrimitiveIntNegative() {
        Couple<Integer> c = Couple.of(-1, 20);
        assertEquals(-1, c._1);
        assertEquals(20, c._2);
    }

    @Test
    void testPrimitiveDoube() {
        Couple<Double> c = Couple.of(-1.2, 20.222222);
        assertEquals(-1.2, c._1);
        assertEquals(20.222222, c._2);
    }

    @Test
    void testEquals() {
        assertEquals(Couple.of(0.1, 0.2), Couple.of(0.1, 0.2));
        assertEquals(Couple.of(0.1f, 0.2f), Couple.of(0.1f, 0.2f));
        assertEquals(Couple.of(1L, -198L), Couple.of(1L, -198L));
        assertEquals(Couple.of("1L", "-198L"), Couple.of("1L", "-198L"));
    }

    @Test
    void testHash() {
        assertEquals(Couple.of(0.1, 0.2).hashCode(), Couple.of(0.1, 0.2).hashCode());
        assertEquals(Couple.of(0.1f, 0.2f).hashCode(), Couple.of(0.1f, 0.2f).hashCode());
        assertEquals(Couple.of(1L, -198L).hashCode(), Couple.of(1L, -198L).hashCode());
        assertEquals(Couple.of("1L", "-198L").hashCode(), Couple.of("1L", "-198L").hashCode());
    }


}