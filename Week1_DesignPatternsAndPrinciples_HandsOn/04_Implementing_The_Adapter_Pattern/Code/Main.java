public class Main {
    public static void main(String[] args) {

        PaymentProcessor paymentProcessor = new GpayAdapter();
        paymentProcessor.processPayment(4500.00);

        System.out.println();

        paymentProcessor = new PhonepeAdapter();
        paymentProcessor.processPayment(4000.00);
    }
}
