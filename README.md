ASM Play
========

This project encapsulates three sub projects.

1. ASM based agent project mostly stolen from Baeldung and tweaked that has a Maven build.
2. Arbitrary library project that needs to be built at published to Maven local via Gradle for other two projects to work.
3. Main project that uses the library and runs with the agent attached.

These are all cobbled together and ran via `run.sh` at same level as this README.

Requires SDK man being installed and a couple exported values for `JDK8` and `JDK17`:

```
export JDK8='8.0.292.hs-adpt'
export JDK17='17-open'
```