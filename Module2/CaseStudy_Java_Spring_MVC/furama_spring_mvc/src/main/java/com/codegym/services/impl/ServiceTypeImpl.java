package com.codegym.services.impl;

import com.codegym.models.ServiceType;
import com.codegym.repositories.ServiceTypeRepository;
import com.codegym.services.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeImpl implements ServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public ServiceType findById(Integer id) {
        return serviceTypeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ServiceType serviceType) {
        serviceTypeRepository.save(serviceType);
    }

    @Override
    public void delete(Integer id) {
        serviceTypeRepository.deleteById(id);
    }
}
