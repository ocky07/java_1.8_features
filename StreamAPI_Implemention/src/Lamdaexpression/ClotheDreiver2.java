package Lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
class Clothes2{
	public static void main(String[] args) {
		
	}
}
public class ClotheDreiver2 {

	public void sortByType(List<Clothes> list) {
	Collections.sort(list,(a1,a2)->{
		return a1.getType().compareToIgnoreCase(a2.getType());
	});
	// list.forEach(e->System.out.println(e));
	//for(Clothes c:list) {
		//System.out.println(c);
	//}
	
	List<Clothes> list2=list.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(list2);
	
	
	}
	public void sortByBrand(List<Clothes> list) {
		Collections.sort(list,(a1,a2)->{
			return a1.getBrand().compareToIgnoreCase(a2.getBrand());
		});
		// list.forEach(e->System.out.println(e));
		for(Clothes c:list) {
			System.out.println(c);
		}
	}
	
	}
