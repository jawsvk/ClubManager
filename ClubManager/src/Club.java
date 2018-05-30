import java.util.ArrayList;
import java.util.HashMap;


public class Club {

	private int currentNumber;
	//Member[] memberList = new Member[1];
	private ArrayList<Member> memberList = new ArrayList<Member>();
	
	private HashMap <String,Facility> FacilityList = new HashMap <String,Facility>();
	
	public Club() {
		currentNumber = 0;
		
	}
	
	public Facility addFacility(Facility F)
	{
		FacilityList.put(F.getName(), F);
		return FacilityList.get(F.getName());
	}
	
	public void removeFacility(Facility F)
	{
		FacilityList.remove(F.getName());
	}
	
	public Facility getFacility(String name)
	{
		return FacilityList.get(name);
	}
	
	public Facility[] getFacilities()
	{
		Facility[] array = new Facility[FacilityList.size()];
		
		return FacilityList.values().toArray(array);
	}
	
	public void showFacilities()
	{
		for(Facility F : getFacilities()) 
		{
			if(F ==null) continue;
			F.Show();	
		}
	}
	public Member addMember(String surName, String firstName, String secondName) {
		
		currentNumber++;
		//using array
//		memberList = Arrays.copyOf(memberList,currentNumber);
//		
//		memberList[currentNumber-1] = new Member(surName,firstName,secondName, currentNumber);
//		return memberList[currentNumber-1] ;
		
		//using ArrayList
		memberList.add(new Member(surName,firstName,secondName, currentNumber));
		return memberList.get(currentNumber-1);
		
	}
	
	public Member addMember(String surName, String firstName) {
	
		currentNumber++;
		
		//using array
//		memberList = Arrays.copyOf(memberList,currentNumber);
//				
//		memberList[currentNumber-1] = new Member(surName,firstName, currentNumber);
//		return memberList[currentNumber-1] ;
		
		//using ArrayList
		memberList.add(new Member(surName,firstName, currentNumber));
		return memberList.get(currentNumber-1);
	}
	
	public void removeMember(int num) {
		

		//using Array
//		for(int i = 0; i<memberList.length; i++)
//			if(memberList[i].getMemberNumber()== num)
//			{
//				memberList[i]= null;
//		}
		
		//using ArrayList
		for(Member m : memberList)
		{
			if(m.getMemberNumber()==num) 
				{
				
					memberList.remove(memberList.indexOf(m));
					break;
				}
			
		}
	
	
	}
	
	public Member getMember(int num)
	{
		int index = 0;
		for(int i =0; i <memberList.size(); i++) {
			if(memberList.get(i).getMemberNumber()==num) {
				
				index = memberList.get(i).getMemberNumber();
			}
			
		}
		return memberList.get(index);
	}
	
	public void showMembers()
	{
		for(Member m : memberList) {
			if(m ==null) continue;
			m.Show();
		}
	
	}
	
	public void Show()
	{
		System.out.println("-------Member List----------");
		showMembers();
		System.out.println("\n-------Facilities List----------");
		showFacilities();
	}
	
	public void ShowBookings(ArrayList<Booking> bookinglist)
	{
		for(Booking B : bookinglist)
		{
			B.Show();
		}
	}
}
