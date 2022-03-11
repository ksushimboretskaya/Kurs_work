package com.kursowaya.kurs_work.serviceImpl;

import com.kursowaya.kurs_work.dao.UsersDao;
import com.kursowaya.kurs_work.model.User;
import com.kursowaya.kurs_work.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersServiceImpl implements UserService {
    @Autowired
    private UsersDao usersDao;

    @Transactional()
    @Override
    public void addUsers(User users) {
        usersDao.save(users);
    }

    @Transactional(readOnly = true)
    @Override
    public User findUserByUsername(String username) {
        return usersDao.findUserByUsername(username);
    }
}