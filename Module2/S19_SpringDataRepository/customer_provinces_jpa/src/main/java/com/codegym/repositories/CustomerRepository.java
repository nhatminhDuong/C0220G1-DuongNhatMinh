package com.codegym.repositories;

import com.codegym.models.Customer;
import com.codegym.models.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllByProvince(Province province);
}
