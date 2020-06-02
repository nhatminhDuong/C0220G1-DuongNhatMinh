package com.codegym.repositories;

import com.codegym.models.StaffDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffDepartmentRepository extends JpaRepository<StaffDepartment, Integer> {
}
