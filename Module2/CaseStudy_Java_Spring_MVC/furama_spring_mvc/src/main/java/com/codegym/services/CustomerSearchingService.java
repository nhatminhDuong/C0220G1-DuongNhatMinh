package com.codegym.services;

import com.codegym.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerSearchingService {
    Page<Customer> search(String fullName, String identityNumber,
                          String phoneNumber, String email, String address, Pageable pageable);

    Page<Customer> search(Integer customerTypeId, String fullName, String identityNumber,
                          String phoneNumber, String email, String address, Pageable pageable);
}
