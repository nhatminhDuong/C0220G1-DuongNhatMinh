package com.codegym.repositories;

import com.codegym.models.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContractRepository extends JpaRepository<Contract, Integer> {

    String findContractsInPeriodQuery = "SELECT * FROM contract WHERE contract.end_date > curdate() AND contract.contract_date < curdate()";

    @Query(value = findContractsInPeriodQuery, nativeQuery = true)
    Page<Contract> findContractsInPeriod(Pageable pageable);
}
