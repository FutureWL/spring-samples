package io.github.futurewl.scs.f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:23:55
 * @version 1.0
 */
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@SpringBootApplication
public class AppFWeatherMsaReportEurekaFeignGatewayHystrix {
    public static void main(String[] args) {
        SpringApplication.run(AppFWeatherMsaReportEurekaFeignGatewayHystrix.class, args);
    }
}
