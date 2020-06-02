package com.codegym.services;

import com.codegym.models.StaffDepartment;

import java.util.List;

public interface StaffDepartmentService {
    List<StaffDepartment> findAll();

    StaffDepartment findById(Integer id);

    void save(StaffDepartment staffDepartment);

    void delete(Integer id);
}
