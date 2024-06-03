package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class TestMax {
public static void main(String[] args) {
	 List<Integer> list=new ArrayList<>();
	 list.add(10);
	 list.add(20);
	 list.add(20);
	 list.add(10);
	 list.add(10);
	 list.add(60);
	 list.add(70);
	 Integer max=list.stream().min((e1,e2)->e1-e2).get();
	 System.out.println(max);
	 
}
}
