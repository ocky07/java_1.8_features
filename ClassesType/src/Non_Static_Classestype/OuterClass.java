package Non_Static_Classestype;

public class OuterClass {
	int a=10;
	public void m1() {
		System.out.println("m1() in outer class");
	}
	public  class InnerClass{
		int b=25;
		public void m2() {
			System.out.println("m2() in outer class");
		}
		
	}
}
