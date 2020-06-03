package com.codegym.models;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer customerTypeId;
    private String fullName;
    private String dateOfBirth;
    private String identityNumber;
    private String phoneNumber;
    private String email;
    private String address;

    public Customer() {
    }

    public Customer(Integer customerTypeId, String fullName, String dateOfBirth, String identityNumber,
                    String phoneNumber, String email, String address) {
        this.customerTypeId = customerTypeId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.identityNumber = identityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Customer(Integer id, Integer customerTypeId, String fullName, String dateOfBirth, String identityNumber,
                    String phoneNumber, String email, String address) {
        this.id = id;
        this.customerTypeId = customerTypeId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.identityNumber = identityNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
