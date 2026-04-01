package com.abhirat.binding;

import org.apache.logging.log4j.util.StringBuilderFormattable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "user")
public class User {
	

	private Integer id;
	
	private String name;
	
	private String email;
	
	private Integer age;
	
	private String lastName;
	
	public User()
	{
		
	}
	
	public User(int id , String name, String email ,int age ,String lastName)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.age=age;
		this.lastName=lastName;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	
	
}
