ASM Play
========

This project encapsulates three sub projects.

1. ASM based agent project mostly stolen from Baeldung and tweaked that has a Maven build.
2. Arbitrary library project that needs to be built at published to Maven local via Gradle for other two projects to work.
3. Main project that uses the library and runs with the agent attached.

These are all cobbled together and ran via `run.sh` at same level as this README.

Requires a couple aliases:

1. `usejava8` - points to command that switches current JDK to 8
2. `usejava17` - points to command that switches current JDK to 17