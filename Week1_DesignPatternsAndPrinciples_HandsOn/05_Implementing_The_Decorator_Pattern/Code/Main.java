public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();

        Notifier smsNotifier = new SmsNotifierDecorator(notifier);

        Notifier whatsappNotifier = new WhatsappNotifierDecorator(smsNotifier);

        whatsappNotifier.send("Hello");
    }
}