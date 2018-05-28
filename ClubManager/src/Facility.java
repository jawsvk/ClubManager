import java.text.MessageFormat;

public class Facility {
 private String name;
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
