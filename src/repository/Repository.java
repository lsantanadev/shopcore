package repository;

import model.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Repository<T extends Product> {
    private HashMap<String, T> products;

    public Repository() {
        this.products = new HashMap<>();
    }

    public void add(T product) {
        String id = product.getId();
        products.putIfAbsent(id, product);
    }

    public Optional<T> findById(String id) {
        return Optional.ofNullable(products.get(id));
    }

    public List<T> listAll() {
        return products.values().stream()
                .toList();
    }

    public List<T> searchFor(Predicate<T> criterion) {
        return products.values().stream()
                .filter(criterion)
                .toList();
    }
}
