package com.codegym.services.impl;

import com.codegym.models.AccompaniedService;
import com.codegym.repositories.AccompaniedServiceRepository;
import com.codegym.services.AccompaniedServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccompaniedServiceServiceImpl implements AccompaniedServiceService {
    @Autowired
    AccompaniedServiceRepository accompaniedServiceRepository;

    @Override
    public List<AccompaniedService> findAll() {
        return accompaniedServiceRepository.findAll();
    }

    @Override
    public AccompaniedService findById(Integer id) {
        return accompaniedServiceRepository.findById(id).orElse(null);
    }

    @Override
    public void save(AccompaniedService accompaniedService) {
        accompaniedServiceRepository.save(accompaniedService);
    }

    @Override
    public void delete(Integer id) {
        accompaniedServiceRepository.deleteById(id);
    }
}
