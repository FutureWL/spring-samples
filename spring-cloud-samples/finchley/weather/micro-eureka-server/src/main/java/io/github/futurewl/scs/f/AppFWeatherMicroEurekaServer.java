package io.github.futurewl.scs.f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:13:00
 * @version 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class AppFWeatherMicroEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(AppFWeatherMicroEurekaServer.class, args);
    }
}
