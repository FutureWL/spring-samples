package io.github.futurewl.web.rest.feign;

import feign.Feign;
import feign.gson.GsonDecoder;

public class AppWebRestFeign {
    public static void main(String[] args) {
        PersonClient personClient = Feign.builder().decoder(new GsonDecoder()).
                target(PersonClient.class, "http://localhost:9987/");
        Person person = personClient.getPerson("angus");
        System.out.println(person);
    }
}
