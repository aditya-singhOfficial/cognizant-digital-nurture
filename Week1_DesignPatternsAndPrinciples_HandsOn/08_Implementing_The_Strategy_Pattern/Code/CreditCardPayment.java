public class CreditCardPayment implements PaymentStrategy {

    private String cardNo;
    private String holderName;

    public CreditCardPayment(String cardNo, String holderName) {
        this.cardNo = cardNo;
        this.holderName = holderName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of Rs." + amount + " completed using Credit Card.");
    }
}