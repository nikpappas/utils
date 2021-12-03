package com.nikpappas.utils.collection;

public class Triplet<T, V, U> {
    public final T _1;
    public final V _2;
    public final U _3;

    private Triplet(T _1, V _2, U _3) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
    }

    public static <X, Y, Z> Triplet<X, Y, Z> of(X _1, Y _2, Z _3) {
        return new Triplet<>(_1, _2, _3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triplet<?, ?, ?> triplet = (Triplet<?, ?, ?>) o;

        if (_1 != null ? !_1.equals(triplet._1) : triplet._1 != null) return false;
        if (_2 != null ? !_2.equals(triplet._2) : triplet._2 != null) return false;
        return _3 != null ? _3.equals(triplet._3) : triplet._3 == null;
    }

    @Override
    public int hashCode() {
        int result = _1 != null ? _1.hashCode() : 0;
        result = 31 * result + (_2 != null ? _2.hashCode() : 0);
        result = 31 * result + (_3 != null ? _3.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "(" +
                _1 + "," +
                _2 + "," +
                _3 +
                ')';
    }


}
