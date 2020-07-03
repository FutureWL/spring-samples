package io.github.futurewl.scs.f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:13:06
 * @version 1.0
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class AppFWeatherMicroEurekaClientZuul {
    public static void main(String[] args) {
        SpringApplication.run(AppFWeatherMicroEurekaClientZuul.class, args);
    }
}
