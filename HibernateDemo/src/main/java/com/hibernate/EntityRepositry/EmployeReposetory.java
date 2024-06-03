package com.hibernate.EntityRepositry;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.Entity.Employee;
import com.hibernate.Entity.Person;

public class EmployeReposetory {

private EntityManager getEntityManager(){
		return Persistence.createEntityManagerFactory("prudhvi").createEntityManager();
	}
public String saveEmploy(Employee emp) {

	EntityManager manager=getEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	transaction.begin();
	manager.persist(emp);
	transaction.commit();
	return "save data";
}
		public Employee getEmployeById(int id) {
			EntityManager manager = getEntityManager();
			return manager.find(Employee.class, id);
}
	
}
