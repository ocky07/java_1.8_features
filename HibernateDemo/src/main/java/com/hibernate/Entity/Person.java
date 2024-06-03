package com.hibernate.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="Person")
public class Person implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_gender")
	private String gender;
	@Column(name="p_age")
	private Integer age;
	@Column(name="phone_num")
	private String phoneNum;
	@Column(name="p_gmail")
	private String gmail;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public Person() {
		super();
	}
	public Person(Integer id, String name, String gender, Integer age, String phoneNum, String gmail) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNum = phoneNum;
		this.gmail = gmail;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gender, gmail, id, name, phoneNum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && Objects.equals(gender, other.gender)
				&& Objects.equals(gmail, other.gmail) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNum, other.phoneNum);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNum=" + phoneNum
				+ ", gmail=" + gmail + "]";
	}
	
}
