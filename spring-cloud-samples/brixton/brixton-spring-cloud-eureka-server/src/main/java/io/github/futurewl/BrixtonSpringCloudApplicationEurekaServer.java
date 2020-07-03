package io.github.futurewl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述：EurekaServer
 *
 * @author weilai create by 2019-06-06:16:02
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class BrixtonSpringCloudApplicationEurekaServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(BrixtonSpringCloudApplicationEurekaServer.class)
                .web(true)
                .run(args);
    }
}
