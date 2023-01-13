
public class MultiClub extends Member{

	private int membershipPoints = 0;
	
	public MultiClub(int id, String name, int fees, String club) {
		super(id, name, fees, club);
		
	}

	public int getMembershipPoints() {
		return membershipPoints;
	}

	public void setMembershipPoints(int membershipPoints) {
		this.membershipPoints = membershipPoints;
	}

		
	
	public MultiClub(int id, String name, int fees, int membershipPoints) {
		super(id, name, fees);
		this.membershipPoints = membershipPoints;
	}

	@Override
	public String toString() {
		return "MultiClub [membershipPoints=" + membershipPoints + ", id=" + id + ", name=" + name + ", fees=" + fees
				+ ", clubType=" + clubType + "]";
	}

	@Override
	public void checkIn(Club club) {
		
		
		
		
		
		
		membershipPoints++;
	}

	

}
