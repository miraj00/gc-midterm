import java.util.Scanner;

public class MemberApp {

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {

		displayOptions();

		int mainListChoice = input.nextInt();	
		
		Club.defaultMembers();
		
		while ( mainListChoice !=-1) {
			
			switch (mainListChoice) {
				case 1 -> Club.addMember();
				case 2 -> Club.removeMember();
				case 3 -> { System.out.println(" Here is the current list of all Clubs : ");
							
							Club.defaultClubs ();
				
							Club.littlePauseFunction();
						  }
				case 4 -> {
							System.out.println(" Select the Club to see list of all members of that club ");
							Club.displayListOfClubs(Club.clubList );
	
							int pickedClub = input.nextInt();
							Club.processingFunction();
	
							System.out.println("Here is the list of all members from this club");
					
							if (pickedClub == 1) {
									Member.displaylistOfMembers(Club.Club1MemberList);
	
							} else if (pickedClub == 2) {
									Member.displaylistOfMembers(Club.Club2MemberList);
	
							} else if (pickedClub == 3) {
									Member.displaylistOfMembers(Club.Club3MemberList);
	
							} else if (pickedClub == 4) {
									Member.displaylistOfMembers(Club.Club4MemberList);
							}
						   }
				case 5 -> {
							System.out.println("Please Enter your ID Number to Check In: ");
								
							int iD = input.nextInt();
							
							//  	SingleClub.checkIn(iD);
												
							//				if (clubChoice == 1) {
							//					SingleClub.checkIn();
							//
							//				} else if (clubChoice == 2) {
							//					MultiClub.checkIn(); 
							//			}
						  }
				
				case 6 -> {
							Member.printBill ();
						  }
				default -> {  Club.exitFunction();
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

