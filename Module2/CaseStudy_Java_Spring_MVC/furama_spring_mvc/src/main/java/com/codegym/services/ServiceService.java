package com.codegym.services;

import com.codegym.models.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceService {
    Page<Service> findAll(Pageable pageable);

    List<Service> findAll();

    Service findById(Integer id);

    void save(Service service);

    void delete(Integer id);
}
