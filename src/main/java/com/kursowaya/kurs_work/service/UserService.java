package com.kursowaya.kurs_work.service;

import com.kursowaya.kurs_work.model.User;

public interface UserService {
    public void addUsers(User users);

    User findUserByUsername(String username);
}