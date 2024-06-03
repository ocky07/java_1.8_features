package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted2 {
public static void main(String[] args) {
	
	List<Customer> list=new ArrayList<>();
	list.add(new Customer(1, "john wick", "john@gmain.com"));
	list.add(new Customer(2, "sena", "sena@gmain.com"));
	list.add(new Customer(3, "veer sing", "v@gmain.com"));
	list.add(new Customer(4, "jenny", "jnn@gmain.com"));
	list.add(new Customer(5, "scott", "scot@gmain.com"));
	list.add(new Customer(6, "max", "max@gmain.com"));
	List<Customer> list2=list.stream().sorted((e1,e2)->{
		return e1.getName().compareToIgnoreCase(e2.getName());
	}).collect(Collectors.toList());
	list2.forEach(e->System.out.println(e));
	
	
}
}
