package com.codegym.services;

import com.codegym.models.StaffQualification;

import java.util.List;

public interface StaffQualificationService {
    List<StaffQualification> findAll();

    StaffQualification findById(Integer id);

    void save(StaffQualification staffQualification);

    void delete(Integer id);
}
