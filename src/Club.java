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
		// super();
		this.clubName = clubName;
		this.lOfMembers = new ArrayList<String>();
		this.address = "Nothing";

	}

	public static void displayListOfClubs(List<Club> clubList) {

		for (int i = 0; i < clubList.size(); i++) {
			System.out.println((i + 1) + ".  " + clubList.get(i).getClubName());
			
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
	

	
	public static void removeMember() {	
		
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
		List<Club> clubList = new ArrayList<>(Arrays.asList(club1, club2, club3, club4));
		
		System.out.println(" Select the club to Remove from : ");
		displayListOfClubs(clubList);

		int removeMemberFromClub = input.nextInt();
		
		if (removeMemberFromClub == 1) {

			System.out.println("Here is the list of all members from this club");
			Member.displaylistOfMembers(Club1MemberList);
			System.out.println("Pick the member to remove: ");
			int removeOptionNumber = input.nextInt();
			Club1MemberList.remove(removeOptionNumber - 1);
			System.out.println(clubList);

		} else if (removeMemberFromClub == 2) {

			System.out.println("Here is the list of all members from this club");
			Member.displaylistOfMembers(Club2MemberList);
			System.out.println("Pick the member to remove: ");
			int removeOptionNumber = input.nextInt();
			Club2MemberList.remove(removeOptionNumber - 1);
			System.out.println(clubList);

		} else if (removeMemberFromClub == 3) {

			System.out.println("Here is the list of all members from this club");
			Member.displaylistOfMembers(Club3MemberList);
			System.out.println("Pick the member to remove: ");
			int removeOptionNumber = input.nextInt();
			Club3MemberList.remove(removeOptionNumber - 1);
			System.out.println(clubList);

		} else if (removeMemberFromClub == 4) {

			System.out.println("Here is the list of all members from this club");
			Member.displaylistOfMembers(Club4MemberList);
			System.out.println("Pick the member to remove: ");
			int removeOptionNumber = input.nextInt();
			Club4MemberList.remove(removeOptionNumber - 1);
			System.out.println(clubList);
		}
	}

	public static void addMember() {
		
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
		List<Club> clubList = new ArrayList<>(Arrays.asList(club1, club2, club3, club4));
		
		List<Member> memberList = new ArrayList<>();

		System.out.println("Add Member?");
		String yesNo = cont.next();
		if (yesNo.equals("y")) {
			System.out.println("Enter first name");
			String inputName = scan.nextLine();

			System.out.println("Are you adding Multiclub Member?");
			String MC = scan.nextLine();

			if (MC.equals("y")) {

				int numForMC = randNum();
				memberList.add(new MultiClub(numForMC, inputName, 45, "Multi-Club"));

				System.out.println(" SUCCESS !!!  Member added as Multi-Club member....");

			} else if (MC.equals("n")) {
				System.out.println("Which club are you joining? (1-4)");

				displayListOfClubs(clubList);    //
				
				int clubChoice = input.nextInt();

				String clubAssigned = clubList.get(clubChoice - 1).getClubName();

				memberList.add(new SingleClub(randNum(), inputName, 30, clubAssigned));

				if (clubChoice == 1) {

					Club1MemberList.add(new String(inputName));
					System.out.println(clubList);
				} else if (clubChoice == 2) {

					Club2MemberList.add(new String(inputName));

				} else if (clubChoice == 3) {

					Club3MemberList.add(new String(inputName));

				} else if (clubChoice == 4) {

					Club4MemberList.add(new String(inputName));
				}

				System.out.println(" Member added to " + clubAssigned + " club !!!");
				System.out.println(" Inclusive List of all members : " + memberList);
			}

			System.out.println(" Member List : " + memberList);

		} else if (yesNo.equals("n")) {
			MemberApp.displayOptions();
			//mainListChoice = input.nextInt(); // odd to have this here again after line 63 but it works here so keep it

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
