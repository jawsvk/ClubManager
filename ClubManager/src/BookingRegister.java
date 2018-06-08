import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import model.Facility;
import model.Member;

public class BookingRegister {

	private HashMap<Facility, ArrayList<Booking>> BookingList; 
	Booking B;
	public BookingRegister()
	{
		BookingList = new HashMap<Facility, ArrayList<Booking>>(); 
	}
	
	public void addBooking(Member m, Facility f, LocalDateTime start, LocalDateTime end) throws BadBookingException
	{
		try{
			   B = new Booking(m,f,start,end);
		   }
		
		catch(BadBookingException e) {
			System.out.println(e.getMessage());
		}
	
		//check if there's existing facility-link ArrayList
		if(!checkTheList(f))
		{
			//instantiate new ArrayList if no existing F key
			BookingList.put(f, new ArrayList<Booking>());
		}
		
		//check for overlap
		else{
			
				for(Booking other : BookingList.get(f))
						{
							if(B.overlaps(other)) throw new BadBookingException("Booking Timing Overlaps");
					
						}
			}
		
		BookingList.get(f).add(B);
		
		
	}
	
	public ArrayList<Booking> getBookings(Facility F, LocalDateTime start, LocalDateTime end) throws BadBookingException
	{
				
		ArrayList<Booking> sublist = new ArrayList<Booking>();
		//check if there's existing facility-link ArrayList
				if(!checkTheList(F)) throw new BadBookingException("No Bookings found");
				else
				{
					//loop through existing bookings
					for(Booking B: BookingList.get(F))
					{
						//if booking falls within time range, add to sublist
						if(B.getStart().isAfter(start) && B.getEnd().isBefore(end)) sublist.add(B);
							
					}
				}
	
			
		return sublist;
		
	}
	
	private boolean checkTheList(Facility F)
	{
		return (BookingList.containsKey(F)? true : false);
	}
	public void removeBooking(Booking B)
	{
		BookingList.get(B.getF()).remove(B); 
	}
	
}
