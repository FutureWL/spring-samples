package io.github.futurewl.base;

import io.github.futurewl.base.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppBaseConfigJava implements CommandLineRunner {

    @Autowired
    private User user;

    public static void main(String[] args) {
        SpringApplication.run(AppBaseConfigJava.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(user);
    }
}
