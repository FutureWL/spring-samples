package io.github.futurewl.web.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：Spring Boot Web 测试
 *
 * @author weilai
 */
@RestController
@SpringBootApplication
public class AppWebTest {
    public static void main(String[] args) {
        SpringApplication.run(AppWebTest.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
