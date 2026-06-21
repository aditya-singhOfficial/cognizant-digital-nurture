public class Main {

    public static void main(String[] args) {

        System.out.println("Strategy Pattern - Payment Example");
        System.out.println("----------------------------------");

        PaymentStrategy cardPayment =
                new CreditCardPayment("9876-5432-1234-5678", "Aditya Singh");

        PaymentStrategy gpayPayment =
                new GPayPayment("9876543210");

        PaymentContext context = new PaymentContext(cardPayment);
        context.makePayment(500);

        System.out.println();

        context = new PaymentContext(gpayPayment);
        context.makePayment(1200);
    }
}