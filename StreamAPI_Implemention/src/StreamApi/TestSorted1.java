package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class TestSorted1 {
  public static void main(String[] args)
  	 {
	
	  List<Integer> list=List.of(10,22,2,68,4,64,6,45,9,5);//immutable object
	 
	  List<Integer> list2=list.stream().sorted().collect(Collectors.toList());
	 
	  System.out.println(list2);
	
  	 }
 }
