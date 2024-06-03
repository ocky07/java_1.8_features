package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter2 {
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
	List<Integer> list2=list1.stream().filter(e->e%2==0)
			.collect(Collectors.toList());
	System.out.println(list2);
}
}
