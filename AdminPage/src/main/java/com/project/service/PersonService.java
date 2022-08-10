package com.project.service;

import com.project.model.Person;

import java.util.List;

public interface PersonService {
    public List<Person> getAll();
    public void savePerson(Person person);
    public Person getPerson(int id);
    public void deletePerson(int id);

}
