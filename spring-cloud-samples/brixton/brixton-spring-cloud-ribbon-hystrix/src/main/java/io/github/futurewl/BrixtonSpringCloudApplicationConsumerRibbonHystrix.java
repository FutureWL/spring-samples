package io.github.futurewl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:16:32
 * @version 1.0
 */
@EnableCircuitBreaker
@EnableDiscoveryClient
@SpringBootApplication
public class BrixtonSpringCloudApplicationConsumerRibbonHystrix {

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(BrixtonSpringCloudApplicationConsumerRibbonHystrix.class, args);
    }

}
