public class SingletonPatternExampleTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist! Singleton pattern failed.");
        }

        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
} 