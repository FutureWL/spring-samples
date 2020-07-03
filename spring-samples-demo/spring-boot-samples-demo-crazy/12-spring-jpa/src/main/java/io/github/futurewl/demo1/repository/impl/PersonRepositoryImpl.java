package io.github.futurewl.data.mongodb.repository.impl;

import io.github.futurewl.base.entity.Person;
import io.github.futurewl.data.mongodb.repository.PersonRepositoryCustom;

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
