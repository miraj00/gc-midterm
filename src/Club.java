import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Club {
	private String clubName;
	private String address;
	private List<String> lOfMembers;

	
	
	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getlOfMembers() {
		return lOfMembers;
	}
	public void setlOfMembers(List<String> lOfMembers) {
		this.lOfMembers = lOfMembers;
	}

	
	
//	public String getName() {
//		return clubName;
//	}
//	public void setName(String name) {
//		this.clubName = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public List<String> getlOfMembers() {
//		return lOfMembers;
//	}
//	public void setlOfMembers(List<String> lOfMembers) {
//		this.lOfMembers = lOfMembers;
//	}
	
	public Club(String clubName) {
		super();
		this.clubName = clubName;
		this.lOfMembers = new ArrayList<String>();
		this.address = "Nothing";
		
	}

	
	
//	public Club(String name) {
//		super();
//		this.clubName = name;
//		this.lOfMembers = new ArrayList<String>();
//		this.address = "Nothing";
//	}

	
	@Override
	public String toString() {
		return "| clubName = |" + clubName + ", | address = |" + address + ", | lOfMembers = |" + lOfMembers + "]";
	}	
	
	
//	@Override
//	public String toString() {
//		return "|Name| = " + "(" + clubName + ") " + "|Address| = " + address + " |Members| = ";
//	}
	
	
}
