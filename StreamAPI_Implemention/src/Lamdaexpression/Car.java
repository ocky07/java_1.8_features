package Lamdaexpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Car {

	private int id;
	private String name;
    private String brand;
	public Car(int id, String name, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", brand=" + brand + "]";
	}
	
}
class Dreive{
	public static void main(String[] args) {
		List<Car> clist=new ArrayList<>();
		clist.add(new Car(1,"mustag","ford"));
		clist.add(new Car(2,"F-150 Raptor","ford"));
		clist.add(new Car(3,"Cobra GT","shelby"));
		clist.add(new Car(4,"350 z","nissan"));		
		clist.add(new Car(5,"supra ","tayota"));	
		Comparator<Car> com= (e1,e2) -> {
			return e1.getName().compareToIgnoreCase(e2.getName());
		};
		Collections.sort(clist, com);
		clist.forEach(System.out::println);
	}
}
