usejava8
cd asm-lib
./gradlew clean build publishToMavenLocal
cd ../asm-agent
mvn clean install
usejava17
cd ../asm-main
./gradlew clean build
cd ..
java -javaagent:"asm-agent/target/asmplay-1.0.jar" -cp asm-main/app/build/libs/app.jar:asm-lib/lib/build/libs/lib.jar asm.main.App
