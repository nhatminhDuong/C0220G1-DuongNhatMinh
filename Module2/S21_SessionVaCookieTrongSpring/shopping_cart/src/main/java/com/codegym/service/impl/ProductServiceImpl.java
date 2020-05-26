package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
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
        products.put(1, new Product(1, "Charmander", 26.2, "images/1_charmander.jpg"));
        products.put(2, new Product(2, "Squirtle", 18.8, "images/2_squirtle.jpg"));
        products.put(3, new Product(3, "Pikachu", 35.0, "images/3_pikachu.jpg"));
        products.put(4, new Product(4, "Bulbasaur", 22.7, "images/4_bulbasaur.jpg"));
        products.put(5, new Product(5, "Togepi", 20.0, "images/5_togepi.jpg"));
        products.put(6, new Product(6, "Chikorita", 32.0, "images/6_chikorita.jpg"));
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
    public Product findById(Integer id) {
        return products.get(id);
    }

    @Override
    public void update(Integer id, Product product) {
        products.put(id, product);
    }

    @Override
    public void delete(Integer id) {
        products.remove(id);
    }
}