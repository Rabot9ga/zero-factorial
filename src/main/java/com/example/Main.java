package com.example;


import com.example.cli.ArgumentParser;
import com.example.cli.Arguments;
import com.example.counters.Counter;
import picocli.CommandLine;

public class Main {

    public static void main(String[] args) {

        Arguments arguments = new Arguments();
        new CommandLine(arguments).parse(args);
        Counter counter = ArgumentParser.getCounter(arguments);
        String counterName = String.format("Using %s counter", arguments.getCounterName());
        System.out.println(counterName);
        int i = counter.countZeros();
        String message = String.format("Number of trailing zeroes in %s! is %d", arguments.getFactorial(), i);
        System.out.println(message);
    }

}
