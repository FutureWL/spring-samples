package io.github.futurewl.data.mybatis.system.mapper;

import io.github.futurewl.data.mybatis.system.domain.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from t_user where id=#{id}")
    User findById(Long id);

}
