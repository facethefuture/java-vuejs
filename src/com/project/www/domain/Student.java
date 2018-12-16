package com.project.www.domain;

public class Student {
	private long id;
	private String name;
	private int age;
	public Student(long id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public long getId(){
		return this.id;
	}
	public void setId(long id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}
}
