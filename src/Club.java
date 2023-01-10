import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Club {
	private String name;
	private String address;
	private List<Club> lOfMembers;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Club> getlOfMembers() {
		return lOfMembers;
	}
	public void setlOfMembers(List<Club> lOfMembers) {
		this.lOfMembers = lOfMembers;
	}
	public Club(String name) {
		super();
		this.name = name;
		this.lOfMembers = new ArrayList<Club>();
		this.address = "Nothing";
	}
	
//	public Club(String name, String clubAssigned) {
//		super();
//		this.name = name;
//		this.lOfMembers = new ArrayList<String>(Arrays.asList(clubAssigned));
//		this.address = "Nothing";
//	}
	
	@Override
	public String toString() {
		return "Club Name = " + name + ", address=" + address + ", lOfMembers=" + lOfMembers + "]";
	}
	
	
}
