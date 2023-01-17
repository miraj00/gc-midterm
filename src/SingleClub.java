import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleClub extends Member {

	String clubName;
	final int fees =30; 
	
	
	public String getClubName() {
		return clubName;
	}


	public int getFees() {
		return fees;
	}


	public void setClubName(String clubName) {
		this.clubName = clubName;
	}


	public SingleClub(int id, String name, int fees, String clubName) {
		super(id, name, 30, clubName);
		this.clubName = clubName;
		
	}

	@Override
	public void checkIn() {
			
//			String whichClub = "blah";
//			
//			boolean pickingClub = true;
//			while (true == pickingClub) {
//				System.out.println("Please Enter Club: ");
//				
//				int clubNumber = scan.nextInt();
//				
//				switch (clubNumber) {
//					case 1:
//						whichClub = "LAND";
//						pickingClub = false;
//						break;
//					case 2:
//						whichClub = "OCEAN";
//						pickingClub = false;
//						break;
//					case 3:
//						whichClub = "SKY";
//						pickingClub = false;
//						break;
//					case 4:
//						whichClub = "SPACE";
//						pickingClub = false;
//						break;
//					default:
//						System.out.println("Try Again");
//				}
//			}
			
			System.out.println("Please Enter your ID Number to Check In: ");

			int idNumber = input.nextInt();

			boolean match = false;

			for (Member x : MemberApp.memberList) {

				if (idNumber == x.getId() && ((x.getClubType() == "LAND") || (x.getClubType() == "Multi-Club"))) {  // If keeping switch statement, replace "LAND" with "whichClub"
					match = true;
					System.out.println("Verified!");
//					if (x.getClubType() == "Multi-Club" ) {
//						MultiClub.setMembershipPoints(idNumber);
//					}
//					   if ( x.getClubType()  == "Multi-Club" ) {
//						   
//						   
//					
//						     //    memberList.add(new MultiClub( numForMC, inputName, 45 , "Multi-Club" ));
//						          
//						         MultiClub(int id, String name, int fees, int (membershipPoints +1));
//					   }

				} else if (idNumber == x.getId() && x.getClubType() != "LAND") {
					match = true;
					System.out.println("Not a member at this club");
					System.out.println("You are assigned to :  " + x.getClubType() + " Club ");
					break;
				}
			}

			if (match == false) {
				System.out.println("You are Not a member. Would you like to sign up ?");

				String MC = scan.nextLine();

				if (MC.equals("y")) {

					MemberApp.displayOptions();
				}
			}
		}
		
		
			
	
	

}


	






