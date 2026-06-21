public class Main {

    public static void main(String[] args) {

        Image photo1 = new ProxyImage("nature.jpg");
        Image photo2 = new ProxyImage("mountain.jpg");

        photo1.display();
        photo2.display();

        System.out.println();

        photo1.display();
        photo2.display();
    }
}