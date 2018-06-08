
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import model.Facility;


public class ClubApplication {

	public static void main (String[] args) {
		
		Club club1 = new Club();
		BookingRegister BookingRegister1 = new BookingRegister();
		club1.addMember("Tan","Ah","Beng");
		club1.addMember("Stella","Artois");
		club1.addMember("Sia","Barbella");
		club1.addMember("Chong","Aois","Lo");
		club1.addMember("Ellio","Martois");
		
//		Facility f1 = new Facility("BasketBall Court", "This is the only Basketball Court");
//		Facility f2 = new Facility("Swimming Pool");
		
		club1.addFacility(new Facility("BasketBall Court", "This is the only Basketball Court"));
		club1.addFacility(new Facility("Meeting Room 1","Large meeting room for 20 pax"));
		club1.addFacility(new Facility("Swimming Pool"));
	
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("d-MMM-yyyy H:mm");
		
		LocalDateTime d1 = LocalDateTime.parse("1-Jan-2018 17:00",df);
		LocalDateTime d2 = LocalDateTime.parse("1-Jan-2018 19:00",df);
		LocalDateTime d3 = LocalDateTime.parse("1-Jan-2018 20:00",df);
		
		System.out.println(d1);
		System.out.println(d2);
		
		
		try {
			BookingRegister1.addBooking(club1.getMember(3), club1.getFacility("Meeting Room 1"), d1,d2);
			BookingRegister1.addBooking(club1.getMember(2), club1.getFacility("Meeting Room 1"), d2,d3);
			
			}
		catch(BadBookingException e) {
			e.getMessage();
		  }
	}
	
	public void TestException(Club club1, LocalDateTime d1, LocalDateTime d2)
	{
		//testing BadBookingException	
		//try {
		//Booking b1 = new Booking(club1.getMember(3), null, d1,d2);
		//}
		//catch (BadBookingException e) {}
		
	}
	public void exeDelMember(Club club1) {
		club1.showMembers();
		System.out.println("remove member");
		club1.removeMember(3);
		System.out.println("new list");
		club1.showMembers();
	}
}
