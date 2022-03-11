package com.kursowaya.kurs_work.dao;

import com.kursowaya.kurs_work.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersDao extends CrudRepository<User, Long> {

    User findUserByUsername(String username);
}
