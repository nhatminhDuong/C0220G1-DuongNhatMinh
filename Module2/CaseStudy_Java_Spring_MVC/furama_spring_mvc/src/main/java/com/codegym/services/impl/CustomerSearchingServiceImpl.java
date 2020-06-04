package com.codegym.services.impl;

import com.codegym.models.Customer;
import com.codegym.repositories.CustomerRepository;
import com.codegym.services.CustomerSearchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerSearchingServiceImpl implements CustomerSearchingService {
    @Autowired
    CustomerRepository customerRepository;


    @Override
    public Page<Customer> search(String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable) {
        return customerRepository.findAllByFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
                fullName, identityNumber, phoneNumber, email, address, pageable);
    }

    @Override
    public Page<Customer> search(Integer customerTypeId, String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable) {
        return customerRepository.findAllByCustomerTypeIdAndFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
                customerTypeId, fullName, identityNumber, phoneNumber, email, address, pageable);
    }
}
