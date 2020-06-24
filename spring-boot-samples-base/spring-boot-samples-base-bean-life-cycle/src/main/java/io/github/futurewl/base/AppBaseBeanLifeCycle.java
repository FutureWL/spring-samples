package io.github.futurewl.base;

import io.github.futurewl.base.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 功能描述：Bean 生命周期
 *
 * @author weilai
 */
@Slf4j
@SpringBootApplication
@ImportResource("classpath:application-context.xml")
public class AppBaseBeanLifeCycle implements CommandLineRunner {

    private final Person person1;

    private final Person person2;

    public AppBaseBeanLifeCycle(Person person1, Person person2) {
        this.person1 = person1;
        this.person2 = person2;
    }

    public static void main(String[] args) {
        SpringApplication.run(AppBaseBeanLifeCycle.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(person1.toString());
        log.info(person2.toString());
    }
}
