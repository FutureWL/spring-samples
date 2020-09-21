package io.github.futurewl.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：
 */
@SpringBootApplication
public class AppDataElasticsearch implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(AppDataElasticsearch.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
