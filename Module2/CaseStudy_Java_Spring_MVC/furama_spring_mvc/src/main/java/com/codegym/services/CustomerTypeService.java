package com.codegym.services;

import com.codegym.models.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(Integer id);

    void save(CustomerType customerType);

    void delete(Integer id);
}
