public class Logger {

    private static Logger instance;

    private String userId;
    private String secretKey;

    private Logger() {
    }

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void saveCredentials(String userId, String secretKey) {
        this.userId = userId;
        this.secretKey = secretKey;
    }

    public void printCredentials() {
        System.out.println("User ID : " + userId);
        System.out.println("Secret Key : " + secretKey);
    }
}