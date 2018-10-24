package com.example;

import com.example.counters.DummyCounter;
import com.example.counters.SmartCounter;
import com.example.counters.ZeroCounter;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@Warmup(iterations = 3, time = 5)
@BenchmarkMode(value = Mode.AverageTime)
@Measurement(iterations = 3, time = 10)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class PerfTest {

    private int n;

    @Setup
    public void prepare() {
        n = 10000;
    }


    @Benchmark
    public int dummyCounter() {
        final DummyCounter counter = new DummyCounter(n);
        return counter.countZeros();
    }

    @Benchmark
    public int zeroCounter() {
        final ZeroCounter counter = new ZeroCounter(n);
        return counter.countZeros();
    }

    @Benchmark
    public int smartCounter() {
        SmartCounter counter = new SmartCounter(n);
        return counter.countZeros();
    }
}
