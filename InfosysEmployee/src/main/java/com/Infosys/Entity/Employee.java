package com.Infosys.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long eid;
	private String name;
	private String profile;
	private double salary;
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", profile=" + profile + ", salary=" + salary + "]";
	}
	
	public Employee() {
		
	}
	public Employee(Long eid, String name, String profile, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.profile = profile;
		this.salary = salary;
	}

   
}
