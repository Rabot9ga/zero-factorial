##Factorial trailing zero counter
####Build:
``` bash
./gradlew clean build
```

####Run:
``` bash
java -jar build/libs/zero-factorial-1.0-SNAPSHOT-all.jar [-c=smart] [N]

Usage:
    -c, --counter=NAME  Counter type, one of the following values:
                        dummy, zero, smart
```



####JMH test:
``` bash 
./gradlew jmh
```

| Benchmark             | Mode | Cnt | Score     | Error | Units |
|-----------------------|------|-----|-----------|-------|-------|
| PerfTest.dummyCounter | avgt | 25  | 279.975 ± | 0.809 | ms/op |
| PerfTest.smartCounter | avgt | 25  | 0.006 ±   | 0.001 | ms/op |
| PerfTest.zeroCounter  | avgt | 25  | 0.015 ±   | 0.001 | ms/op |

