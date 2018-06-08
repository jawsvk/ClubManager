package model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
	@Column(name="firstname") private String firstName;
	@Id @Column(name="surname") private String surName;
	@Column(name="secondname") private String secondName;
	
	//constructor
	public Person(String surName, String firstName,  String secondName) 
	{
		this.firstName = firstName;
		this.surName = surName;
		this.secondName = secondName;
	}

	public Person(String firstName, String surName)
	{
		this(firstName,surName,"");
		
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getSurName()
	{
		return this.surName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getSecondName()
	{
		return this.secondName;
	}
	
	public String toString() 
	{
		
		return (this.surName+" "+ this.firstName+" "+this.secondName);
	}
	
	public void Show()
	{
		System.out.println(this.toString());
	}
	
}
