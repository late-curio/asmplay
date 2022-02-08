./gradlew clean build
java -javaagent:"../asm-agent/target/asmplay-1.0.jar" -jar app/build/libs/app.jar
