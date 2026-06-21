public class GPayPayment implements PaymentStrategy {

    private String mobileNumber;

    public GPayPayment(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of Rs." + amount + " completed using GPay.");
    }
}