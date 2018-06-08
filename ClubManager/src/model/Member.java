package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="member")
public class Member extends Person implements Comparable<Member> {

	private int memNumber;
	
	public Member() {
		super();
	}
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
	
	public Integer getMemberNumber()
	{
		return this.memNumber;
	}
	public String toString()
	{
		return (super.toString()+ " " + this.memNumber);
		
	}
	
	@Override
	public int compareTo(Member other)
	{
		return this.getMemberNumber().compareTo(other.getMemberNumber());
		
	}
}
