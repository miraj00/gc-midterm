
public class SingleClub extends Member {

	@Override
	public void checkIn(Club club) {
		
		if(club == clubAssigned) {
			System.out.println("Verified!");
		} else {
			System.out.println("Not a member");
		}
	}

}
