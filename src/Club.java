import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Club {
	private String clubName;
	private String address;
	private List<String> lOfMembers;

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);

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

	public Club(String clubName) {
		this.clubName = clubName;
		this.lOfMembers = new ArrayList<String>();
		this.address = "Nothing";

	}

	public static void displayListOfClubs(List<Club> clubList) {

		for (int i = 0; i < 4; i++) {
			System.out.println((i + 1) + ".  " + clubList.get(i).getClubName());

		}
	}

	static List<Member> memberList = new ArrayList<>();

	public static void defaultMembers() {
		memberList.add(new SingleClub(100, "Miraj     ", 30, "LAND"));
		memberList.add(new SingleClub(101, "Andrew    ", 30, "LAND"));
		memberList.add(new SingleClub(102, "Ced       ", 30, "LAND"));

		memberList.add(new SingleClub(200, "Fox       ", 30, "OCEAN"));
		memberList.add(new SingleClub(201, "Pablo     ", 30, "OCEAN"));

		memberList.add(new SingleClub(300, "September ", 30, "SKY"));
		memberList.add(new SingleClub(301, "Lake      ", 30, "SKY"));

		memberList.add(new SingleClub(400, "Aaron     ", 30, "SPACE"));
		memberList.add(new SingleClub(401, "Alexandra ", 30, "SPACE"));
		memberList.add(new SingleClub(402, "Sam      ", 30, "SPACE"));
		memberList.add(new SingleClub(403, "Mithila  ", 30, "SPACE"));

	}

	static ArrayList<String> Club1MemberList = new ArrayList<>(Arrays.asList("Miraj", "Andrew"));
	static ArrayList<String> Club2MemberList = new ArrayList<>(Arrays.asList("Fox", "Pablo"));
	static ArrayList<String> Club3MemberList = new ArrayList<>(Arrays.asList("September", "Lake"));
	static ArrayList<String> Club4MemberList = new ArrayList<>(
			Arrays.asList("Justin", "Chris", "September", "Lake", "Fox", "Pablo", "Miraj", "Andrew"));

	static List<Club> clubList = new ArrayList<>();

	public static void defaultClubs() {

		Club club1 = new Club("LAND");
		club1.setAddress("342 Sunset Dr.");
		ArrayList<String> Club1MemberList = new ArrayList<>(Arrays.asList("Miraj", "Andrew"));
		club1.setlOfMembers(Club1MemberList);

		Club club2 = new Club("OCEAN");
		club2.setAddress("564 Parkset Dr.");
		ArrayList<String> Club2MemberList = new ArrayList<>(Arrays.asList("Fox", "Pablo"));
		club2.setlOfMembers(Club2MemberList);

		Club club3 = new Club("SKY");
		club3.setAddress("789 Mountain Ave.");
		ArrayList<String> Club3MemberList = new ArrayList<>(Arrays.asList("September", "Lake"));
		club3.setlOfMembers(Club3MemberList);

		Club club4 = new Club("SPACE");
		club4.setAddress("449 Huntley Ct.");
		ArrayList<String> Club4MemberList = new ArrayList<>(
				Arrays.asList("Justin", "Chris", "September", "Lake", "Fox", "Pablo", "Miraj", "Andrew"));
		club4.setlOfMembers(Club4MemberList);

		clubList.add(club1);
		clubList.add(club2);
		clubList.add(club3);
		clubList.add(club4);
	}

 
	 public static void defaultClubsClubdisplay () {
		 
		defaultClubs();
		displayListOfClubs(clubList);  
	 }
	 
	 
	public static void removeMember() {	


		System.out.println(" Select the club to Remove from : ");

		defaultClubsClubdisplay();

		int removeMemberFromClub = input.nextInt();

		if (removeMemberFromClub == 1) {
			String clubValue = "LAND";
			removeFunction(clubValue);

		} else if (removeMemberFromClub == 2) {
			String clubValue = "OCEAN";
			removeFunction(clubValue);

		} else if (removeMemberFromClub == 3) {
			String clubValue = "SKY";
			removeFunction(clubValue);

		} else if (removeMemberFromClub == 4) {
			String clubValue = "SPACE";
			removeFunction(clubValue);
		}
	}

	public static void addMember() {

		Club club1 = new Club("LAND");
		club1.setAddress("342 Sunset Dr.");
		ArrayList<String> Club1MemberList = new ArrayList<>(Arrays.asList("Miraj", "Andrew"));
		club1.setlOfMembers(Club1MemberList);

		Club club2 = new Club("OCEAN");
		club2.setAddress("564 Parkset Dr.");
		ArrayList<String> Club2MemberList = new ArrayList<>(Arrays.asList("Fox", "Pablo"));
		club2.setlOfMembers(Club2MemberList);

		Club club3 = new Club("SKY");
		club3.setAddress("789 Mountain Ave.");
		ArrayList<String> Club3MemberList = new ArrayList<>(Arrays.asList("September", "Lake"));
		club3.setlOfMembers(Club3MemberList);

		Club club4 = new Club("SPACE");
		club4.setAddress("449 Huntley Ct.");
		ArrayList<String> Club4MemberList = new ArrayList<>(
				Arrays.asList("Justin", "Chris", "September", "Lake", "Fox", "Pablo", "Miraj", "Andrew"));
		club4.setlOfMembers(Club4MemberList);

		// List of all clubs
		List<Club> clubList = new ArrayList<>(Arrays.asList(club1, club2, club3, club4));

		System.out.println("Add Member?");
		String yesNo = cont.next();
		if (yesNo.equalsIgnoreCase("y")) {
			System.out.println("Enter Member Name :");
			String inputName = scan.nextLine();

			System.out.println("Are you adding Multiclub Member? : ");
			String MC = scan.nextLine();

			if (MC.equalsIgnoreCase("y")) {

				int numForMC = randNum();
				memberList.add(new MultiClub(numForMC, inputName, 45, "Multi-Club", 0));

				System.out.println(" SUCCESS !!!  Member added as Multi-Club member....");
				System.out.println(" Inclusive List of all members (For Display) : \n " + memberList + "\n");

			} else if (MC.equalsIgnoreCase("n")) {
				System.out.println("Which club are you joining? (Select Option : 1-4) :");

				displayListOfClubs(clubList);

				int clubChoice = input.nextInt();

				String clubAssigned = clubList.get(clubChoice - 1).getClubName();

				memberList.add(new SingleClub(randNum(), inputName, 30, clubAssigned));

				if (clubChoice == 1) {
					Club1MemberList.add(new String(inputName));

				} else if (clubChoice == 2) {
					Club2MemberList.add(new String(inputName));

				} else if (clubChoice == 3) {
					Club3MemberList.add(new String(inputName));

				} else if (clubChoice == 4) {
					Club4MemberList.add(new String(inputName));
				}
				System.out.println(" Member added to " + clubAssigned + " club !!!");
				System.out.println(" Inclusive List of all members (For Display) : \n : " + memberList + "\n");
			}

		} else if (yesNo.equalsIgnoreCase("n")) {
			MemberApp.displayOptions();
		}
	}

	public static void removeFunction(String clubValue) {
		System.out.println("Here is the list of all members from this club");

		ArrayList<String> newList = new ArrayList<>();

		// This creates list of all members with club selected
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).clubType == clubValue) {
				newList.add(memberList.get(i).name);
			}
		}

		// this shows list of all members for the club
		for (int i = 0; i < newList.size(); i++) {
			System.out.println((i + 1) + ". " + newList.get(i));
		}

		System.out.println("Pick the member to remove: ");
		int removeOptionNumber = input.nextInt();

		String nametoRemove = newList.get(removeOptionNumber - 1);

		// this removes selected member from the club
		for (int i = 0; i < memberList.size(); i++) {
			if (memberList.get(i).name == nametoRemove) {
				// System.out.println(" Removing : " + memberList.get(i).name );
				System.out.println(" Removing : " + memberList.remove(i));
			}
		}
		// this shows updated inclusive list of all members from all clubs
		System.out.println(" Here is Updated List of all members : " + memberList);
	}

	public static void displayMemberFunction(String clubValue) {

		ArrayList<String> currentList = new ArrayList<>();

		// This creates list of all members with club selected
		for (int i = 0; i < Club.memberList.size(); i++) {
			if (Club.memberList.get(i).clubType == clubValue) {
				currentList.add(Club.memberList.get(i).name);
			}
		}

		// this shows list of all members for the club
		for (int i = 0; i < currentList.size(); i++) {
			System.out.println((i + 1) + ". " + currentList.get(i));
		}
	}

	public static void exitFunction() {
		System.out.println(" \t\t\t Exiting Program ........");

		try {
			TimeUnit.SECONDS.sleep(2);
			System.out.println(" \t\t\t THANK YOU... ");

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

	}

	public static void processingFunction() {
		System.out.println(" Processing ....... ");
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static void littlePauseFunction() {
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static int randNum() {
		int max = 300;
		int min = 1;
		int b = (int) (Math.random() * (max - min + 1) + min);
		return (b);
	}

	@Override
	public String toString() {
		return "(" + clubName + ")" + " |Address = |" + address + " |Members = |" + lOfMembers + "\n";
	}

}
