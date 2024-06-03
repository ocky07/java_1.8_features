package ClassType;


import java.io.ObjectInput;
import java.util.Comparator;

import ClassType.Outerclass.Innerclass;

public class Test {

	public static void main(String[] args) {
//		 Outerclass oc=new Outerclass();
//		 
//		 oc.m1();
//		
//		 Innerclass innerclass=oc.new Innerclass();
//		 innerclass.m2();
		 
		Outerclass2.InnerClass.m2(); // by using class name
		 Outerclass2.InnerClass innerclass1=new Outerclass2.InnerClass();
		 innerclass1.m2();//by using object creation
		 
	}
	}
