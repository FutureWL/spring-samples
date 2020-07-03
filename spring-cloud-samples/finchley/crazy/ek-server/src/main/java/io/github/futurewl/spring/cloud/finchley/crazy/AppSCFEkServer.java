package io.github.futurewl.spring.cloud.finchley.crazy;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AppSCFEkServer {

    public static void main(String[] args) {
        new SpringApplicationBuilder(AppSCFEkServer.class).run(args);
    }
}
