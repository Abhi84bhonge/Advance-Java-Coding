package com.Staff.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int staffid;
	private String name;
	private String profile;
	private double salary;
	private int experience;
	
	
	public Staff(int staffid, String name, String profile, double salary, int experience) {
		super();
		this.staffid = staffid;
		this.name = name;
		this.profile = profile;
		this.salary = salary;
		this.experience = experience;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Staff [staffid=" + staffid + ", name=" + name + ", profile=" + profile + ", salary=" + salary
				+ ", experience=" + experience + "]";
	}
	public Staff() {
		super();
	}
	
	
}
