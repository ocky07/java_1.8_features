package StreamMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class AnimalTestInsert {
public static void main(String[] args) {
	
	List<Animals> alist=new ArrayList<>();
	alist.add(new Animals("Loin", 5, 6.2));
	alist.add(new Animals("Dog", 3, 4.5));
	alist.add(new Animals("wolf", 4, 4.5));
	alist.add(new Animals("Tiger", 4, 6.2));
	alist.add(new Animals("Chita", 5, 5.5));
	alist.add(new Animals("Elephate", 9, 30.9));
	alist.add(new Animals("Bafelo", 4,4.5 ));
	alist.add(new Animals("Dear", 4,4.5 ));
	
/*	List<Animals> list2=alist.stream().filter(e->e.getName().startsWith("T")).collect(Collectors.toList());
for(Animals a:list2) {
	System.out.println(a);
	
	
	// The animal this type of ClassType 
	// alist this is the 
	//new  it is the creatting o

} 
*/

//List<String> list3 = alist.stream().map(e->e.getName().toLowerCase()).distinct().collect(Collectors.toList());
//System.out.println(list3);


/*Comparator<Animals> com=(e1,e2) ->{
	return e2.getName().toLowerCase().compareTo(e1.getName().toLowerCase()); };
Collections.sort(alist,com);*/

	Comparator<Animals> com1=(e1,e2) ->{
	return (int) (e2.getSize()-e1.getSize()); };
	Collections.sort(alist,com1);

	List<String> list3 = alist.stream().filter(e->e.getAge()<=3).map(e->e.getName()).collect(Collectors.toList());

for(String a:list3) {
	System.out.println(a);
}

}}
