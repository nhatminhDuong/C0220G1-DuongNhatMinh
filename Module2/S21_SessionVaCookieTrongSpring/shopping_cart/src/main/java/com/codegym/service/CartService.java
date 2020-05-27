package com.codegym.service;

import com.codegym.model.Cart;

public interface CartService {
    Cart updatedCart(Integer[] idArray, Integer[] quantityArray, Cart cart);
}
