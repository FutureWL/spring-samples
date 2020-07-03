package io.github.futurewl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:16:07
 * @version 1.0
 */
@Slf4j
@RestController
@EnableEurekaClient
@SpringBootApplication
public class BrixtonSpringCloudApplicationHelloService {

    public static void main(String[] args) {
        SpringApplication.run(BrixtonSpringCloudApplicationHelloService.class, args);
    }

}
