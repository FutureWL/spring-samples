package io.github.futurewl.web.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppWebTemplateThymeleaf {
    public static void main(String[] args) {
        // 原生处理
//        TemplateEngine templateEngine = new TemplateEngine();
//        Context context = new Context();
//        String result = templateEngine.process("<input type='' th:value='angus'/>", context);
//        System.out.println(result);
        //
        SpringApplication.run(AppWebTemplateThymeleaf.class, args);
    }
}
