public class WhatsappNotifierDecorator extends NotifierDecorator {
    public WhatsappNotifierDecorator(Notifier decoratorNotifier) {
        super(decoratorNotifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendWhatsappMessage(message);
    }

    public void sendWhatsappMessage(String message) {
        System.out.println("Whatsapp Message : " + message);
    }
}
