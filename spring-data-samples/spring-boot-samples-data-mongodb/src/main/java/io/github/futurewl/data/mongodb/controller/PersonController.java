package io.github.futurewl.data.mongodb.controller;

import io.github.futurewl.data.mongodb.service.PersonService;
import io.github.futurewl.data.mongodb.entity.Person;
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
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<Person> myQuery() {
        return personService.myQuery();
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List<Person> findByName(@PathVariable String name) {
        return personService.findByName(name);
    }

    @RequestMapping(value = "/ageless/{age}", method = RequestMethod.GET)
    public List<Person> findByAgeLessThan(@PathVariable Integer age) {
        return personService.findByAgeLessThan(age);
    }

    @RequestMapping(value = "/nameage/{name}/{age}", method = RequestMethod.GET)
    public List<Person> findByNameAndAge(@PathVariable String name, @PathVariable Integer age) {
        return personService.findByNameAndAge(name, age);
    }

    @RequestMapping(value = "/namewf/{name}", method = RequestMethod.GET)
    public List<Person> findByNameWithField(@PathVariable String name) {
        return personService.findByNameWithField(name);
    }

    @RequestMapping(value = "/save/{name}", method = RequestMethod.GET)
    public String save(@PathVariable String name) {
        personService.save(name);
        return "Success";
    }
}
