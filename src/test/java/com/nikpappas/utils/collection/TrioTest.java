package com.nikpappas.utils.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrioTest {
    @Test
    public void testPrimitiveInt() {
        Trio<Integer> trio = Trio.of(1, 20, 100);
        assertEquals(1, trio._1);
        assertEquals(20, trio._2);
        assertEquals(100, trio._3);
    }

    @Test
    public void testPrimitiveIntNegative() {
        Trio<Integer> trio = Trio.of(-1, 20, -100);
        assertEquals(-1, trio._1);
        assertEquals(20, trio._2);
        assertEquals(-100, trio._3);
    }

    @Test
    public void testPrimitiveDoube() {
        Couple<Double> c = Couple.of(-1.2, 20.222222);
        assertEquals(-1.2, c._1);
        assertEquals(20.222222, c._2);
    }

    @Test
    public void testToString() {
        String actual = Trio.of(-1, 20, -100).toString();

        assertEquals("(-1,20,-100)", actual);
    }

}