package com.codegym.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String fullName;
    private String dateOfBirth;
    private String identityNumber;
    private String phoneNumber;
    private String email;
    private String address;

    @ManyToOne
    @JoinColumn(name = "customer_type_customer_type_id")
    private CustomerType customerType;

//    @OneToMany(mappedBy = "customer")
//    private Set<Contract> contracts;
}
