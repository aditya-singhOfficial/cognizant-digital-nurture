public class Main {

    public static void main(String[] args) {

        System.out.println("Computer Configuration Using Builder Pattern");
        System.out.println("--------------------------------------------");

        Computer.Builder pcBuilder = new Computer.Builder();

        pcBuilder.setCPU("Intel Core i5 12400F");
        pcBuilder.setRAM("16GB DDR4");
        pcBuilder.setSTORAGE("512GB NVMe SSD");

        Computer officePc = pcBuilder.build();
        System.out.println(officePc);

        System.out.println();

        pcBuilder = new Computer.Builder();

        pcBuilder.setCPU("AMD Ryzen 7 5800X");
        pcBuilder.setRAM("32GB DDR4");
        pcBuilder.setSTORAGE("1TB NVMe SSD");

        Computer gamingPc = pcBuilder.build();
        System.out.println(gamingPc);
    }
}