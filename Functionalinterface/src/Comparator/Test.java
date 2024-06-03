package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static double m1(Emp o1,Emp o2) {
		double t=((Emp)o1).getSal()-((Emp)o2).getSal();
		return t;
	}
public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the emp details :");
	ArrayList<Emp> list = new ArrayList<>();
	list.add(new Emp(2, "prudhvi","pemail1", 25, 50000.99, 10));
	list.add(new Emp(3, "abhil","aemail2", 18, 50000.99, 10));
	list.add(new Emp(6, "anup","aemail3", 22, 100000.99, 20));
	list.add(new Emp(1, "naga","nemail4", 26, 1000000.99, 20));
	list.add(new Emp(4, "bhramma","bemail5", 21, 52023000.99, 10));
	list.add(new Emp(5, "raki", "remail6", 16, 806000.99, 30));
	list.add(new Emp(7, "john", "jemail7", 20, 5000.99, 30));
	list.add(new Emp(8, "maik", "memail8", 25, 205000.99, 40));
	list.add(new Emp(9, "kalki", "kemail8", 28, 6000.99, 40));
	Comparator<Emp> com= (e1,e2) -> {
		 return ((Emp)e2).getDept()-((Emp)e1).getDept();
	};
	

	String s="kjhksf";
	String[] r=s.split(s);
      Collections.sort(list,com1);
	//System.out.println(list);
      for(Emp m:list) {
    	  int a=21;
    	  if(a<m.getAge()) 
    	  {
    	  System.out.println(m);
    	  }
      }
	
}
	
	
}
