package com.itc.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int rollnumber;
	private String name;
	private String branch;
	
	public Student() {
		super();
		
	}
	public Student(int rollnumber, String name, String branch) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.branch = branch;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	@Override
	public String toString() {
		return "Student {rollnumber=" + rollnumber + ", name=" + name + ", branch=" + branch + "}";
	}
	
	
	

}
