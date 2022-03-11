package com.kursowaya.kurs_work.service;

import com.kursowaya.kurs_work.model.Services;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ServicesService {
    void addServices(Services services);

    Page<Services> getAllServices(Integer pageNumber);

    List<Services> getAllServices();

    Services getServicesById(long servicesId);

    void updateServices(Services services);

    void deleteServices(long servicesId);

    List<Services> getAllServicesByCategory(String category);

    Page<Services> getAllServicesByCategory(Integer pageNumber, String category);

    Page<Services> getAllServicesByCategoryOrCostOrName(Integer pageNumber, String searchTerm);
}