package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetailContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer contractId;
    private Integer accompaniedServiceId;
    private Integer amount;

    public DetailContract() {
    }

    public DetailContract(Integer contractId, Integer accompaniedServiceId, Integer amount) {
        this.contractId = contractId;
        this.accompaniedServiceId = accompaniedServiceId;
        this.amount = amount;
    }

    public DetailContract(Integer id, Integer contractId, Integer accompaniedServiceId, Integer amount) {
        this.id = id;
        this.contractId = contractId;
        this.accompaniedServiceId = accompaniedServiceId;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getAccompaniedServiceId() {
        return accompaniedServiceId;
    }

    public void setAccompaniedServiceId(Integer accompaniedServiceId) {
        this.accompaniedServiceId = accompaniedServiceId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
