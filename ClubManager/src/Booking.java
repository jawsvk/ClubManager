import java.time.LocalDateTime;

public class Booking {
	
	private Member M;
	private Facility F;
	private LocalDateTime start;
	private LocalDateTime end;
	
	//constructors
	
	public Booking(Member m, Facility f, LocalDateTime start, LocalDateTime end) {
		String error = null;
		//checking for errors
		if(m==null || f ==null) {
			error ="no member or facility provided";
		}
		
		else if(start ==null || end ==null) {
			error ="incomplete dates provided";
		}
		
		else if(start.isAfter(end)){
			error="end date cannot be earlier than start date";
		}
		this.M = m;
		this.F = f;
		this.start = start;
		this.end = end;
				
	}
	
	
	//getters and setters
	public Member getM() {
		return M;
	}

	public Facility getF() {
		return F;
	}

	public LocalDateTime getStart() {
		return start;
	}
	
	public LocalDateTime getEnd() {
		return end;
	}
	
	
	public boolean overlaps(Booking other) {
		
		boolean flag = false;
		
		if(this.F.getName() == other.F.getName())
		{
		
//			 if(this.getStart().isAfter(other.getEnd()) || this.end.isBefore(other.getStart())) flag = false;
//			 else flag = true;
			 //using shorthand boolean test
			flag = (this.getStart().isAfter(other.getEnd()) || this.end.isBefore(other.getStart())) ?false: true;
		}
		return flag;
	}
	

}
