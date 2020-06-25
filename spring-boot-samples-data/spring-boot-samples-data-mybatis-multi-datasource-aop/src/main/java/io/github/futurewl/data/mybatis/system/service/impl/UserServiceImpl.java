package io.github.futurewl.data.mybatis.system.service.impl;

import io.github.futurewl.data.mybatis.common.annotation.DataSource;
import io.github.futurewl.data.mybatis.common.enums.DataSourceType;
import io.github.futurewl.data.mybatis.system.domain.User;
import io.github.futurewl.data.mybatis.system.mapper.UserMapper;
import io.github.futurewl.data.mybatis.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    @DataSource(DataSourceType.SLAVE)
    public User findById2(Long id) {
        return userMapper.findById(id);
    }
}
