package com.project.service;

import com.project.DAO.personDAO;
import com.project.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class PersonImpl implements PersonService{
    @Autowired
    private personDAO personDAO;
    @Override
    @Transactional
    public List<Person> getAll() {
        return personDAO.getAllPerson();
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
    personDAO.savePerson(person);
    }

    @Override
    @Transactional
    public Person getPerson(int id) {
      return  personDAO.getPerson(id);

    }

    @Override
    @Transactional
    public void deletePerson(int id) {
        personDAO.deletePerson(id);
    }
}
