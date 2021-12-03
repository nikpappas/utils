package com.nikpappas.utils.collection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TripletTest {
    @Test
    void testPrimitiveInt() {
        Triplet<Integer, Integer, Integer> triplet = Triplet.of(1, 20, 100);
        assertEquals(1, triplet._1);
        assertEquals(20, triplet._2);
        assertEquals(100, triplet._3);
    }

    @Test
    void testPrimitiveIntNegative() {
        Triplet<Integer, Integer, Integer> triplet = Triplet.of(-1, 20, -100);
        assertEquals(-1, triplet._1);
        assertEquals(20, triplet._2);
        assertEquals(-100, triplet._3);
    }

    @Test
    void testPrimitiveDoube() {
        Triplet<Double, Double, Double> triplet = Triplet.of(-1.2, 20.222222, 999.999);
        assertEquals(-1.2, triplet._1);
        assertEquals(20.222222, triplet._2);
        assertEquals(999.999, triplet._3);
    }

    @Test
    void testToString() {
        String actual = Triplet.of(-1, 20, -100).toString();

        assertEquals("(-1,20,-100)", actual);
    }

    @Test
    void testEquals() {
        assertEquals(Triplet.of(0.1, 0.2, -0.5), Triplet.of(0.1, 0.2, -0.5));
        assertEquals(Triplet.of(0.1f, 0.2f, "Lalalal"), Triplet.of(0.1f, 0.2f, "Lalalal"));
        assertEquals(Triplet.of(1L, -198L, Couple.of(1, 2)), Triplet.of(1L, -198L, Couple.of(1, 2)));
        assertEquals(Triplet.of("1L", "-198L", Pair.of(1, "Hello World")), Triplet.of("1L", "-198L", Pair.of(1, "Hello World")));
    }

    @Test
    void testHash() {
        assertEquals(Triplet.of(0.1, 0.2, -0.5).hashCode(), Triplet.of(0.1, 0.2, -0.5).hashCode());
        assertEquals(Triplet.of(0.1f, 0.2f, "Lalalal").hashCode(), Triplet.of(0.1f, 0.2f, "Lalalal").hashCode());
        assertEquals(Triplet.of(1L, -198L, Couple.of(1, 2)).hashCode(), Triplet.of(1L, -198L, Couple.of(1, 2)).hashCode());
        assertEquals(Triplet.of("1L", "-198L", Pair.of(1, "Hello World")).hashCode(), Triplet.of("1L", "-198L", Pair.of(1, "Hello World")).hashCode());
    }


}