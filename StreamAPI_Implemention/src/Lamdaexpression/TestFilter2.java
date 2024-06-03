package Lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestFilter2 {
	public static void main(String[] args) {
		
     List<Clothes> clist=new ArrayList<Clothes>();
	
	clist.add(new Clothes(1,"shorts","nike"));
	clist.add(new Clothes(2,"pant","puma"));
	clist.add(new Clothes(3,"t-short","nike"));
	clist.add(new Clothes(4,"shirt","netplay"));
	clist.add(new Clothes(5,"shirt","dnmx"));
	clist.add(new Clothes(6,"short","nike"));
	clist.add(new Clothes(7,"shorts","puma"));
	clist.stream().filter(e1->{
		return e1.getType().equals("short");
}).collect(Collectors.toList());
	for(Clothes c:clist ) {
		System.out.println(c);
		}
	}
	
	}
