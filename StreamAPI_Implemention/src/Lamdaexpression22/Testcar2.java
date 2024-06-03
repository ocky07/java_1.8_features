package Lamdaexpression22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Lamdaexpression.Car;

public class Testcar2 {
	public static void main(String[] args) {
		List<Car2> clist=new ArrayList<>();
			clist.add(new Car2(4,"B","ford"));
			clist.add(new Car2(1,"M-150 Raptor","ford"));
			clist.add(new Car2(6,"Aobra GT","shelby"));
			clist.add(new Car2(2,"B50 z","nissan"));		
			clist.add(new Car2(3,"Tupra ","tayota"));
	
	/*Comparator<Car2> com= (e1,e2) -> {
		return ((Car2)e2).getId()-((Car2)e1).getId();
	};
	
	
	Collections.sort(clist,com);
	*/
	Comparator<Car2> com=(e1,e2) ->{
		return e1.getName().compareTo(e2.getName());
	};
	Collections.sort(clist,com);
	for(Car2 n:clist) {
		System.out.println(n);
	}
	//clist.forEach(System.out::println);	
}
}

