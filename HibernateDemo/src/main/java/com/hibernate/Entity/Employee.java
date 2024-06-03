package com.hibernate.Entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private  int Eid;
@Column
private String Ename;
@Column
private String email;
public Employee(int eid, String ename, String email) {
	super();
	Eid = eid;
	Ename = ename;
	this.email = email;
}

public int getEid() {
	return Eid;
}
public void setEid(int eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", email=" + email + "]";
}
@Override
public int hashCode() {
	return Objects.hash(Eid, Ename, email);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(Eid, other.Eid) && Objects.equals(Ename, other.Ename) && Objects.equals(email, other.email);
}

}
