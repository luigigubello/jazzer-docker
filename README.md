# How To Use

Build the container

```
docker build -t jazzer-test .
```

Run the fuzzer

```
docker run -v $(pwd):/var/fuzzer -it jazzer-test ExampleFuzzer
```

### Links

- [GitHub - CodeIntelligenceTesting/jazzer: Coverage-guided, in-process fuzzing for the JVM](https://github.com/CodeIntelligenceTesting/jazzer)

- [Fuzzing Java code (JSoup) using Jazzer fuzzer - Java Security - YouTube](https://www.youtube.com/watch?v=Ai3wnnSFC-8)
