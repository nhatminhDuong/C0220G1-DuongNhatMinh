package com.codegym.service;

import com.codegym.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Charmander", 26.2f, "images/1_charmander.jpg"));
        products.put(2, new Product(2, "Squirtle", 18.8f, "images/2_squirtle.jpg"));
        products.put(3, new Product(3, "Pikachu", 35f, "images/3_pikachu.jpg"));
        products.put(4, new Product(4, "Bulbasaur", 22.7f, "images/4_bulbasaur.jpg"));
        products.put(5, new Product(5, "Togepi", 20f, "images/5_togepi.jpg"));
    }

    public static int getProductsSize() {
        return products.size();
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}