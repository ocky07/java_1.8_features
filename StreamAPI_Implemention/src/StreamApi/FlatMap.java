package StreamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
private static List<Integer> list2;

public static void main(String[] args) {
	List<Integer> a1=List.of(5, 6,8);
	List<Integer> a2=List.of(1, 2,3);
	List<Integer> a3=List.of(5, 6);
	List<List<Integer>> list=List.of(a1, a2, a3);
	System.out.println(list);
	List<Integer> list2 = list.stream().flatMap(e->e.stream()).
			collect(Collectors.toList());
	System.out.println(list2);
	List<Integer> list3 = list2.stream().flatMap(e->Stream.of((e*e),(e*2))).
			collect(Collectors.toList());
	System.out.println(list3);
}
}
