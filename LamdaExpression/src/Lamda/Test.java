package Lamda;

@FunctionalInterface
interface Cab{
	public void bookCab();
}
abstract class Ola implements Cab{

//	@Override
//	public void bookCab() {
//		
//		System.out.println("ola cab is booked...");
//	}

	
	
}


public class Test {

	public static void main(String[] args) {
	
//	Cab cab=new Ola();
//		cab.bookCab();
		Cab cab=()->System.out.println("ola is booked");
		cab.bookCab();
}
}
