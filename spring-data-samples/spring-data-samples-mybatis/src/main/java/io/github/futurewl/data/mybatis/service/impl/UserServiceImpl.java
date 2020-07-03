package io.github.futurewl.data.mybatis.service.impl;


import io.github.futurewl.data.mybatis.entity.User;
import io.github.futurewl.data.mybatis.mapper.UserMapper;
import io.github.futurewl.data.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void save(User user) {

    }

    @Override
    public User findById(Integer id) {
        return userMapper.getUser(id);
    }
}
