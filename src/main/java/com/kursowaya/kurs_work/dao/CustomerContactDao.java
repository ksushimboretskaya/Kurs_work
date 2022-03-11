package com.kursowaya.kurs_work.dao;

import com.kursowaya.kurs_work.model.CustomerContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerContactDao extends CrudRepository<CustomerContact, Long>,
        PagingAndSortingRepository<CustomerContact, Long> {
    void delete(long customerContactId);
}
