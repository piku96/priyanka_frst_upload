package com.packagee;

public class SingletonEmp {

	private String name;
	private String gender;
	 static int count=0;
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
	
public void display() {
	System.out.println("SingletonEmp name:"+this.name+"gender:"+this.gender);
}
public SingletonEmp() {
	count++;
}
}
