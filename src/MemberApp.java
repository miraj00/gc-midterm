import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	
	
	
	public static void main(String[] args) {
	
		// empty member list declared    //We are looking for: id, name, club name
		List<Member> memberList = new ArrayList<>();             //    System.out.println("member List : "   + memberList);
		
		Club club1 = new Club("LAND");
		club1.setAddress("342 Sunset Dr.");
		ArrayList<String> Club1MemberList = new ArrayList<>(Arrays.asList("Miraj","Andrew"));  	  System.out.println("Club1...1 members : " + Club1MemberList);
		club1.setlOfMembers(Club1MemberList);
		// System.out.println("Club 1 Members : " + Club1MemberList );
		
		Club club2 = new Club("OCEAN");
		club2.setAddress("564 Parkset Dr.");
		ArrayList<String> Club2MemberList = new ArrayList<>(Arrays.asList("Fox","Pablo"));        System.out.println("Club2....2  members : " + Club2MemberList);
		
		Club club3 = new Club("SKY");
		club3.setAddress("789 Mountain Ave.");
		ArrayList<String> Club3MemberList = new ArrayList<>(Arrays.asList("September","Lake"));    System.out.println("Club3....3 members : " + Club3MemberList);
		
		Club club4 = new Club("SPACE");
		club4.setAddress("449 Huntley Ct.");
		ArrayList<String> Club4MemberList = new ArrayList<>(Arrays.asList("Justin","Chris"));       System.out.println("Club4....4 members : " + Club4MemberList);
		
		//List of all clubs
		List<Club> clubList = new ArrayList<>(Arrays.asList(club1,club2,club3,club4));     System.out.println("Club List : " + clubList); 
		
		
		displayOptions();
//	public static void displayOptions () {	
//		System.out.println(" Pick the Options : \n"
//				+ "1. Add Member   \n"
//				+ "2. Remove member  \n"
//				+ "3. Display List of Clubs \n"
//				+ "4. Display List of Members by Club  \n "
//				);
//		
//	}
		// if Add member : 
		
	do {
		
		
		System.out.println("Add Member?");
		String yesNo = cont.next();
		if (yesNo.equals("y")) {
			System.out.println("Enter first name");
			String inputName = scan.nextLine();
			
			System.out.println("Are you adding Multiclub Member?");
			String MC = scan.nextLine();
			
			if (MC.equals("n")) {
				System.out.println("Which club are you joining? (1-4)");
				
				displayListOfClubs(clubList);
		
				
				int clubChoice = input.nextInt();
				
				String clubAssigned = clubList.get(clubChoice - 1).getName();
				
				memberList.add(new SingleClub(inputName, randNum(), clubAssigned ));
				System.out.println("this should be members list : "+ memberList);
				
				
				if(clubChoice == 1) {
					
					Club1MemberList.add(new String(inputName));
					

					
				} else if(clubChoice == 2) {
					
					Club2MemberList.add(new String(inputName));
					
		
					
				} else if(clubChoice == 3) {
					
					Club3MemberList.add(new String(inputName));
					System.out.println("Club 3 Members LLList : " + Club3MemberList );      // this gives list of members name in a club
					

				} else if(clubChoice == 4) {
					
					Club4MemberList.add(new String(inputName));
					
				}	
				
				System.out.println(" Member added to " + clubAssigned + " club !!!" );
			  }
			
			//  multiclub member === y 
			
			
			
		   }
		
 
		}
		while (true);
	}
	
	
	
	// if remove member " 
	
	  //  Ask : Select the club from which to remove
	  //  Shows the list of all members.
	  // pick number to remove that member and it deletes/ removes member
	  /// shows updated list of members
	
	
	
	
	
	
	//  Display list of clubs 
	
	
	
	
	
	//  Display List of Members by Club
	//   Ask : which club you want to see list of members  : shows list
	//   displays all members and monthly fees
	

	
		
	public static void displayListOfClubs (List<Club> clubList) {
		
		for (int i = 0; i < clubList.size(); i++) {
			System.out.println((i + 1) + ".  " + clubList.get(i).getName());
		}
	}
	
	
	
	public static void displayOptions () {	
		System.out.println(" Pick the Options : \n"
				+ "1. Add Member   \n"
				+ "2. Remove member  \n"
				+ "3. Display List of Clubs \n"
				+ "4. Display List of Members by Club  \n "
				+ "5. Exit   \n "
				);
	}
	
	
	public static int randNum() {
		int max = 300;
		int min = 1;
		int b = (int)(Math.random()*(max-min+1)+min);  
		return(b);  
	}    


}

