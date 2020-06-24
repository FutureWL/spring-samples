package io.github.futurewl.base;

import io.github.futurewl.base.bean.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class AppBaseConfigXml implements CommandLineRunner {

    private final User user;

    public AppBaseConfigXml(User user) {
        this.user = user;
    }

    public static void main(String[] args) {
        SpringApplication.run(AppBaseConfigXml.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(user);
    }
}
