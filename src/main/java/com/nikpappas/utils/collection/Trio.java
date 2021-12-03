package com.nikpappas.utils.collection;

public class Trio<T> {
    public final T _1;
    public final T _2;
    public final T _3;

    private Trio(T _1, T _2, T _3) {
        this._1 = _1;
        this._2 = _2;
        this._3 = _3;
    }

    public static <X> Trio<X> of(X _1, X _2, X _3) {
        return new Trio<>(_1, _2, _3);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trio<?> trio = (Trio<?>) o;

        if (_1 != null ? !_1.equals(trio._1) : trio._1 != null) return false;
        if (_2 != null ? !_2.equals(trio._2) : trio._2 != null) return false;
        return _3 != null ? _3.equals(trio._3) : trio._3 == null;
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
