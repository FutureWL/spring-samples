package io.github.futurewl.cache.controller;

import io.github.futurewl.cache.demo1.service.PersonService;
import io.github.futurewl.cache.entity.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public List<Person> getPerson() {
        return personService.getPersons();
    }

    @RequestMapping(value = "/save/{name}", method = RequestMethod.GET)
    public String save(@PathVariable String name) {
        personService.save(name);
        return "Success";
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Person> query() {
        return personService.myQuery();
    }

    @RequestMapping(value = "/top/{name}", method = RequestMethod.GET)
    public List<Person> findTop2ByName(@PathVariable String name) {
        return personService.findTop2ByName(name);
    }


    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List<Person> findByName(@PathVariable String name) {
        System.out.println("=========" + name);
        return personService.findByName(name);
    }
}
