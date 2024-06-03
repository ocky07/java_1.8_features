package StreamMethod;

public class Animals {
String name;
int  age;
double size;
public Animals(String name, int age, double size) {
	super();
	this.name = name;
	this.age = age;
	this.size = size;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getSize() {
	return size;
}
public void setSize(double size) {
	this.size = size;
}
@Override
public String toString() {
	return "Animals [name=" + name + ", age=" + age + ", size=" + size + "]";
}

}
