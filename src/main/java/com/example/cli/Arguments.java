package com.example.cli;

import com.example.counters.CounterType;
import lombok.Data;
import picocli.CommandLine.Option;

import static picocli.CommandLine.Parameters;

@Data
public class Arguments {

    @Option(names = { "-c", "--counter" }, description = "Counter name [Dummy, Smart, Zero]", defaultValue = "Smart",
            converter = {CounterTypeConverter.class})
    private CounterType counterName;
    @Parameters(paramLabel = "factorial", defaultValue = "100")
    private String factorial;


}
