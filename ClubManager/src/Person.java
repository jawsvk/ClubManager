
public class Person {
	private String firstName;
	private String surName;
	private String secondName;
	
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
