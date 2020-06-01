package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccompaniedService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String accompaniedServiceName;
    private Integer price;
    private Integer unit;
    private String availabilityStatus;

    public AccompaniedService() {
    }

    public AccompaniedService(String accompaniedServiceName, Integer price, Integer unit, String availabilityStatus) {
        this.accompaniedServiceName = accompaniedServiceName;
        this.price = price;
        this.unit = unit;
        this.availabilityStatus = availabilityStatus;
    }

    public AccompaniedService(Integer id, String accompaniedServiceName, Integer price, Integer unit, String availabilityStatus) {
        this.id = id;
        this.accompaniedServiceName = accompaniedServiceName;
        this.price = price;
        this.unit = unit;
        this.availabilityStatus = availabilityStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccompaniedServiceName() {
        return accompaniedServiceName;
    }

    public void setAccompaniedServiceName(String accompaniedServiceName) {
        this.accompaniedServiceName = accompaniedServiceName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
