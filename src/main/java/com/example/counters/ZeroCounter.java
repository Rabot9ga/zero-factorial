package com.example.counters;

public class ZeroCounter extends Counter {

    public ZeroCounter(int n) {
        super(n);
    }

    @Override
    public int countZeros() {
        int result = 0;
        for (int i = 1; i < n + 1; i++) {
            result += getDiv5(i);
        }
        return result;
    }

    private int getDiv5(int i) {

        int div5 = 0;
        while (i % 5 == 0) {
            i /= 5;
            div5++;
        }
        return div5;
    }
}
