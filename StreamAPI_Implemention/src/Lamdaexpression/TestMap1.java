package Lamdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap1 {
public static void main(String[] args) {
	
	List<Integer> list=List.of(2,4,5,84,53,48,5,34,6,4);
	List<Integer> list2=Arrays.asList(53,54,68,48,6);
	
	
	
	Function<Integer, String> fun=new Function<Integer, String>() {
		
		@Override
		public String apply(Integer t) {
			
			return t*t+"";
		}
	};
	
	//List<Integer> list2=list.stream().map(e ->e*e).collect(Collectors.toList());
	List<String> list2=list.stream().map(fun).collect(Collectors.toList());
	System.out.println(list2);
	
}
	
}
