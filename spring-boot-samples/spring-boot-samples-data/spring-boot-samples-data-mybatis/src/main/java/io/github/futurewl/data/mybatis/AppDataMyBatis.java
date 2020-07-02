package io.github.futurewl.data.mybatis;

import io.github.futurewl.data.mybatis.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppDataMyBatis implements CommandLineRunner {

    private final UserService userService;

    public AppDataMyBatis(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AppDataMyBatis.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(userService.findById(1));
    }
}
