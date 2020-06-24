package io.github.futurewl.demo1.service;

import io.github.futurewl.dao.UserDao;
import io.github.futurewl.base.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User login(User user) {
        User u = userDao.findByNameAndPasswd(user.getName(), user.getPasswd());
        return u;
    }
}
