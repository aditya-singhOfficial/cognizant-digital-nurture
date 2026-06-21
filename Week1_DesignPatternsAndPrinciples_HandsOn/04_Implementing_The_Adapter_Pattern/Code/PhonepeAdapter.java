public class PhonepeAdapter implements PaymentProcessor {
    PhonepeGateway phonepeGateway;

    public PhonepeAdapter() {
        phonepeGateway = new PhonepeGateway();
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment Processing");
        phonepeGateway.pay(amount);
    }
}
