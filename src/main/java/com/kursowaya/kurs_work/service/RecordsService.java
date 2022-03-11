package com.kursowaya.kurs_work.service;

import com.kursowaya.kurs_work.model.Records;
import com.kursowaya.kurs_work.model.Services;

import java.util.List;

public interface RecordsService {
     void addRecords(Records records);

    double getRecordsGrandTotal(long cartId);

    Records getRecordsByServices(Services services);

    List<Records> getAllRecords();

    Records getRecordsById(long recordsId);

    void deleteRecordsById(long recordsId);
}