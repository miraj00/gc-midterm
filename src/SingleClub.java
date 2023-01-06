
public class SingleClub extends Member {

	String clubName;
	
	
	public SingleClub(String name, int id, String clubName) {
		super(id , name);
		this.clubName = clubName;
	}

	@Override
	public void checkIn(Club club) {
		
		if(club == clubAssigned) {
			System.out.println("Verified!");
		} else {
			System.out.println("Not a member");
		}
	}


}
