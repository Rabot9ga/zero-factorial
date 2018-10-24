package com.example.cli;

import com.example.counters.*;

public class ArgumentParser {

    public static Counter getCounter(Arguments arguments){
        int factorial = Integer.parseInt(arguments.getFactorial());

        CounterType counterType = arguments.getCounterName();

        if (counterType == CounterType.SMART){
            return new SmartCounter(factorial);
        }
        if (counterType == CounterType.DUMMY){
            return new DummyCounter(factorial);
        }
        if (counterType == CounterType.ZERO){
            return new ZeroCounter(factorial);
        }
        throw new RuntimeException("This should never happen");
    }

}
