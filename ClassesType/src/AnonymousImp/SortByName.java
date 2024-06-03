package AnonymousImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByName {
public static void main(String[] args) {
	 
	List<Student> list=new ArrayList<Student>();
	list.add(new Student(1, "abhijith", "abhi@gmaile.com"));
	list.add(new Student(2, "sahoo", "sahoo@gmaile.com"));
	list.add(new Student(3, "ranger", "ranger@gmaile.com"));
	list.add(new Student(4, "maxwell", "max@gmaile.com"));
	list.add(new Student(5, "scott", "scot@gmaile.com"));
	list.add(new Student(6, "smella", "smel@gmaile.com"));
	DataManager datamanager=new DataManager();
	List<Student> sortByName=datamanager.sortByName(list);
	for(Student s:sortByName) {
		System.out.println(s);
	}
	}
}
