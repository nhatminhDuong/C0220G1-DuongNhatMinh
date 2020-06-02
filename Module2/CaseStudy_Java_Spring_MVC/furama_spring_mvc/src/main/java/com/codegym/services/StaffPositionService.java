package com.codegym.services;

import com.codegym.models.StaffPosition;

import java.util.List;

public interface StaffPositionService {
    List<StaffPosition> findAll();

    StaffPosition findById(Integer id);

    void save(StaffPosition staffPosition);

    void delete(Integer id);
}
