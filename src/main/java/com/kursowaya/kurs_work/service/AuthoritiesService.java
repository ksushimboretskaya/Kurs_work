package com.kursowaya.kurs_work.service;

import com.kursowaya.kurs_work.model.Authorities;

public interface AuthoritiesService {
    void addAuthorities(Authorities authorities);

    Authorities findAuthoritiesByUsername(String username);
}