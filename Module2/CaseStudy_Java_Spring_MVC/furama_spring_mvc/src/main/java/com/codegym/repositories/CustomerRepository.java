package com.codegym.repositories;

import com.codegym.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
            String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable);

    Page<Customer> findAllByCustomerTypeIdAndFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
            Integer customerTypeId, String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable);
}
