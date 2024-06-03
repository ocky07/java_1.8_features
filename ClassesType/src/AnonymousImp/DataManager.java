package AnonymousImp;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataManager {
public List<Student> sortByName(List<Student> list)
{
	Comparator<Student> com=new Comparator<Student>() {
		
		@Override
		public int compare(Student o1, Student o2) {
			
			return o1.getName().compareTo(o2.getName());
		}
	};
	Collections.sort(list,com);
	return list;
}
public list<Student>

 } 
