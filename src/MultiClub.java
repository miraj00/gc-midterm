
public class MultiClub extends Member{

	int points = 0;
	
	@Override
	public void checkIn(Club club) {
		
		if(club == clubAssigned) {
			System.out.println("Verified!");
			points++;
		} else {
			System.out.println("Not a member");
		}
	}

}
