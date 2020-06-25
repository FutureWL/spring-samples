package io.github.futurewl.data.mybatis.system.service;

import io.github.futurewl.data.mybatis.system.domain.User;

public interface UserService {

    User findById(Long id);

    User findById2(Long id);
}
