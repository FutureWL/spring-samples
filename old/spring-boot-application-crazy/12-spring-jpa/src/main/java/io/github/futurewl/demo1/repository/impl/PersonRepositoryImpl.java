package io.github.futurewl.demo1.repository.impl;

import io.github.futurewl.entity.Person;
import io.github.futurewl.demo1.repository.PersonRepositoryCustom;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepositoryCustom {

    @PersistenceContext
    private EntityManager em;

    public List<Person> myQuery() {
        Query q = em.createQuery("from Person");
        return q.getResultList();
    }
}
