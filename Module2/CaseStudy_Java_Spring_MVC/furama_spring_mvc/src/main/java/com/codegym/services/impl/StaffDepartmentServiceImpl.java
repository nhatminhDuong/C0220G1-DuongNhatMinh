package com.codegym.services.impl;

import com.codegym.models.StaffDepartment;
import com.codegym.repositories.StaffDepartmentRepository;
import com.codegym.services.StaffDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StaffDepartmentServiceImpl implements StaffDepartmentService {
    @Autowired
    StaffDepartmentRepository staffDepartmentRepository;

    @Override
    public List<StaffDepartment> findAll() {
        return staffDepartmentRepository.findAll();
    }

    @Override
    public StaffDepartment findById(Integer id) {
        return staffDepartmentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(StaffDepartment staffDepartment) {
        staffDepartmentRepository.save(staffDepartment);
    }

    @Override
    public void delete(Integer id) {
        staffDepartmentRepository.deleteById(id);
    }
}
