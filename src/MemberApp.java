
import java.util.Scanner;

public class MemberApp {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		displayOptions();

		int mainListChoice = input.nextInt();

		Club.defaultMembers();

		while (mainListChoice != -1) {

			switch (mainListChoice) {
			case 1 -> Club.addMember();
			case 2 -> Club.removeMember();
			case 3 -> {
				System.out.println(" Here is the current list of all Clubs : ");
				Club.defaultClubs();
				Club.littlePauseFunction();
			}
			case 4 -> {
				System.out.println(" Select the Club to see list of all members of that club ");
				Club.displayListOfClubs(Club.clubList);

				int pickedClub = input.nextInt();
				Club.processingFunction();

				System.out.println("Here is the list of all members from this club");

				if (pickedClub == 1) {
					String clubValue = "LAND";
					Club.displayMemberFunction(clubValue);

				} else if (pickedClub == 2) {
					String clubValue = "OCEAN";
					Club.displayMemberFunction(clubValue);

				} else if (pickedClub == 3) {
					String clubValue = "SKY";
					Club.displayMemberFunction(clubValue);

				} else if (pickedClub == 4) {
					String clubValue = "SPACE";
					Club.displayMemberFunction(clubValue);
				}
			}
			case 5 -> {
				System.out.println("Please Enter your ID Number to Check In: " + "\n" + "Ex. For Test Success Use ID = [222] "
						+ "\n" + "    For non matching club Use ID = [333] " + "\n" + "    For non-Member use ID = [555] ");

				int iD = input.nextInt();

				if (iD == 222) {
					SingleClub s = new SingleClub(222, "Lisa", 30, "LAND");
					s.checkIn(222);
				} else if (iD == 333) {
					SingleClub s = new SingleClub(333, "Lisa", 30, "SKY");
					s.checkIn(333);
				} else {
					SingleClub s = new SingleClub(222, "Lisa", 30, "LAND");
					s.checkIn(iD);
				}

			}

			case 6 -> {
				Member.printBill();
			}
			default -> {
				Club.exitFunction();
				System.exit(0);
			}
			}
			displayOptions();
			mainListChoice = input.nextInt();
		}
	}

	public static void displayOptions() {
		System.out.println(" \n" + "Choose an option:\n" + "-------------------\n" + "1. Add Member   \n"
				+ "2. Remove member  \n" + "3. Display List of Clubs \n" + "4. Display List of Members by Club  \n"
				+ "5. Check In   \n" + "6. Print Bill   \n" + "7. Exit");
	}
}
