package DesignPatternExamples.singleton;

public class Main {
    static void main() {
        Logger logger = Logger.getLogger();
        logger.log("Singleton design pattern");


        Logger b = Logger.getLogger();
        b.log("Check, same instance of logger");
    }
}
