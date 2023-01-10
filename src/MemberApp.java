import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class MemberApp {

	static Scanner scan = new Scanner(System.in);
	static Scanner cont = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	do {
		//We are looking for: id, name, club name
		List<Member> memberList = new ArrayList<>();
		
		
		Club club1 = new Club("LAND");
		club1.setAddress("342 Sunset Dr.");
		ArrayList<String> Club1MemberList = new ArrayList<>(Arrays.asList("Miraj","Andrew"));  	
		
		Club club2 = new Club("OCEAN");
		club2.setAddress("564 Parkset Dr.");
		ArrayList<String> Club2MemberList = new ArrayList<>(Arrays.asList("Fox","Pablo"));  
		
		Club club3 = new Club("SKY");
		club3.setAddress("789 Mountain Ave.");
		ArrayList<String> Club3MemberList = new ArrayList<>(Arrays.asList("September","Lake"));  
		
		Club club4 = new Club("SPACE");
		club4.setAddress("449 Huntley Ct.");
		ArrayList<String> Club4MemberList = new ArrayList<>(Arrays.asList("Justin","Chris"));  
		
		
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
				
				memberList.add(new SingleClub(inputName, randNum(), clubAssigned ));
				System.out.println(memberList);
				
				
				if(clubChoice == 1) {
					
					Club1MemberList.add(new String(inputName));
					
					club1.setlOfMembers(Club1MemberList);
					System.out.println("Club 1 Members : " + Club1MemberList );
					
				} else if(clubChoice == 2) {
					
					Club2MemberList.add(new String(inputName));
					
					club2.setlOfMembers(Club2MemberList);
					System.out.println("Club 2 Members : " + Club2MemberList );
					
				} else if(clubChoice == 3) {
					
					Club3MemberList.add(new String(inputName));
					
					club3.setlOfMembers(Club3MemberList);
					System.out.println("Club 3 Members : " + Club3MemberList );
				} else if(clubChoice == 4) {
					
					Club4MemberList.add(new String(inputName));
					
					club4.setlOfMembers(Club4MemberList);
					System.out.println("Club 4 Members : " + Club4MemberList );
				}
				
			}
		}
	}
	while (true);
	
	}
	
	public static int randNum() {
		int max = 300;
		int min = 1;
		int b = (int)(Math.random()*(max-min+1)+min);  
		return(b);  
		}    
	}

