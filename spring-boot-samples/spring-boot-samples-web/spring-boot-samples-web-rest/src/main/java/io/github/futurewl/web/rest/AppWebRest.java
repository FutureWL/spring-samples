package io.github.futurewl.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class AppWebRest {

    public static void main(String[] args) {
        SpringApplication.run(AppWebRest.class, args);
    }

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(){
        return restTemplateBuilder.rootUri("http://localhost:9987").build();
    }

    @GetMapping("/getPerson")
    public void getPerson() {
        RestTemplate restTemplate = new RestTemplate();
        Person person = restTemplate.getForObject("http://localhost:9987/person/angus", Person.class);
        System.out.println(person);
    }

    @GetMapping("/getPerson2")
    public void getPerson2() {
        Person person = restTemplate.getForObject("http://localhost:9987/person/angus", Person.class);
        System.out.println(person);
    }

    @GetMapping(value = "/person/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person person(@PathVariable String name) {
        Person person = new Person();
        person.setName(name);
        person.setAge(33);
        return person;
    }

    static class Person {
        String name;
        Integer age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
