package com.kursowaya.kurs_work.dao;

import com.kursowaya.kurs_work.model.Authorities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesDao extends CrudRepository<Authorities, Long> {
    Authorities findAuthoritiesByUsername(String username);
}