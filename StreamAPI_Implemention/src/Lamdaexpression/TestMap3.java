package Lamdaexpression;

import java.util.ArrayList;

import java.util.List;

import java.util.stream.Collectors;

public class TestMap3 {

	public static void main(String[] args) {
		
		List<Student> list3=new ArrayList<>();
		list3.add(new Student(1,"sahoo","java"));
		list3.add(new Student(2,"rocky","sql"));
		list3.add(new Student(3,"maxwell","java"));
		list3.add(new Student(4,"samantha","web"));
		list3.add(new Student(5,"pranitha","full stack"));
		
		List<Student> collect = list3.stream().map(e->{
			e.setName(e.getName().toUpperCase());
			return e;
			}).collect(Collectors.toList());
		for(Student s:collect) {
			System.out.println(s);
		}
		
	}
}
