package com.codegym.services;

import com.codegym.models.ServiceType;

import java.util.List;

public interface ServiceTypeService {
    List<ServiceType> findAll();

    ServiceType findById(Integer id);

    void save(ServiceType serviceType);

    void delete(Integer id);
}
