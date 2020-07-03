package io.github.futurewl.web.template.jsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@SpringBootApplication
public class AppWebTemplateJsp extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AppWebTemplateJsp.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AppWebTemplateJsp.class, args);
    }

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("name", "angus");
        return "hello";
    }
}
