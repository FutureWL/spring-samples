package io.github.futurewl.spring.boot.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class AppSpringBootAdminServer {
    public static void main(String[] args) {
        SpringApplication.run(AppSpringBootAdminServer.class, args);
    }
}
