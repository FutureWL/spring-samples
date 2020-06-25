package io.github.futurewl.data.mongodb.demo1.repository;

import io.github.futurewl.base.entity.Person;

import java.util.List;

public interface PersonRepositoryCustom {

    List<Person> myQuery();
}
