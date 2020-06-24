package io.github.futurewl.base;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class AppBaseActuatorAdmin {
    public static void main(String[] args) {
        SpringApplication.run(AppBaseActuatorAdmin.class, args);
    }
}