package io.github.futurewl.web.servletListenerFilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ServletComponentScan
public class AppWebServletListenerFilter extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AppWebServletListenerFilter.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AppWebServletListenerFilter.class);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
