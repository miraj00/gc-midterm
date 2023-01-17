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

	public boolean checkIn(int idNumber) {
			
		
		boolean match = false;

		if (idNumber == getId() && ((getClubType() == "LAND") || (getClubType() == "Multi-Club"))) {  // If keeping switch statement, replace "LAND" with "whichClub"
			match = true;
			System.out.println("Verified!");
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
}


	






