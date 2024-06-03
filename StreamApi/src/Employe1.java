import java.util.Objects;

public class Employe1 {
	private int id;
	private String name;
	private int sal;
	private int age;
	private String bloodType;
	
	public Employe1() {
		super();
	}

	public Employe1(int id, String name, int sal, int age, String bloodType) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.bloodType = bloodType;
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	@Override
	public String toString() {
		return "Employe1 [id=" + id + ", name=" + name + ", sal=" + sal + ", age=" + age + ", bloodType=" + bloodType
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, bloodType, id, name, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe1 other = (Employe1) obj;
		return age == other.age && Objects.equals(bloodType, other.bloodType) && id == other.id
				&& Objects.equals(name, other.name) && sal == other.sal;
	}
	
	
}
