package StreamMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestSorted {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(72);
	list.add(6);
	list.add(78);
	list.add(89);
	list.add(66);
	list.add(56);
	list.add(4);
	list.add(89);
	list.add(69);
	list.add(48);
  List<Integer> list2=list.stream().sorted().collect(Collectors.toList());
  //System.out.println(list2);  here internally calling to the totring method []... 
//--------------------------------------------------------------------------
  for(Integer i:list2) {
	  System.out.println(i);
  }
}
}
