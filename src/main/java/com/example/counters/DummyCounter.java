package com.example.counters;

import java.math.BigInteger;

public class DummyCounter extends Counter {

    public DummyCounter(int n) {
        super(n);
    }

    public int countZeros() {
        BigInteger fact = new BigInteger("1");

        for (int i = 1; i < n + 1; i++) {
            fact = fact.multiply(new BigInteger(String.valueOf(i)));
        }


        int zeros = 0;
        while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            fact = fact.divide(BigInteger.TEN);
            zeros++;
        }
        return zeros;
    }


}

