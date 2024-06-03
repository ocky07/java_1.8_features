package ClassType;

public class Outerclass {

	int a;
	void m1() {
		System.out.println("m1 from outer class");
	}
	public class Innerclass{
		void m2() {
			System.out.println(" m2 from inner class");
		}
	}
}
