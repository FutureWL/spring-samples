package io.github.futurewl.data.mybatis.mapper;

import io.github.futurewl.data.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id, username, password from t_user where id=#{id}")
    User getUser(Integer id);

}
