package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestFilter1 {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<>();
	list.add(8);
	list.add(7);
	list.add(6);
	list.add(5);
	list.add(4);
	list.add(3);
	list.add(2);
	list.add(1);
	/*List<Integer> list1=new ArrayList<>();
	for(Integer c:list) {
		if(c%2==0) {
			list1.add(c);
		}
		
	}*/
	
	List<Integer> list2=list.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(list2);
	
	
}
}
