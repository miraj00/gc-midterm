import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class MemberApp {

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//We are looking for: id, name, club name
		List<Member> memberList = new ArrayList<>();
		
		
		//memberList.add(new SingleClub("name", 012345, "LAND"));
		
		Club club1 = new Club("LAND");
		club1.setAddress("342 Sunset Dr.");
		ArrayList<Club> Club1MemberList = new ArrayList<>();  	
		
		Club club2 = new Club("OCEAN");
		club2.setAddress("564 Parkset Dr.");
		ArrayList<Club> Club2MemberList = new ArrayList<>(); 
		
		Club club3 = new Club("SKY");
		club3.setAddress("789 Mountain Ave.");
		ArrayList<Club> Club3MemberList = new ArrayList<>(); 
		
		Club club4 = new Club("SPACE");
		club4.setAddress("449 Huntley Ct.");
		ArrayList<Club> Club4MemberList = new ArrayList<>(); 
		
		
		//List of all clubs
		List<Club> clubList = new ArrayList<>(Arrays.asList(club1,club2,club3,club4));

		System.out.println("Add Member?");
		String yesNo = cont.next();
		if (yesNo.equals("y")) {
			System.out.println("Enter first name");
			String inputName = scan.nextLine();
			
			System.out.println("Are you guys adding multiclub?");
			String MC = scan.nextLine();
			if (MC.equals("n")) {
				System.out.println("Which club are you joining? (1-4)");
				for (int i = 0; i < clubList.size(); i++) {
					System.out.println((i + 1) + " " + clubList.get(i).getName());
				}
				int clubChoice = input.nextInt();
				
				String clubAssigned = clubList.get(clubChoice - 1).getName();
			//	member.add(clubAssigned);
				
				memberList.add(new SingleClub(inputName, randNum(), clubAssigned ));
				System.out.println(memberList);
				
				
				Club1MemberList.add(new String (inputName));
				
				club1.setlOfMembers(Club1MemberList);
				System.out.println("Club 1 Members : " + Club1MemberList );
				
				
//				List<Club> clubL = new ArrayList<>(Arrays.asList());
//				memberList.add(new SingleClub(inputName, randNum(), clubAssigned ));
//				
//				Club.setlOfMembers(clubL);
				
				
				System.out.println("Would you like to add another member?");
				//add method call
		
//				String clubAssigned;
//				if(clubChoice == 1) {
//					clubAssigned = clubList.get(0).name;
//				} 
//				else if (clubChoice == 2) {
//					clubAssigned = clubList.get(1).name;
//				}
//				else if (clubChoice == 3) {
//					clubAssigned = clubList.get(2).name;
//				}
//				else if (clubChoice == 2) {
//					clubAssigned = clubList.get(3).name;
//				}
			}
		}
		else if (yesNo.equals("n")) {
			System.out.println("What would you like to do?");
		}	
	}
	
	public static int randNum() {
		int max = 300;
		int min = 1;
		int b = (int)(Math.random()*(max-min+1)+min);  
		return(b);  
		}    
	}

