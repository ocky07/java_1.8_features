package StreamApi;

import java.util.ArrayList;
import java.util.List;

import Lamdaexpression.Student;

public class TestMax2 {

	public static void main(String[] args) {
		
	
	 List<Student> slist=new ArrayList<>();
	 slist.add(new Student(1, "prudhvi", "java"));
	 slist.add(new Student(2, "alpha", "python"));
	 slist.add(new Student(3, "Bita", "web tech"));
	 slist.add(new Student(4, "Gama", "sql"));
	 slist.add(new Student(5, "Lambda", "java full stack"));
	 slist.add(new Student(6, "xaxwejjjjjjll", "jdbc"));
	 Student student=slist.stream().max((e1,e2)->{
		 return e1.getName().compareToIgnoreCase(e2.getName());
	 }).get();
	  {
		 
	 }
	 System.out.println(student);
	 
}}
