package StaticClass_With_Non_Static_Member;

import StaticClass_With_Non_Static_Member.OuterClass.InnerClass;

public class Test {
public static void main(String[] args) {
	
	
	InnerClass incls=new OuterClass.InnerClass();
	incls.my();
	
	
}
}