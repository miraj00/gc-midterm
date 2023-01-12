
public class SingleClub extends Member {

	String clubName;
	
	public SingleClub(String name, int id, String clubName) {
		super(id , name, clubName);
	}

	@Override
	public void checkIn(Club club) {
		
		if(club == club) {
			
			
			System.out.println("Verified!");
		} else {
			System.out.println("Not a member");
		}
	}


}
