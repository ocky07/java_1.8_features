package Lamda;

interface Cab1{
	public void bookCab(String Source,String destination);
}
//class Ola1 implements Cab1{
//
//	@Override
//	public void bookCab(String Source,String destination) {
//		System.out.println("Ola cab is from  "+Source+" To "+destination);
//		
//	}
//	
//}

public class Test2 {
	
	public static void main(String[] args) {
	
//		Cab1 cab=new Ola1();
//		cab.bookCab("Hyd", "Bnglr");
		
		Cab1 cab=(String Source,String destination)->System.out.println("Ola cab is from  "+Source+" To "+destination);
		cab.bookCab("Hyd", "bgr");
}
}
//--------------------------------------------------------------------------------------------------------------------------------------
//interface Cab{
//	public String BookedCab(String source,String destination);
//}
//
//
//class Ola implements Cab{
//
//	@Override
//	public String BookedCab(String source, String destination) {
//	
//		return ("Price is :5000 Rs");
//	}
//	
//}
//public class Test{
//	public static void main(String[] args) {
//		Cab cab=new Ola();
//		System.out.println(cab.BookedCab("hyd", "chennai"));
//		
//	}
//}
//======================================================================================================================================

//public class Test{
//	public static void main(String[] args) {
//		Cab cab=(Source,destination)->{system.out.println("ola cab is booked from "+source+"To"+destination);
//    return ("Price is 5000 RS");      
//     };
//		
//     syso(cab.bookcab("hyd","mumbai"));
//	}
//}
