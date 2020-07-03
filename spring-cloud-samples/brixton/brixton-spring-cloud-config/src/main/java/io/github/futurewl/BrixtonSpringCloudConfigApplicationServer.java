package io.github.futurewl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BrixtonSpringCloudConfigApplicationServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BrixtonSpringCloudConfigApplicationServer.class)
                .web(true)
                .run(args);
    }
}
