
public class MultiClub extends Member{

	public MultiClub(int id, String name, String club) {
		super(id, name, club);
	}

	int points = 0;
	
	@Override
	public void checkIn(Club club) {
		
		if(club == club) {
			System.out.println("Verified!");
			points++;
		} else {
			System.out.println("Not a member");
		}
	}

}
