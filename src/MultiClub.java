
public class MultiClub extends Member{

	private int membershipPoints = 0;
	
//	public MultiClub(int id, String inputName, int fees, String club) {
//		super(id, inputName, fees, club);
//		
//	}

	public int getMembershipPoints() {
		return membershipPoints;
	}

	public void setMembershipPoints(int membershipPoints) {
		this.membershipPoints = membershipPoints;
	}

		
	
	public MultiClub(int id, String name, int fees, String clubType, int membershipPoints) {
		super(id, name, fees, clubType );
		this.membershipPoints = membershipPoints;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", fees=" + fees
				+ ", clubType=" + clubType + ", membershipPoints=" + membershipPoints + " ]";
	}

		
	@Override
	public boolean checkIn(int idNumber) {
					
			boolean match = false;

			if (idNumber == getId() && ((getClubType() == "LAND") || (getClubType() == "Multi-Club"))) {  // If keeping switch statement, replace "LAND" with "whichClub"
				match = true;
				System.out.println("Verified!");
				membershipPoints++;
				System.out.println("Adding 1 point for today's Visit !!");
				return true;
				
			} else if (idNumber == getId() && getClubType() != "LAND") {
				match = true;
				System.out.println("Not a member at this club");
				System.out.println("You are assigned to :  " + getClubType() + " Club ");
				
				return false;
			}

		if (match == false) {
			System.out.println("You are Not a member. Would you like to sign up ?");

			return false;
		}
		return false;	
		
	}
	
	
	public void discountedFees(int fees) {
		if (membershipPoints >= 30 ) {
			
			int price = fees - 5;
			 setFees(price);	
			 
			 membershipPoints = 0;
		}	
	}
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
