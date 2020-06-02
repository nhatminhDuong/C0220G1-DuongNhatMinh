package com.codegym.services;

import com.codegym.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    List<Customer> findAll();

    Customer findById(Integer id);

    void save(Customer customer);

    void delete(Integer id);
}
