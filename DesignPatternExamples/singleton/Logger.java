package DesignPatternExamples.singleton;

public class Logger {
    private static Logger instance = null;
    private Logger() {}

    public static Logger getLogger() {
        if (instance == null) {
            // Thread safety / avoid race condition
            synchronized (Logger.class) {
                if(instance == null) {
                    instance = new Logger();
                    System.out.println("NEW INSTANCE OF LOGGER IS BEEN CREATED");
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
