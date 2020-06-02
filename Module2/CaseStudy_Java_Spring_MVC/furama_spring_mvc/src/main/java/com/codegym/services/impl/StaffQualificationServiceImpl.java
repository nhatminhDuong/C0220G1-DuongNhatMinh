package com.codegym.services.impl;

import com.codegym.models.StaffQualification;
import com.codegym.repositories.StaffQualificationRepository;
import com.codegym.services.StaffQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Service
public class StaffQualificationServiceImpl implements StaffQualificationService {
    @Autowired
    StaffQualificationRepository staffQualificationRepository;

    @Override
    public List<StaffQualification> findAll() {
        return staffQualificationRepository.findAll();
    }

    @Override
    public StaffQualification findById(Integer id) {
        return staffQualificationRepository.findById(id).orElse(null);
    }

    @Override
    public void save(StaffQualification staffQualification) {
        staffQualificationRepository.save(staffQualification);
    }

    @Override
    public void delete(Integer id) {
        staffQualificationRepository.deleteById(id);
    }
}
