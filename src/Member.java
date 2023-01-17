import java.util.ArrayList;
import java.util.Scanner;

public abstract class Member {
	int id;
	String name;
	int fees;
	String clubType;

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	
	public abstract boolean checkIn(int number);

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
}
