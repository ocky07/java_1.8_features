package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Lamdaexpression.Student;

public class TestSorted2 {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(1,"sahoo","java fullstack"));
		list.add(new Student(2,"samantha","sql"));
		list.add(new Student(3,"raji","web tech"));
		list.add(new Student(4,"max","java"));
		list.add(new Student(5,"raj","python"));
		
		List<Student> st=list.stream().sorted((e,o)->{
		return e.getName().compareToIgnoreCase(o.getName());
		}).collect(Collectors.toList());
		list.forEach(e->System.out.println(e));
		
	}
}
