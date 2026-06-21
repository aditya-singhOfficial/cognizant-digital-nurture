public class ProxyImage implements Image {

    private RealImage actualImage;
    private String imageName;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
        showLoadingMessage();
    }

    private void showLoadingMessage() {
        System.out.println("Preparing " + imageName + "...");
    }

    @Override
    public void display() {

        if (actualImage == null) {
            actualImage = new RealImage(imageName);
        }

        actualImage.display();
    }
}