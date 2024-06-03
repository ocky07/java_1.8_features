package Lamdaexpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class clotheDreiver{
	public static void main(String[] args) {
		List<Clothes> list=new ArrayList<>();
		list.add(new Clothes(1, "shirt", "killer"));
		list.add(new Clothes(2, "coton", "dnmx"));
		list.add(new Clothes(3, "T-shirt", "puma"));
		list.add(new Clothes(4, "silk", "ajio"));
		list.add(new Clothes(5, "cotton", "netplay"));
		
	Collections.sort(list,(e1,e2)->{
		return e1.getType().compareToIgnoreCase(e2.getType());
	});
		for(Clothes c:list) {
			System.out.println(c);
		}
	}
}
public class Clothes {
private	int id;
private	String type;
private String brand;
public Clothes(int id, String type, String brand) {
	super();
	this.id = id;
	this.type = type;
	this.brand = brand;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Clothes [id=" + id + ", type=" + type + ", brand=" + brand + "]";
}


}
