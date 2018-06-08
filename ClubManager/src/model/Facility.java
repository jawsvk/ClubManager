package model;
import java.text.MessageFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="facilities")
public class Facility {
@Id @Column (name="facilityname") private String name;
 private String description;
 
 //constructors
 public Facility(String Name, String Description)
 {
	 this.name = Name;
	 this.description = Description;
 }
 
 public Facility(String Name)
 {
	 this(Name,"");
	 
 }

public String getName() {
	return name;
}

public String getDescription() {
	return description;
}
 
public String toString()
{
	if(description.isEmpty())
	{
		return (this.name);
	}
	else {
		return (MessageFormat.format("{0} \"{1}\" ",this.name,this.description));
		}
 
	}


public void Show()
	{
		System.out.println(this.toString());
	}

}
