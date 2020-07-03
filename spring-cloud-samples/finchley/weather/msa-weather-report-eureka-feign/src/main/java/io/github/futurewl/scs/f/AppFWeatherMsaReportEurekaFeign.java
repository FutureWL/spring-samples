package io.github.futurewl.scs.f;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-09:15:34
 * @version 1.0
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AppFWeatherMsaReportEurekaFeign {
    public static void main(String[] args) {
        SpringApplication.run(AppFWeatherMsaReportEurekaFeign.class, args);
    }
}
