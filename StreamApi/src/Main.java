import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		
		List<Employe1> elist = new ArrayList<>();
		
		elist.add(new Employe1(123, "prudhvi", 1200000, 23, "O+"));
		elist.add(new Employe1(256, "rahul", 400000, 22, "B-"));
		elist.add(new Employe1(389, "sailaja", 600000, 22, "O+"));
		elist.add(new Employe1(459, "chalapathi", 100000, 21, "B+"));
		elist.add(new Employe1(557, "max", 16000, 24, "A+"));
		elist.add(new Employe1(656, "max", 990000, 24, "B+"));
		elist.add(new Employe1(754, "kelly", 100000, 21, "A+"));
		
		/* i would loke to print the all emp 
		for(Employe1 e:elist)System.out.println(e+"\n");
		for(Employe1 e:elist)System.out.println(e.getId()+"\n");
		for(Employe1 e:elist)System.out.println(e.getSal()*3+"\n");
		for(Employe1 e:elist)System.out.println(e.getName().toUpperCase()+"\n");
		*/
		
		elist.stream().map((e1->e1.getSal())
		
	}
}
