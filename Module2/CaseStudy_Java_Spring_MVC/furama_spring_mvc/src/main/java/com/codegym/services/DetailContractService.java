package com.codegym.services;

import com.codegym.models.DetailContract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DetailContractService {
    Page<DetailContract> findAll(Pageable pageable);

    List<DetailContract> findAll();

    DetailContract findById(Integer id);

    void save(DetailContract detailContract);

    void delete(Integer id);
}
