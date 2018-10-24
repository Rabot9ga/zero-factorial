package com.example.counters;

public class SmartCounter extends Counter {

    public SmartCounter(int n) {
        super(n);
    }

    @Override
    public int countZeros() {
        int result = 0;
        for (int i = 5; i < n + 1; i+=5) {
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
