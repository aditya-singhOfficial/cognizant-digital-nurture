public class RealImage implements Image {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void display() {
        System.out.println("Showing image: " + imageName);
    }
}