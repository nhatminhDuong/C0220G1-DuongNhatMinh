package com.codegym.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String serviceName;
    private Integer area;
    private Integer numberOfFloors;
    private Integer maximumPeople;
    private String rentFee;
    private Integer rentTypeId;
    private Integer serviceTypeId;
    private String availabilityStatus;

    public Service() {
    }

    public Service(String serviceName, Integer area, Integer numberOfFloors, Integer maximumPeople, String rentFee,
                   Integer rentTypeId, Integer serviceTypeId, String availabilityStatus) {
        this.serviceName = serviceName;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.maximumPeople = maximumPeople;
        this.rentFee = rentFee;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
        this.availabilityStatus = availabilityStatus;
    }

    public Service(Integer id, String serviceName, Integer area, Integer numberOfFloors, Integer maximumPeople,
                   String rentFee, Integer rentTypeId, Integer serviceTypeId, String availabilityStatus) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.numberOfFloors = numberOfFloors;
        this.maximumPeople = maximumPeople;
        this.rentFee = rentFee;
        this.rentTypeId = rentTypeId;
        this.serviceTypeId = serviceTypeId;
        this.availabilityStatus = availabilityStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(Integer maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentFee() {
        return rentFee;
    }

    public void setRentFee(String rentFee) {
        this.rentFee = rentFee;
    }

    public Integer getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(Integer rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
