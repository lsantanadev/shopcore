package model;

import interfaces.Taxable;

public class PhysicalProduct extends Product implements Taxable {
    private double weightKg;

    private static final double WEIGHT_THRESHOLD = 5.0;
    private static final double BULK_DISCOUNT_RATE = 0.05;

    public PhysicalProduct(String name, Double price, Double weightKg) {
        super(name, price);
        this.weightKg = weightKg;
    }

    @Override
    public String toString() {
        return "PhysicalProduct{" +
                "weightKg=" + weightKg +
                "} " + super.toString();
    }

    public Double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Double weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    Double calculateDiscount() {
        if (this.weightKg > WEIGHT_THRESHOLD) {
            return BULK_DISCOUNT_RATE;
        }

        return 0.0;
    }

    @Override
    public double calculateTax() {
        return 0.12;
    }
}
