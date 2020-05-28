package com.codegym.services;

import com.codegym.models.Customer;
import com.codegym.models.Province;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> findAllByProvince(Province province);
}
