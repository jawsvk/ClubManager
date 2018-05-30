
public class BadBookingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String error = null;
	//checking for errors
	
	public BadBookingException() {};
	
	public BadBookingException(String s) {
		super(s);
		
		
	}
		

}
