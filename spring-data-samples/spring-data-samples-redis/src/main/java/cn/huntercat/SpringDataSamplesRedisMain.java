package cn.huntercat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class SpringDataSamplesRedisMain implements CommandLineRunner {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataSamplesRedisMain.class, args);
        System.out.println("Redis Samples 启动成功！");
    }

    @Override
    public void run(String... args) throws Exception {
//        redisTemplate.opsForValue().set("hello", "world");
        String key = "hello_list";
        for (int i = 0; i < 10; i++) {
            redisTemplate.opsForList().leftPush(key, "value:" + i);
        }

        List<String> valueList = redisTemplate.opsForList().range(key, 0, 4);
        System.out.println(valueList);
    }

}
