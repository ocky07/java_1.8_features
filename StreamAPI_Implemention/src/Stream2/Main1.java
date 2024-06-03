package Stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {

	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,1,5,3,4,6,7,8,9);
		
		 list.stream().forEach(System.out::println);
		
		
		
	}
	
}
