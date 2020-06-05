package com.codegym.repositories;

import com.codegym.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    String findCustomersCurrentlyUsingServiceQuery = "SELECT customer.* FROM customer INNER JOIN contract ON customer.id = contract.customer_id WHERE contract.end_date > curdate() AND contract.contract_date < curdate()";

    Page<Customer> findAllByFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
            String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable);

    Page<Customer> findAllByCustomerTypeIdAndFullNameContainingAndIdentityNumberContainingAndPhoneNumberContainingAndEmailContainingAndAddressContaining(
            Integer customerTypeId, String fullName, String identityNumber, String phoneNumber, String email, String address, Pageable pageable);

    // native Query example
//    @Query(value = "SELECT * FROM author WHERE first_name = :firstName", nativeQuery = true)
//    List<Author> findAuthorsByFirstName(@Param("firstName") String firstName);

    @Query(value = findCustomersCurrentlyUsingServiceQuery, nativeQuery = true)
    Page<Customer> findCustomersCurrentlyUsingService(Pageable pageable);
}
