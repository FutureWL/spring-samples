package io.github.futurewl.cache.demo1.service;

import io.github.futurewl.cache.demo1.repository.PersonRep;
import io.github.futurewl.cache.entity.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private final PersonRep personRep;

    public PersonService(PersonRep personRep) {
        this.personRep = personRep;
    }

    public List<Person> getPersons() {
        Iterable<Person> persons = personRep.findAll();
        List<Person> datas = new ArrayList<>();
        for (Person p : persons) {
            datas.add(p);
        }
        return datas;
    }

    public List<Person> myQuery() {
        return personRep.myQuery();
    }

    public List<Person> findByName(String name) {
        return personRep.findByName(name);
    }

    public List<Person> findTop2ByName(String name) {
        return personRep.findTop2ByName(name);
    }

    public void save(String name) {
        Person p = new Person();
        p.setName(name);
        p.setAge(33);
        p.setCompany("crazyit");
        personRep.save(p);
    }
}
