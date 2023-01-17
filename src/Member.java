import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public abstract class Member {
	int id;
	String name;
	int fees;
	String clubType;

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	
	public abstract void checkIn();

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

	public Member(int id, String inputName, int fees, String clubType) {
		super();
		this.id = id;
		this.name = inputName;
		this.fees = fees;
		this.clubType = clubType;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", fees=" + fees + ", clubType=" + clubType + "] \n";
	}

	

	protected static void displaylistOfMembers(ArrayList<String> MemberList) {

		for (int i = 0; i < MemberList.size(); i++) {
			System.out.println((i + 1) + ".  " + MemberList.get(i));
		}
	}

	public void addedMembers(int id, String name, int fees, String clubName) {

		List<Member> addToMemberList = new ArrayList<>();

		addToMemberList.add(new SingleClub(100, "Miraj", 30, "LAND"));
		addToMemberList.add(new SingleClub(101, "Andrew", 30, "LAND"));
		addToMemberList.add(new SingleClub(102, "Ced", 30, "LAND"));

		addToMemberList.add(new SingleClub(200, "Fox", 30, "OCEAN"));
		addToMemberList.add(new SingleClub(201, "Pablo", 30, "OCEAN"));

		addToMemberList.add(new SingleClub(300, "September", 30, "SKY"));
		addToMemberList.add(new SingleClub(301, "Lake", 30, "SKY"));

		addToMemberList.add(new SingleClub(400, "Aaron", 30, "SPACE"));
		addToMemberList.add(new SingleClub(401, "Alexandra", 30, "SPACE"));
		addToMemberList.add(new SingleClub(402, "Sam", 30, "SPACE"));
		addToMemberList.add(new SingleClub(403, "Sooraj", 30, "SPACE"));
		addToMemberList.add(new SingleClub(404, "Aaron", 30, "SPACE"));
		addToMemberList.add(new SingleClub(405, "Alexandra", 30, "SPACE"));
		addToMemberList.add(new SingleClub(406, "Sam", 30, "SPACE"));
		addToMemberList.add(new SingleClub(407, "Sooraj", 30, "SPACE"));

		addToMemberList.add(new SingleClub(id, name, fees, clubName));

		System.out.println("Default Members List : \n" + "-------------------\n" + addToMemberList);

	}

	protected static void displaylistOfMembers(List<Club> clubList) {

		Club club1 = new Club("LAND ");
		club1.setAddress("342 Sunset Dr.   ");
		ArrayList<String> Club1MemberList = new ArrayList<>(Arrays.asList("Miraj", "Andrew"));
		club1.setlOfMembers(Club1MemberList);

		Club club2 = new Club("OCEAN");
		club2.setAddress("564 Parkset Dr.  ");
		ArrayList<String> Club2MemberList = new ArrayList<>(Arrays.asList("Fox", "Pablo"));
		club2.setlOfMembers(Club2MemberList);

		Club club3 = new Club("SKY  ");
		club3.setAddress("789 Mountain Ave.");
		ArrayList<String> Club3MemberList = new ArrayList<>(Arrays.asList("September", "Lake"));
		club3.setlOfMembers(Club3MemberList);

		Club club4 = new Club("SPACE");
		club4.setAddress("449 Huntley Ct.  ");
		ArrayList<String> Club4MemberList = new ArrayList<>(
				Arrays.asList("Justin", "Chris", "September", "Lake", "Fox", "Pablo", "Miraj", "Andrew"));
		club4.setlOfMembers(Club4MemberList);

		// List of all clubs
		//List<Club> clubList = new ArrayList<>(Arrays.asList(club1, club2, club3, club4));
		
	}


}
