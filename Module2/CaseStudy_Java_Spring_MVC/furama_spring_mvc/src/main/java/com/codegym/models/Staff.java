package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String fullName;
    private Integer positionId;
    private Integer qualificationId;
    private Integer departmentId;
    private String dateOfBirth;
    private String identityNumber;
    private String salary;
    private String phoneNumber;
    private String email;
    private String address;

    public Staff() {
    }

    public Staff(String fullName, Integer positionId, Integer qualificationId,
                 Integer departmentId, String dateOfBirth, String identityNumber,
                 String salary, String phoneNumber, String email, String address) {
        this.fullName = fullName;
        this.positionId = positionId;
        this.qualificationId = qualificationId;
        this.departmentId = departmentId;
        this.dateOfBirth = dateOfBirth;
        this.identityNumber = identityNumber;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public Staff(Integer id, String fullName, Integer positionId, Integer qualificationId,
                 Integer departmentId, String dateOfBirth, String identityNumber, String salary,
                 String phoneNumber, String email, String address) {
        this.id = id;
        this.fullName = fullName;
        this.positionId = positionId;
        this.qualificationId = qualificationId;
        this.departmentId = departmentId;
        this.dateOfBirth = dateOfBirth;
        this.identityNumber = identityNumber;
        this.salary = salary;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public Integer getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(Integer qualificationId) {
        this.qualificationId = qualificationId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
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
