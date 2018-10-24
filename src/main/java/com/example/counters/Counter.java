package com.example.counters;

public abstract class Counter {
    protected int n;

    public Counter(int n) {
        this.n = n;
    }

    public abstract int countZeros();
}
