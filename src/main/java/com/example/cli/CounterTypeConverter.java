package com.example.cli;

import com.example.counters.CounterType;
import picocli.CommandLine;

public class CounterTypeConverter implements CommandLine.ITypeConverter<CounterType> {

    @Override
    public CounterType convert(String value) throws Exception {
        String typeName = value.toUpperCase();

        return CounterType.valueOf(typeName);
    }
}
