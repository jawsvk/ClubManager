
public class ClubApplication {

	public static void main (String[] args) {
		
		Club club1 = new Club();
		
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
		
//		club1.showMembers();
//		System.out.println("remove member");
//		club1.removeMember(3);
//		System.out.println("new list");
//		club1.showMembers();
		

		club1.Show();
	}
}
