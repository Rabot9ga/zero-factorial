## Factorial trailing zero counter
#### Build:
``` bash
./gradlew clean build
```

#### Run:
``` bash
java -jar build/libs/zero-factorial-1.0-SNAPSHOT-all.jar [-c=smart] [N]

Usage:
    -c, --counter=NAME  Counter type, one of the following values:
                        dummy, zero, smart
```



#### JMH test:
``` bash 
./gradlew jmh
```
Benchmarks were performed using n=10000

| Benchmark             | Mode | Cnt | Score         | Error   | Units |
|-----------------------|------|-----|---------------|---------|-------|
| PerfTest.dummyCounter | avgt | 15  | 273066.836 ±  | 886.072 | us/op |
| PerfTest.smartCounter | avgt | 15  | 6.014 ±       | 0.033   | us/op |
| PerfTest.zeroCounter  | avgt | 15  | 14.923 ±      | 0.072   | us/op |


