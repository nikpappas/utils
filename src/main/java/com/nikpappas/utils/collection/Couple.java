package com.nikpappas.utils.collection;

public class Couple<T> {


    public final T _1;
    public final T _2;

    private Couple(T _1, T _2) {
        this._1 = _1;
        this._2 = _2;
    }

    public static <X> Couple<X> of(X _1, X _2) {
        return new Couple<>(_1, _2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Couple<?> couple = (Couple<?>) o;

        if (_1 != null ? !_1.equals(couple._1) : couple._1 != null) return false;
        return _2 != null ? _2.equals(couple._2) : couple._2 == null;
    }

    @Override
    public int hashCode() {
        int result = _1 != null ? _1.hashCode() : 0;
        result = 31 * result + (_2 != null ? _2.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "(" + _1 + ", " + _2 + ')';
    }
}
