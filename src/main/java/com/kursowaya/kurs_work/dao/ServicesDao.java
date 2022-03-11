package com.kursowaya.kurs_work.dao;

import com.kursowaya.kurs_work.model.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicesDao extends CrudRepository<Services, Long>, PagingAndSortingRepository<Services, Long> {
    List<Services> findAllServicesByServicesCategory(String servicesCategory);

    Page<Services> findAllServicesByServicesCategory(String servicesCategory, Pageable pageable);

    @Query("SELECT t FROM Services t WHERE t.servicesCategory = :searchTerm OR t.servicesName LIKE %:searchTerm% " +
            " OR   t.servicesCost LIKE %:searchTerm%")
    Page<Services> findAllProductByNameOrCostOrCategory(@Param("searchTerm") String searchTerm, Pageable pageable);
}