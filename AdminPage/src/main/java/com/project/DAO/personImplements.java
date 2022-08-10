package com.project.DAO;

import com.project.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public class personImplements implements personDAO{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Person> getAllPerson() {
        Session session=sessionFactory.getCurrentSession();
            List<Person> all=session.createQuery("from Person",Person.class).getResultList();
  return all;
    }

    @Override
    public void savePerson(Person person) {
        Session session=sessionFactory.getCurrentSession();
        session.saveOrUpdate(person);
    }

    @Override
    public Person getPerson(int id) {
        Session session=sessionFactory.getCurrentSession();
        Person person=session.get(Person.class,id);
        return person;
    }

    @Override
    public void deletePerson(int id) {
   Session session=sessionFactory.getCurrentSession();
        Query<Person> query=session.createQuery("delete from Person "+ "where id=:PersonId");
        query.setParameter("PersonId",id);
        query.executeUpdate();
    }

}
