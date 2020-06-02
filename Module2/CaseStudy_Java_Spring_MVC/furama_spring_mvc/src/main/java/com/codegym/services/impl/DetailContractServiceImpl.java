package com.codegym.services.impl;

import com.codegym.models.DetailContract;
import com.codegym.repositories.DetailContractRepository;
import com.codegym.services.DetailContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DetailContractServiceImpl implements DetailContractService {
    @Autowired
    DetailContractRepository detailContractRepository;

    @Override
    public Page<DetailContract> findAll(Pageable pageable) {
        return detailContractRepository.findAll(pageable);
    }

    @Override
    public List<DetailContract> findAll() {
        return detailContractRepository.findAll();
    }

    @Override
    public DetailContract findById(Integer id) {
        return detailContractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(DetailContract detailContract) {
        detailContractRepository.save(detailContract);
    }

    @Override
    public void delete(Integer id) {
        detailContractRepository.deleteById(id);
    }
}
