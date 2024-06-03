package com.prudhvi.hibernate.entityRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

import com.prudhvi.hibernate.entity.Person;

public class PersonRepository {

	public EntityManagerFactory getEntityManager() {
		
         return Persistence.createEntityManagerFactory("prudhvi");
	}
	
	public String savePerson(Person person) {
		EntityManager manager = getEntityManager().createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		return "data update";

	}
	public Person getpersonby(int id) {
		
		EntityManager manager = getEntityManager().createEntityManager();
		return manager.find(Person.class, id);	
	}
	public List<Person> getAllPerson() {
		EntityManager manager = getEntityManager().createEntityManager();
			Query query = manager.createQuery("from Person");
		return query.getResultList();
	}  
		public List getPhoneNoByName(String name) {
		EntityManager  manager= getEntityManager().createEntityManager();
		Query query = manager.createQuery("SELECT P.phoneNo from Person p where p.name=?1");
			query.setParameter(1, name);
			return query.getResultList();
			
		}
		public List getpersonByNameandage(String name,int age) {
			EntityManager manager = getEntityManager().createEntityManager();
			Query query = manager.createQuery("from Person p where p.name=?1 and p.age=?2");
			
			query.setParameter(1, name);
			query.setParameter(2, age);
			return query.getResultList();
		}
	
}
