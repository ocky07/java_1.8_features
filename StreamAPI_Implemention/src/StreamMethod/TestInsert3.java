package StreamMethod;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestInsert3 {
public static void main(String[] args) {
	List<Customer> list=new ArrayList<>();
	list.add(new Customer(1, "john wick", "john@gmain.com"));
	list.add(new Customer(2, "sena", "sena@gmain.com"));
	list.add(new Customer(3, "veer sing", "v@gmain.com"));
	list.add(new Customer(4, "jenny", "jnn@gmain.com"));
	list.add(new Customer(5, "scott", "scot@gmain.com"));
	list.add(new Customer(6, "max", "max@gmain.com"));
	
Function<Customer, String> fun=new Function<Customer, String>() {
		
		@Override
		public String apply(Customer t) {
			
			return t.getName().toUpperCase();
		}
	};
	
	List<String> list4=list.stream().map(fun)
			.collect(Collectors.toList());
	System.out.println(list4);
//-----------------------------------------------------------------------
	List<String> list5=list.stream().map(e->e.getName().toUpperCase())
	.collect(Collectors.toList());
	System.out.println(list5);
//------------------------------------------------------------------------
	List<Customer> list6=list.stream().map(e->{
		
	e.setName(e.getName().toUpperCase());
	return e;
	}).collect(Collectors.toList());
	System.out.println(list6);
//	---------------------------------------------------
	// to print the different way by using the lambda expresion we can print the all elements
	list6.forEach(e->System.out.println(e));
}
}
