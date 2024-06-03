package com.prudhvi.hibernate.entityRepository.Test;

import java.util.ArrayList;
import java.util.List;

import com.prudhvi.hibernate.entity.Person;
import com.prudhvi.hibernate.entityRepository.PersonRepository;

public class Test {
public static void main(String[] args) {
	List<Person> listp=new ArrayList<>();
	listp.add(new Person(1, "raj", "male", 23, "9014555551"));
	listp.add(new Person(2, "loki", "male", 22, "9014555552"));
	listp.add(new Person(3, "ram", "male", 21, "9014555553"));
	listp.add(new Person(4, "pooran", "male", 20, "9014555554"));
	Person p = new Person(1, "raj", "male", 23, "9014555551");
	
	PersonRepository pr=new PersonRepository();
   System.out.println(pr.savePerson(p));
	
	
	
}
}