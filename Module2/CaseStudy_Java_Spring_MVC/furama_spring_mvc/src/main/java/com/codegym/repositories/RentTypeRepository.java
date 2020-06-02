package com.codegym.repositories;

import com.codegym.models.RentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentTypeRepository extends JpaRepository<RentType, Integer> {
}
