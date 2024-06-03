package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlashMap2 {

	public static void main(String[] args) {
		
		List<String> a1=List.of("monday","tuesday");
		List<String> a2=List.of("wednesday","thursday");
		List<String> a3=List.of("friday","saturday");
		List<String> a4=List.of("sunday","monday");
		
		List<List<String>> list=List.of(a1,a2,a3,a4);
		
		
		Set<String> set=list.stream().flatMap(e->e.stream()).
		flatMap(e->Stream.of((e.toUpperCase()),(e.toLowerCase()))).collect(Collectors.toSet());
		set.forEach(Test :: display);
	}
}
