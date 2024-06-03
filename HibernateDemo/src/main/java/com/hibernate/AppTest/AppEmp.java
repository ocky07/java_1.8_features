package com.hibernate.AppTest;

import com.hibernate.Entity.Employee;
import com.hibernate.EntityRepositry.EmployeReposetory;

public class AppEmp {
public static void main(String[] args) {
	
	Employee emp=new Employee(0, "jam", "j@EMAIL");
	
	EmployeReposetory er=new EmployeReposetory();
	
	System.out.println(er.saveEmploy(emp));
	
	
}
}
