package io.github.futurewl.cache.repository.impl;

import io.github.futurewl.cache.repository.PersonRepCustom;
import io.github.futurewl.cache.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.StringRedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonRepImpl implements PersonRepCustom {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public List<Person> myQuery() {
        return stringRedisTemplate.execute((RedisCallback<List<Person>>) connection -> {
            List<Person> result = new ArrayList<>();
            StringRedisConnection conn = (StringRedisConnection) connection;
            // key都是以set类型保存的，先查询全部的key
            Set<String> dataKeys = conn.sMembers("Person");
            // 根据每个key去查询数据
            for (String dataKey : dataKeys) {
                // key使用以下格式："Person:UUID"
                String dataKeyStr = "Person:" + dataKey;
                Map<String, String> data = conn.hGetAll(dataKeyStr);
                // 读取数据，并转换为了Person
                String age = data.get("age");
                String name = data.get("name");
                String company = data.get("company");
                String id = data.get("id");
                Person p = new Person();
                p.setId(id);
                p.setAge(Integer.parseInt(age));
                p.setName(name);
                p.setCompany(company);
                result.add(p);
            }
            return result;
        });
    }
}
