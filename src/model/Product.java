package model;

import java.util.Objects;

import static java.util.UUID.randomUUID;

public abstract class Product {
    private final String id;
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.id = randomUUID().toString();
        this.name = name;
        this.price = price;
    }

    abstract Double calculateDiscount();

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
