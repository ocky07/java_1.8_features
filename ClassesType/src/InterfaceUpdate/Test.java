package InterfaceUpdate;

interface A{
	default void m3() {
		System.out.println("Hi");
	}
}
interface C{
	default void m3() {
		System.out.println("Hey");
	}
}
class B implements A,C{

	public void m2() {
		System.out.println("hello");
	}
	@Override
	public void m3() {
		
		A.super.m3();
	}
	public void m31() {
		C.super.m3();
	}
	
	
}
public class Test {
	public static void main(String[] args) {
		
	B b=new B();
	b.m3();
	b.m31();
	b.m2();
  
}
}
/*
 * Rules to defult methodin interface:
 * Defult methodin interface should not have same method sig as objaect class method
 * Note :-
 *      if there are multiple parent interfaces which as same defult becomes mandatory to  to override 
 *      the commmon defult in child class implementation to overriden method can be taken from  either parent interfaces of new 
 *      implemetation can be provided in child class
 
*/













