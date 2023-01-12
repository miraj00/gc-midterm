
public class MultiClub extends Member{

	private int membershipPoints;
	
	public MultiClub(int id, String name, int fees, String club) {
		super(id, name, fees, club);
		
	}

	public int getMembershipPoints() {
		return membershipPoints;
	}

	public void setMembershipPoints(int membershipPoints) {
		this.membershipPoints = membershipPoints;
	}

	
	@Override
	public String toString() {
		return "MultiClub [membershipPoints=" + membershipPoints + "]";
	}

}
