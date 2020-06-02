package com.codegym.services.impl;

import com.codegym.models.StaffPosition;
import com.codegym.repositories.StaffPositionRepository;
import com.codegym.services.StaffPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StaffPositionServiceImpl implements StaffPositionService {
    @Autowired
    StaffPositionRepository staffPositionRepository;

    @Override
    public List<StaffPosition> findAll() {
        return staffPositionRepository.findAll();
    }

    @Override
    public StaffPosition findById(Integer id) {
        return staffPositionRepository.findById(id).orElse(null);
    }

    @Override
    public void save(StaffPosition staffPosition) {
        staffPositionRepository.save(staffPosition);
    }

    @Override
    public void delete(Integer id) {
        staffPositionRepository.deleteById(id);
    }
}
