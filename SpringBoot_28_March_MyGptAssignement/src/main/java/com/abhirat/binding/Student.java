package com.abhirat.binding;

public class Student {
	
	private Integer id;
	
	private String name;
	
	private String course;


	public Student() 
	{
		
	}

	public Student(Integer id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
	
	
	
	

}
