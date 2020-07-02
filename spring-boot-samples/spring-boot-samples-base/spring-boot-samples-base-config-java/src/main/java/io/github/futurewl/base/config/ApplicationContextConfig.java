package io.github.futurewl.base.config;

import io.github.futurewl.base.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextConfig {

    @Bean
    public User user() {
        return new User("用户名", "密码");
    }

}
