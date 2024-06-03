package Lamdaexpression;

import java.util.List;
import java.util.function.Function;

public class TestMap2 {
	public static void main(String[] args) {
		
		List<Integer> list=List.of(1,2,3);
		Function<Integer, String> fun=new Function<Integer, String>(){
			
			@Override
			public String apply(Integer t) {
				
				return t*t+"";
			}
		};
		
	}
}
