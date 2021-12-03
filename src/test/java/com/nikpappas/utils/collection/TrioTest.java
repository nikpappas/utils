package com.nikpappas.utils.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrioTest {
    @Test
    void testPrimitiveInt() {
        Trio<Integer> trio = Trio.of(1, 20, 100);
        assertEquals(1, trio._1);
        assertEquals(20, trio._2);
        assertEquals(100, trio._3);
    }

    @Test
    void testPrimitiveIntNegative() {
        Trio<Integer> trio = Trio.of(-1, 20, -100);
        assertEquals(-1, trio._1);
        assertEquals(20, trio._2);
        assertEquals(-100, trio._3);
    }

    @Test
    void testPrimitiveDoube() {
        Trio<Double> trio = Trio.of(-1.2, 20.222222, 500.000);
        assertEquals(-1.2, trio._1);
        assertEquals(20.222222, trio._2);
        assertEquals(500.000, trio._3);
    }

    @Test
    void testToString() {
        String actual = Trio.of(-1, 20, -100).toString();

        assertEquals("(-1,20,-100)", actual);
    }

    @Test
    void testEquals() {
        assertEquals(Trio.of(0.1, 0.2, -0.5), Trio.of(0.1, 0.2, -0.5));
        assertEquals(Trio.of(0.1f, 0.2f, "Lalalal"), Trio.of(0.1f, 0.2f, "Lalalal"));
        assertEquals(Trio.of(1L, -198L, Couple.of(1, 2)), Trio.of(1L, -198L, Couple.of(1, 2)));
        assertEquals(Trio.of("1L", "-198L", Pair.of(1, "Hello World")), Trio.of("1L", "-198L", Pair.of(1, "Hello World")));
    }

    @Test
    void testHash() {
        assertEquals(Trio.of(0.1, 0.2, -.05).hashCode(), Trio.of(0.1, 0.2, -.05).hashCode());
        assertEquals(Trio.of(0.1f, 0.2f, "Lalalal").hashCode(), Trio.of(0.1f, 0.2f, "Lalalal").hashCode());
        assertEquals(Trio.of(1L, -198L, Couple.of(1, 2)).hashCode(), Trio.of(1L, -198L, Couple.of(1, 2)).hashCode());
        assertEquals(Trio.of("1L", "-198L", Pair.of(1, "Hello World")).hashCode(), Trio.of("1L", "-198L", Pair.of(1, "Hello World")).hashCode());
    }


}