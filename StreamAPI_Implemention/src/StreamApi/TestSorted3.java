package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

import Lamdaexpression.Student;

public class TestSorted3 {

public static List<Student> sortByName(List<Student> list){
		return list.stream().sorted((e1,e2)->{
			return e1.getName().compareToIgnoreCase(e2.getName());
		}).collect(Collectors.toList());
		}
public static List<Student> sortByCourse(List<Student> list){
	return list.stream().sorted((e1,e2)->{
		return e1.getName().compareToIgnoreCase(e2.getName());
	}).collect(Collectors.toList());
}
}
	
