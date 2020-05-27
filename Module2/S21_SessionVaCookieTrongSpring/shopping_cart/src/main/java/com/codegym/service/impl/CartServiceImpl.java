package com.codegym.service.impl;

import com.codegym.model.Cart;
import com.codegym.service.CartService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartServiceImpl implements CartService {
    @Override
    public Cart updatedCart(Integer[] idArray, Integer[] quantityArray, Cart cart) {
        Map<Integer, Integer> updatedQuantityProducts = new HashMap<>();
        for (int i = 0; i < idArray.length; i++) {
            updatedQuantityProducts.put(idArray[i], quantityArray[i]);
        }

        for (Map.Entry<Integer, Integer> productId : updatedQuantityProducts.entrySet()) {
            cart.getProducts().get(productId.getKey()).setQuantity(productId.getValue());
        }

        cart.updateTotalPay();

        return cart;
    }
}
