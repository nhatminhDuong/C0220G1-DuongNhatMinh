package com.codegym.services.impl;

import com.codegym.models.Customer;
import com.codegym.repositories.CustomerRepository;
import com.codegym.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

//@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findAllByFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
            String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable) {
        return customerRepository.findAllByFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
                fullName, identityNumber, phoneNumber, email, address, pageable);
    }

    @Override
    public Page<Customer> findAllByCustomerTypeIdAndFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(Integer customerTypeId, String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable) {
        return customerRepository.findAllByCustomerTypeIdAndFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
                customerTypeId, fullName, identityNumber, phoneNumber, email, address, pageable);
    }

    @Override
    public Page<Customer> findCustomersCurrentlyUsingService(Pageable pageable) {
        return customerRepository.findCustomersCurrentlyUsingService(pageable);
    }
}
