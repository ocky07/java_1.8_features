package com.hibernate.EntityRepositry;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.Entity.Person;

public class PersonReposetry {

	private EntityManager getEntityManager(){
		return Persistence.createEntityManagerFactory("prudhvi").createEntityManager();
	}

		public String savePerson(Person person) {
//			EntityManagerFactory factory = Persistence.createEntityManagerFactory("prudhvi");
//			EntityManager manager = factory.createEntityManager();
			EntityManager manager=getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(person);
			
			transaction.commit();
			return "save data";
	}
		public String updatePerson(Person person) {
			EntityManager manager = getEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			transaction.begin();
			manager.merge(person);
			transaction.commit();
			return "Data Updated";
		}
		public Person getPersonById(int id) {
			EntityManager manager = getEntityManager();
			return manager.find(Person.class, id);
		}
		public Person getPersonByName(String name) {
			EntityManager manager = getEntityManager();
			return manager.find(Person.class, name);
		}
		public String deletePersonById(int id) {
			EntityManager manager = getEntityManager();
			Person data = manager.find(Person.class, id);
			EntityTransaction transaction = manager.getTransaction();
			if(data != null) {
			transaction.begin();
			manager.remove(data);
			
			transaction.commit();
			return "Data Deleted";
			
			}else {
				return "no data found to delete";
			}
			
		}
		public List<Person> getAllData() {
			EntityManager manager = getEntityManager();
			Query query = manager.createQuery("FROM Person p");
			List<Person> list = query.getResultList();
			return list;
		}
		public List getPhoneNumberByName(String name) {
			EntityManager manager = getEntityManager();
			String sql ="SELECT p.phoneNum From Person p WHERE p.name=?1";
			Query query = manager.createQuery(sql);
			query.setParameter(1, name);
			List list = query.getResultList();
			return list;
		}
		
	
}
