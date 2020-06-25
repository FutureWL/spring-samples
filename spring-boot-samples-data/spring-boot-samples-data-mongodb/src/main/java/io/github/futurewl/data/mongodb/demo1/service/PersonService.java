package io.github.futurewl.data.mongodb.demo1.service;

import io.github.futurewl.data.mongodb.demo1.repository.PersonRep;
import io.github.futurewl.data.mongodb.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRep personRep;

    public PersonService(PersonRep personRep) {
        this.personRep = personRep;
    }

    public List<Person> getPersons() {
        return personRep.findAll();
    }

    public List<Person> myQuery() {
        return personRep.myQuery();
    }

    public List<Person> findByName(String name) {
        return personRep.name(name);
    }

    public List<Person> findByNameAndAge(String name, Integer age) {
        return personRep.findByNameAndAge(name, age);
    }

    public List<Person> findByAgeLessThan(Integer age) {
        return personRep.findByAgeLessThan(age);
    }

    public List<Person> findByNameWithField(String name) {
        return personRep.findByName(name);
    }

    public void save(String name) {
        Person p = new Person();
        p.setName(name);
        p.setAge(33);
        p.setCompany("ce");
        personRep.save(p);
    }
}
