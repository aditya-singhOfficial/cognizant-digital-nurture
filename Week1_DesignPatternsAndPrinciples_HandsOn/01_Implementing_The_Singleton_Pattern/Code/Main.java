public class Main {

    public static void main(String[] args) {

        Logger loggerA = Logger.getInstance();
        Logger loggerB = Logger.getInstance();

        if (loggerA == loggerB) {
            System.out.println("Both references point to the same object.");
        } else {
            System.out.println("Different Logger objects found.");
        }

        System.out.println();

        testSingleton(loggerA, loggerB);
    }

    public static void testSingleton(Logger loggerA, Logger loggerB) {

        loggerA.saveCredentials("rahul", "pass456");
        loggerB.saveCredentials("aditya", "pass123");

        System.out.println("Logger A Details:");
        loggerA.printCredentials();

        System.out.println("-------------------------");

        System.out.println("Logger B Details:");
        loggerB.printCredentials();

        System.out.println("\nSince Logger follows the Singleton pattern, both references share the same data.");
    }
}