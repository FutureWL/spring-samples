package io.github.futurewl.data.mongodb.repository;

import io.github.futurewl.base.entity.Person;

import java.util.List;

public interface PersonRepositoryCustom {

    List<Person> myQuery();
}
