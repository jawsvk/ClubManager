
public class Member extends Person{

	private int memNumber;
	
	public Member(String firstName, String surName, int memNum)
	{
		super(firstName,surName);
		this.memNumber = memNum;
		
	}
	
	public Member(String surName, String firstName, String secondName, int memNum)
	{
		super(surName,firstName,secondName);
		this.memNumber = memNum;
		
	}
	
	public int getMemberNumber()
	{
		return this.memNumber;
	}
	public String toString()
	{
		return (super.toString()+ " " + this.memNumber);
		
	}
}
