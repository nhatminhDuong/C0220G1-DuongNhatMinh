package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer staffId;
    private Integer customerId;
    private Integer serviceId;
    private String contractDate;
    private String endDate;
    private Integer deposit;
    private Integer totalPayment;

    public Contract() {
    }

    public Contract(Integer staffId, Integer customerId, Integer serviceId, String contractDate,
                    String endDate, Integer deposit, Integer totalPayment) {
        this.staffId = staffId;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.contractDate = contractDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public Contract(Integer id, Integer staffId, Integer customerId, Integer serviceId, String contractDate,
                    String endDate, Integer deposit, Integer totalPayment) {
        this.id = id;
        this.staffId = staffId;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.contractDate = contractDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Integer getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(Integer totalPayment) {
        this.totalPayment = totalPayment;
    }
}
