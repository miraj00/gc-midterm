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
	public void checkIn(Club club) {
		// TODO Auto-generated method stub
		
	
	}



	}
	






