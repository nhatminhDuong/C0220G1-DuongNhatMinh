package com.codegym.models;

import javax.persistence.*;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contractId;
    private Integer employeeId;
    private Integer customerId;
    private Integer serviceId;
    private String contractDate;
    private String endDate;
    private Integer deposit;
    private Integer totalPayment;

    @ManyToOne
    @JoinColumn(name = "customer_customer_id")
    private Customer customer;

}
