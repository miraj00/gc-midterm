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
	
	
	protected static void displaylistOfMembers(ArrayList<String> MemberList) {

		for (int i = 0; i < MemberList.size(); i++) {
			System.out.println((i + 1) + ".  " + MemberList.get(i));
		}
	}
	
	
	public static void printBill () {
		
	// 	print bill for selected member
		System.out.println( " Select the member to print the Bill : ");
		
		String address = null;
		
		for (int i = 0; i < Club.memberList.size(); i++) {
			System.out.println((i + 1) + ".  " + Club.memberList.get(i).name + "  ( ID : " + Club.memberList.get(i).id + " )");
		}
		
		int pickedNum = input.nextInt();
				
		int selectedFees = Club.memberList.get(pickedNum -1).fees;
		 	
		System.out.println(" ================================================================================  " );
		System.out.println(" =============== Welcome to the Grand Circus Corporate Company : ================ \n  " );
		System.out.println("                              INVOICE     \n  " );
		System.out.println(" Club : " + Club.memberList.get(pickedNum -1).clubType );
		
	//	String address = "";
		
		if (Club.memberList.get(pickedNum -1).clubType == "LAND") {
			address = " 342 Sunset Dr., Chicago, IL - 00022 ";    
		} else if (Club.memberList.get(pickedNum -1).clubType == "OCEAN") {
			address = " 564 Parkset Dr., Chicago, IL - 60614 ";  
		} else if (Club.memberList.get(pickedNum -1).clubType == "SKY") {
			address = " 789 Mountain Ave., Chicago, IL - 60630 ";  
		} else if (Club.memberList.get(pickedNum -1).clubType == "SPACE") {
			address = " 449 Huntley Ct., Chicago, IL - 60600 ";  
		}
			
		System.out.println(" Address : " + address + "\n \n ");
		
		System.out.println(" Member Information : " );
		System.out.println(" Member Name : " + Club.memberList.get(pickedNum -1).name );
		System.out.println(" Member ID   : " + Club.memberList.get(pickedNum -1).id + "\n \n" );
		
		System.out.println(" Your monthly Membership Amount is : $ " + selectedFees + "\n \n \n" );
		
		System.out.println(" ******** Sign Up for our Multi-club Membership and get access to all the clubs. \n "
				+ "The benefits include membership points and monthly discounts as you visit clubs and so on.... ");
		
		System.out.println(" =================================================================================\n " );
	}
	

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", fees=" + fees + ", clubType=" + clubType + "] \n";
	}

	


}
