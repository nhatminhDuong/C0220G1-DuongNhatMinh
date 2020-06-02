package com.codegym.services;

import com.codegym.models.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StaffService {
    Page<Staff> findAll(Pageable pageable);

    List<Staff> findAll();

    Staff findById(Integer id);

    void save(Staff staff);

    void delete(Integer id);
}
