import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class MemberApp {

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	
	static List<Member> memberList = new ArrayList<>(); 
	

	
	public static void main(String[] args) {
	
	//	addedMembers(memberList);
		
	
		Club club1 = new Club("LAND ");
		club1.setAddress("342 Sunset Dr.   ");
		ArrayList<String> Club1MemberList = new ArrayList<>(Arrays.asList("Miraj","Andrew"));  	
		club1.setlOfMembers(Club1MemberList);
			
		Club club2 = new Club("OCEAN");
		club2.setAddress("564 Parkset Dr.  ");
		ArrayList<String> Club2MemberList = new ArrayList<>(Arrays.asList("Fox","Pablo"));       
		club2.setlOfMembers(Club2MemberList);
		
		Club club3 = new Club("SKY  ");
		club3.setAddress("789 Mountain Ave.");
		ArrayList<String> Club3MemberList = new ArrayList<>(Arrays.asList("September","Lake"));
		club3.setlOfMembers(Club3MemberList);
		
		Club club4 = new Club("SPACE");
		club4.setAddress("449 Huntley Ct.  ");
		ArrayList<String> Club4MemberList = new ArrayList<>(Arrays.asList("Justin","Chris", "September","Lake", "Fox","Pablo", "Miraj","Andrew"  ));    
		club4.setlOfMembers(Club4MemberList);
		
		//List of all clubs
		List<Club> clubList = new ArrayList<>(Arrays.asList(club1,club2,club3,club4));
//		System.out.println(" Defult Club List : \n" + "-------------------\n" 
//				+ club1 + /* Club1MemberList + */ "\n" 
//				+ club2 + /* Club2MemberList + */ "\n"
//				+ club3 + /* Club3MemberList + */ "\n"
//				+ club4  /* Club4MemberList) */ ); 
		
		
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
				
		int mainListChoice = input.nextInt();

	while (mainListChoice != 6) {	
//===========================				
			// if Add member : 
			if ( mainListChoice == 1 ) {	
			
				do {
			
			    
		
				} while (mainListChoice == 1);
	       }	
			
			// if remove member " 
				//  Ask : Select the club from which to remove
				//  Shows the list of all members.
				// pick number to remove that member and it deletes/ removes member
				// shows updated list of members

//=======================================
		 
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
		
//========================================	
	
		  //  Display list of clubs 
		if ( mainListChoice == 3 ) {	
			System.out.println(" Here is the current list of all Clubs : " );
			displayListOfClubs(clubList);
			
		}
			
//=======================================	
		
	//  Display List of Members by Club
		//   Ask : which club you want to see list of members  : shows list
		//   displays all members and monthly fees
		
		if ( mainListChoice == 4 ) {
	
			System.out.println(" Select the Club to see list of all members of that club " );
			displayListOfClubs(clubList);
			
			int pickedClub = input.nextInt();
			

			System.out.println(" Processing ....... " );
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			
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
		
//=================================================
		// check in 
		if ( mainListChoice == 5 ) {
			
			System.out.println(" Please Enter your ID Number  to Check In : ");
			
			int idNumber = input.nextInt();
		   	
			boolean match = false;
			
			for ( Member x : memberList ) {			  
				
				   if (idNumber == x.getId() &&  (( x.getClubType() == "SPACE") || ( x.getClubType()  == "Multi-Club" ))) {					  
					   match = true; 			   
					   System.out.println("Verified!");
					   
					   
//					   if ( x.getClubType()  == "Multi-Club" ) {
//						   
//						   
//					
//						     //    memberList.add(new MultiClub( numForMC, inputName, 45 , "Multi-Club" ));
//						          
//						         MultiClub(int id, String name, int fees, int (membershipPoints +1));
//					   }
					   
				   } else if (idNumber == x.getId() && x.getClubType() != "LAND"  ) {
					   match = true;
					   System.out.println("Not a member at this club");
					   System.out.println("You are assigned to :  " +  x.getClubType() + " Club "); 
					   break;   
				   } 				   
			}   
									
			if (match == false) {	 
				System.out.println("You are Not a member. Would you like to sign up ?");
				
				String MC = scan.nextLine();
				
				if (MC.equals("y")) {
				
					displayOptions();
			} 	
		}
	}	
//==========================================

		if ( mainListChoice == 6 ) {
			System.out.println(" \t\t\t Exiting Program ........");
			
			try {
				TimeUnit.SECONDS.sleep(2);
				System.out.println(" \t\t\t THANK YOU... ");
				
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}	
		}
	}
	}			
	
	
	// ----------------------------X------METHODS ---------- X --------------------------------------------------------

	
		

	
	
	
	public static void displayOptions () {	
		System.out.println(" \n" + "Choose an option:\n" + "-------------------\n" 
				+ "1. Add Member   \n"
				+ "2. Remove member  \n"
				+ "3. Display List of Clubs \n"
				+ "4. Display List of Members by Club  \n"
				+ "5. Check In   \n"
				+ "6. Exit");
	}
	
	
	
	

	
}

