package io.github.futurewl.data.mybatis.service;

import io.github.futurewl.data.mybatis.entity.User;

public interface UserService {

    void save(User user);

    User findById(Integer id);

}
