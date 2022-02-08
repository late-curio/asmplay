rm Main.class
mvn clean install
javac Main.java
java -javaagent:"/target/asmplay-1.0.jar" Main
