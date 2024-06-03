package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class TestDistinct {
public static void main(String[] args) {
	//at will give the uniqe values in the sorted list...
	
	List<Integer> list=List.of(1,2,3,6,5,49,8,7,6,56,5,9,1);
	
	List<Integer>list2=list.stream().distinct().sorted().collect(Collectors.toList());
	
	for(Integer i:list2)System.out.println(i);
}
}
