package com.kursowaya.kurs_work.dao;

import com.kursowaya.kurs_work.model.Records;
import com.kursowaya.kurs_work.model.Services;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordsDao extends CrudRepository<Records, Long> {
Records getRecordsByServices(Services services);
}