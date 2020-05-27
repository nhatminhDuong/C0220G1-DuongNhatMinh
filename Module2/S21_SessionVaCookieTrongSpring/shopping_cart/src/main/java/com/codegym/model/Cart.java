package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Integer, Product> products = new HashMap<>();

    private Double totalPay = 0.0;

    public Cart() {
    }

    public Cart(HashMap<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Double getTotalPay() {
        return totalPay;
    }

    public Double updateTotalPay() {
        totalPay = 0.0;
        for (Map.Entry<Integer, Product> productEntry : products.entrySet()) {
            totalPay += productEntry.getValue().getPrice() * productEntry.getValue().getQuantity();
        }
        return totalPay;
    }

    public void setTotalPay(Double totalPay) {
        this.totalPay = totalPay;
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        updateTotalPay();
    }

    public void removeProduct(Integer id) {
        products.remove(id);
        updateTotalPay();
    }

    public void removeAll() {
        products.clear();
        totalPay = 0.0;
    }
}
