package com.kursowaya.kurs_work.serviceImpl;

import com.kursowaya.kurs_work.dao.AuthoritiesDao;
import com.kursowaya.kurs_work.model.Authorities;
import com.kursowaya.kurs_work.service.AuthoritiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AuthoritiesServiceImpl implements AuthoritiesService {
    @Autowired
    private AuthoritiesDao authoritiesDao;

    @Transactional()
    @Override
    public void addAuthorities(Authorities authorities) {
        authoritiesDao.save(authorities);
    }

    @Transactional(readOnly = true)
    @Override
    public Authorities findAuthoritiesByUsername(String username) {
        return authoritiesDao.findAuthoritiesByUsername(username);
    }
}