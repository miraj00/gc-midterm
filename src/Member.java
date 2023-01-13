import java.util.ArrayList;
import java.util.List;

public abstract class Member {
	int id;
	String name;
	int fees;
	String clubType;
	
	public abstract void checkIn(Club club);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getClubType() {
		return clubType;
	}
	public void setClubType(String clubType) {
		this.clubType = clubType;
	}
	
	
	public Member(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	
	public Member(int id, String name, int fees, String clubType) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.clubType = clubType;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", fees=" + fees + ", clubType=" + clubType + "] \n";
	}

	
	public void checkinMethod() {
		
		
	}
	
	
	
	public static void displaylistOfMembers	(ArrayList<String> ClubMemberList) {
		
		for (int i = 0; i < ClubMemberList.size(); i++) {
			System.out.println((i + 1) + ".  " + ClubMemberList.get(i));
		}
	}
	
   
	
	
	public static void addedMembers(int id, String name, int fees, String clubName ) {
		
		List<Member> addToMemberList = new ArrayList<>(); 
		
		addToMemberList.add(new SingleClub (100, "Miraj", 30, "LAND"));
		addToMemberList.add(new SingleClub (101, "Andrew", 30, "LAND"));
		addToMemberList.add(new SingleClub (102, "Ced", 30, "LAND"));

		addToMemberList.add(new SingleClub (200, "Fox", 30, "OCEAN"));
		addToMemberList.add(new SingleClub (201, "Pablo", 30, "OCEAN"));
		
		addToMemberList.add(new SingleClub (300, "September", 30, "SKY"));
		addToMemberList.add(new SingleClub (301, "Lake", 30, "SKY"));
		
		addToMemberList.add(new SingleClub (400, "Aaron", 30, "SPACE"));
		addToMemberList.add(new SingleClub (401, "Alexandra", 30, "SPACE"));
		addToMemberList.add(new SingleClub (402, "Sam", 30, "SPACE"));
		addToMemberList.add(new SingleClub (403, "Sooraj", 30, "SPACE"));
		addToMemberList.add(new SingleClub (404, "Aaron", 30, "SPACE"));
		addToMemberList.add(new SingleClub (405, "Alexandra", 30, "SPACE"));
		addToMemberList.add(new SingleClub (406, "Sam", 30, "SPACE"));
		addToMemberList.add(new SingleClub (407, "Sooraj", 30, "SPACE"));
		
		addToMemberList.add(new SingleClub (id, name, fees, clubName));
		
		System.out.println("Default Members List : \n" + "-------------------\n" 
				+ addToMemberList  ); 
		
		}
	

}
	
