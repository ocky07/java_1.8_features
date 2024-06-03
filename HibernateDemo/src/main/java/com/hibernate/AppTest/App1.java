package com.hibernate.AppTest;

import java.util.List;

import com.hibernate.Entity.Person;
import com.hibernate.EntityRepositry.PersonReposetry;

public class App1 {
public static void main(String[] args) {
		
	Person p = new Person(101, "jam", "female", 16, "143", "loveda@gmail.com");
	
		PersonReposetry reposetry = new PersonReposetry();
		
		
		//System.out.println(reposetry.savePerson(p6));	
		//System.out.println(reposetry.savePerson(p1));
		
		//reposetry.savePerson(p2);
		//reposetry.savePerson(p3);
		//reposetry.deletePersonById(105);
		
		
		System.out.println(reposetry.updatePerson(p));
	}
	
}
