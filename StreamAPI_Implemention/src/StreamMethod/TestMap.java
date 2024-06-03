package StreamMethod;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap {
public static void main(String[] args) {
	List<Integer> list1=List.of(5, 6, 7, 2, 3);
	
	Function<Integer, String> fun=new Function<Integer, String>() {
		
		@Override
		public String apply(Integer t) {
			
			return t*t+"";
		}
	};
	
	
	List<String> list=list1.stream().map(fun)
			.collect(Collectors.toList());
	System.out.println(list);
}
}
