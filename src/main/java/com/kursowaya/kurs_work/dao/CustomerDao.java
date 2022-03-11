package com.kursowaya.kurs_work.dao;

import com.kursowaya.kurs_work.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Long> {
    Customer findUserByUsername(String username);
    Customer findCustomerByUsernameAndPassword(String username,String password);
}