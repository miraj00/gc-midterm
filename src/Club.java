import java.util.ArrayList;
import java.util.List;

public class Club {
	String name;
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
		this.lOfMembers = new ArrayList<>();
		this.address = "Nothing";
	}
	@Override
	public String toString() {
		return "Club Name = " + name + ", address=" + address + ", lOfMembers=" + lOfMembers + "]";
	}
	
	
}
