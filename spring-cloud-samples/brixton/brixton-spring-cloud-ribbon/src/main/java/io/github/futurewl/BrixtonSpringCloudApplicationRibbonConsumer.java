package io.github.futurewl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:16:32
 * @version 1.0
 */
@Slf4j
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class BrixtonSpringCloudApplicationRibbonConsumer {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(BrixtonSpringCloudApplicationRibbonConsumer.class, args);
    }

}
