package com.project.DAO;

import com.project.model.Person;

import java.util.List;

public interface personDAO {
   public List<Person> getAllPerson();
 public void savePerson(Person person);
 public Person getPerson(int id);
    public void deletePerson(int id);


}
