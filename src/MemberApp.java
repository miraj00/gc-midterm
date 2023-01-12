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
		List<Member> memberList = new ArrayList<>();                 System.out.println("member List : "   + memberList);
		
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
		ArrayList<String> Club4MemberList = new ArrayList<>(Arrays.asList("Justin","Chris", "September","Lake", "Fox","Pablo", "Miraj","Andrew"  ));       System.out.println("Club4....4 members : " + Club4MemberList);
				
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
		int mainListChoice = input.nextInt();
		
		if ( mainListChoice == 1 ) {	
		
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
		//			System.out.println("Club 3 Members LLList : " + Club3MemberList );      // this gives list of members name in a club
					
				} else if(clubChoice == 4) {
					
					Club4MemberList.add(new String(inputName));
				}	
				
				System.out.println(" Member added to " + clubAssigned + " club !!!" );
			  }
			
			//  multiclub member === y 
			
			
			
		   }
		
 
		} while (true);
	 
	
	

	
		// if remove member " 
	
			//  Ask : Select the club from which to remove
			//  Shows the list of all members.
			// pick number to remove that member and it deletes/ removes member
			// shows updated list of members

		} 
		if ( mainListChoice == 2 ) {
			
			
			
			System.out.println(" Select the club to Remove from : " );
			displayListOfClubs(clubList);
			
			int removeMemberFromClub = input.nextInt();
			
			
			System.out.println("Here is the list of all members from this club" );
			
			if(removeMemberFromClub == 1) {
				
				displaylistOfMembers(Club1MemberList);
				System.out.println("Pick the member to remove ");
				int removeOptionNumber = input.nextInt();
				Club1MemberList.remove(removeOptionNumber - 1);
				System.out.println(Club1MemberList );
													
			} else if(removeMemberFromClub == 2) {
				
				displaylistOfMembers(Club2MemberList);
				System.out.println("Pick the member to remove" );
				int removeOptionNumber = input.nextInt();
				Club2MemberList.remove(removeOptionNumber - 1);
				System.out.println(Club2MemberList );
				
			} else if(removeMemberFromClub == 3) {
				
				displaylistOfMembers(Club3MemberList);
				System.out.println("Pick the member to remove" );
				int removeOptionNumber = input.nextInt();
				Club3MemberList.remove(removeOptionNumber - 1);
				System.out.println(Club3MemberList );
									
			}else if(removeMemberFromClub == 4) {
				
				displaylistOfMembers(Club4MemberList);
				System.out.println("Pick the member to remove" );
				int removeOptionNumber = input.nextInt();
				Club4MemberList.remove(removeOptionNumber - 1);
				System.out.println(Club4MemberList );
			}
			
			

			
			
		}			
			//  Display list of clubs 
		if ( mainListChoice == 3 ) {	
			System.out.println(" Here is the current list of all Clubs : " );
			displayListOfClubs(clubList);
		}
		
	//  Display List of Members by Club
		//   Ask : which club you want to see list of members  : shows list
		//   displays all members and monthly fees
		
		if ( mainListChoice == 4 ) {
	
			System.out.println(" Select the Club to see list of all members of that club " );
			displayListOfClubs(clubList);
			
			int pickedClub = input.nextInt();
			
			
			System.out.println("Here is the list of all members from this club" );
			
			if(pickedClub == 1) {
				
				displaylistOfMembers(Club1MemberList);
				
													
			} else if(pickedClub == 2) {
				
				displaylistOfMembers(Club2MemberList);
				
				
			} else if(pickedClub == 3) {
				
				displaylistOfMembers(Club3MemberList);
				
									
			}else if(pickedClub == 4) {
				
				displaylistOfMembers(Club4MemberList);
				
			}
		}
		
		// check in 
		if ( mainListChoice == 5 ) {
			
			System.out.println(" Please Enter your ID Number  to Check In : ");
			
			int idNumber = input.nextInt();
			
			
			
			// current club :
			   Club currentClub = club1;

			 
	//		if id is matching with any id in current club 
			   
			   // id 
			   
			   // id---> name, id, clubassigned 
			   	getName(id)
//			   										need clubassigned from membersList with ID 
			if (  memberList.contains(idNumber)  &&  memberList.clubAssigned == "LAND" ) {
				System.out.println("Verified!");
	//		} 
	//		else {
				System.out.println("Not a member");

				
			}
			
			
			
			
			
			
			
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void displaylistOfMembers	(ArrayList<String> ClubMemberList) {
	
	
		
		for (int i = 0; i < ClubMemberList.size(); i++) {
			System.out.println((i + 1) + ".  " + ClubMemberList.get(i));
		}
	}
	
		
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
				+ "5. Check In   \n "
				+ " Exit"
				);
	}
	
	
	public static int randNum() {
		int max = 300;
		int min = 1;
		int b = (int)(Math.random()*(max-min+1)+min);  
		return(b);  
	}    


}

