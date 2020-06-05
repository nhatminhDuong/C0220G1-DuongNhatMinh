package com.codegym.services;

import com.codegym.models.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    List<Contract> findAll();

    Contract findById(Integer id);

    void save(Contract contract);

    void delete(Integer id);

    Page<Contract> findContractsInPeriod(Pageable pageable);
}
