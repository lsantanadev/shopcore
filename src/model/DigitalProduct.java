package model;

public class DigitalProduct extends Product {
    private int sizeMB;

    public DigitalProduct(String name, Double price, int sizeMB) {
        super(name, price);
        this.sizeMB = sizeMB;
    }

    @Override
    public String toString() {
        return "DigitalProduct{" +
                "sizeMB=" + sizeMB +
                "} " + super.toString();
    }

    public int getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(int sizeMB) {
        this.sizeMB = sizeMB;
    }

    @Override
    Double calculateDiscount() {
        return 0.10;
    }
}
