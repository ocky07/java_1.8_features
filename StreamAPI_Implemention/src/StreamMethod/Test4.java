package StreamMethod;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add( 5);
	list.add(2);
	list.add(4);
	list.add(8);
	list.add(4);
	list.add(6);
	for(Integer i:list) {
		System.out.println(i*i);
	}
	
	
//--------------------------------------------------------------------
	List<Integer> list2=List.of(1, 6, 9, 3);  //
	List<Integer> list3=new ArrayList<>();
	list2.forEach(e->list3.add(e*e));
	System.out.println(list3);
}
}
