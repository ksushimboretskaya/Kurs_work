package com.kursowaya.kurs_work.service;

import com.kursowaya.kurs_work.model.CustomerContact;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CustomerContactService {
    public void addNewMessage(CustomerContact customerContact);

    public void deleteMessageById(long customerContactId);

    public List<CustomerContact> getAllCustomerContact();

    Page<CustomerContact> getAllCustomerMessage(Integer pageNumber);
}