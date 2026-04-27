package model;

import interfaces.Taxable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PerishableProduct extends Product implements Taxable {
    private LocalDate expirationDate;

    public PerishableProduct(String name, Double price, LocalDate expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    Double calculateDiscount() {
        long daysUntilExpiration = ChronoUnit.DAYS.between(LocalDate.now(), this.expirationDate);

        if (daysUntilExpiration >= 0 && daysUntilExpiration < 7) {
            return 0.20;
        }

        return 0.0;
    }

    @Override
    public double calculateTax() {
        return 0.12;
    }
}
