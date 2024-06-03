package Comparator ;

import java.util.Comparator;

public class Emp implements Comparator<Emp>{
private int id;
private String name;
private String email;
private int age;
private double sal;
private int dept;
public Emp(int id, String name, String email, int age, double sal, int dept) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.sal = sal;
	this.dept = dept;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", sal=" + sal + ", dept=" + dept
			+ "]";
}
@Override
public int compare(Emp o1, Emp o2) {
	
	 double t=((Emp)o1).getSal()-((Emp)o2).getSal();
	 return t;
}

}
