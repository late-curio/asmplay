cd asm-agent
mvn clean install
cd ../asm-main
./gradlew clean build
cd ..
java -javaagent:"asm-agent/target/asmplay-1.0.jar" -cp asm-main/app/build/libs/app.jar:asm-lib/lib/build/libs/lib.jar asm.main.App
