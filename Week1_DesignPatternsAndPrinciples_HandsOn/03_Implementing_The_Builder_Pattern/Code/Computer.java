public class Computer {

    private String processor;
    private String ram;
    private String storage;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;

        System.out.println("Computer configuration created.");
    }

    @Override
    public String toString() {
        return "Processor: " + processor +
                " | RAM: " + ram +
                " | Storage: " + storage;
    }

    static class Builder {

        private String processor;
        private String ram;
        private String storage;

        public Builder() {
            System.out.println("Preparing computer build...");
        }

        public void setCPU(String processor) {
            this.processor = processor;
        }

        public void setRAM(String ram) {
            this.ram = ram;
        }

        public void setSTORAGE(String storage) {
            this.storage = storage;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}