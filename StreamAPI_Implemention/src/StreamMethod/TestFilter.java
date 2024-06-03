package StreamMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestFilter {
public static void main(String[] args) {
	
	List<Integer> list1=new ArrayList<>();
	list1.add(3);
	list1.add(6);
	list1.add(9);
	list1.add(12);
	list1.add(77);
	list1.add(8);
	list1.add(566);
	list1.add(9);
	list1.add(66);
	list1.add(2);
	
	
	List<Integer> list2=new ArrayList<>();
	/*List<Integer> list3=new ArrayList<>();
	for(Integer e:list1) {
		if(e%2==0) {
			list2.add(e);
		}
		else list3.add(e);
	}*/
	System.out.println("The Even elements in the array: "+list2);
	//System.out.println("The Odd elements in the array: "+list3);
	Stream<Integer> streamList=list1.stream();
Predicate<Integer> pre=new Predicate<Integer>() {
	
	@Override
	public boolean test(Integer t) {
		
		return t%2==0;
	}
};
}
}
