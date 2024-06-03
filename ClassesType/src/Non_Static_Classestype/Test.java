package Non_Static_Classestype;

public class Test {
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		oc.m1();
		OuterClass.InnerClass in=oc.new InnerClass();
		in.m2();
		
	}
}
