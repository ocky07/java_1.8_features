package com.hibernate.Utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryUtil {

	private static EntityManagerFactory factory;
	
	private EntityManagerFactoryUtil() {
		
	}
	
	public static EntityManagerFactory getFactory() {
		if(factory==null) {
			factory=Persistence.createEntityManagerFactory("prudhvi");
		}
		return factory;
	}
	
}