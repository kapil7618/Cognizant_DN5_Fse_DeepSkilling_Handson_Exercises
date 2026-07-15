package exercise01.singleton;

/**
 * Singleton Logger class.
 * Uses the Initialization-on-demand holder idiom for thread-safety.
 */
public final class Logger {

    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Static inner class responsible for holding the singleton instance
    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }

    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
