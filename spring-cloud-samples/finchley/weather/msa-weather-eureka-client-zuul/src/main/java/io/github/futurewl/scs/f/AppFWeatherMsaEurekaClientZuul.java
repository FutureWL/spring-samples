package io.github.futurewl.scs.f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:18:46
 * @version 1.0
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class AppFWeatherMsaEurekaClientZuul {
    public static void main(String[] args) {
        SpringApplication.run(AppFWeatherMsaEurekaClientZuul.class, args);
    }
}
