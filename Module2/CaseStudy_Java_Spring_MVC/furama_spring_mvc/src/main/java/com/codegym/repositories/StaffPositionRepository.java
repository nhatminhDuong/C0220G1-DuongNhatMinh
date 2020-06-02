package com.codegym.repositories;

import com.codegym.models.StaffPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffPositionRepository extends JpaRepository<StaffPosition, Integer> {
}
