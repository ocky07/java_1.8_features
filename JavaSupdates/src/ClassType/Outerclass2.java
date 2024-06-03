package ClassType;

public class Outerclass2 {
	private static int a=100;
	static void m1() {
		System.out.println("static method in outer class");
	}
	public static class InnerClass{
		static void m2() {
			System.out.println("static method in inner class");
			System.out.println(a);
		}
	}
	
}
