cd asm-agent
mvn clean install
cd ../asm-main
./gradlew clean build
java -javaagent:"../asm-agent/target/asmplay-1.0.jar" -classpath app/libs -jar app/build/libs/app.jar
