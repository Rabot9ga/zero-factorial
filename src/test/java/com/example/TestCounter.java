package com.example;

import com.example.counters.Counter;
import com.example.counters.DummyCounter;
import com.example.counters.SmartCounter;
import com.example.counters.ZeroCounter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.function.Function;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestCounter {


    private int to;
    private int from;
    private volatile int[] dummyPreCalculate;


    @BeforeAll
    public void preCalc() throws InterruptedException {
        from = 1000;
        to = 10000;
        dummyPreCalculate = IntStream.rangeClosed(from, to)
                .parallel()
                .map(this::calcDummy)
                .toArray();
    }

    private int calcDummy(int i){
        return new DummyCounter(i).countZeros();
    }


    @Test
    public void testCounter() throws Exception {
        testSomeCounter(ZeroCounter::new);
    }


    @Test
    public void testSmartCounter() throws Exception {
        testSomeCounter(SmartCounter::new);
    }

    private void testSomeCounter(Function<Integer, Counter> func){
        IntStream.rangeClosed(from, to)
                .parallel()
                .forEach(value -> compareCounters(dummyPreCalculate[value - from], func.apply(value), value));
    }

    private void compareCounters(int count, Counter counter, int i) {
        assertEquals(count, counter.countZeros(), String.format("Counters didn't equals for: %s", i));
    }
}
