package com.kursowaya.kurs_work.service;

import com.kursowaya.kurs_work.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    void addCustomer(Customer customer);

    Customer findCustomerByUsername(String username);

    List<Customer> getAllCustomers();

    Optional<Customer> getCustomerByCustomerId(long customerId);

    Customer findCustomerByUsernameAndPassword(String username, String password);
}