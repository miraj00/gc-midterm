import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



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
	//	super();
		this.clubName = clubName;
		this.lOfMembers = new ArrayList<String>();
		this.address = "Nothing";

	}

	public static void displayListOfClubs (List<Club> clubList) {
		
		for (int i = 0; i < clubList.size(); i++) {
			System.out.println((i + 1) + ".  " + clubList.get(i).getClubName());
		}
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void addmemberQuestions() {
		
		System.out.println("Add Member?");
	    String yesNo = cont.next();
	    if (yesNo.equals("y")) {
		System.out.println("Enter first name");
		String inputName = scan.nextLine();
		
		System.out.println("Are you adding Multiclub Member?");
		String MC = scan.nextLine();
		
		if (MC.equals("y")) {
			
			int numForMC = randNum();
			memberList.add(new MultiClub( numForMC, inputName, 45 , "Multi-Club" ));
								
			System.out.println(" SUCCESS !!!  Member added as Multi-Club member....");	
			
		} else if (MC.equals("n")) {
			System.out.println("Which club are you joining? (1-4)");
			
			displayListOfClubs(clubList);
	
			
			int clubChoice = input.nextInt();
			
			String clubAssigned = clubList.get(clubChoice - 1).getClubName();
						
			memberList.add(new SingleClub(randNum(), inputName, 30 , clubAssigned ));
			
		
			
			if(clubChoice == 1) {
				
				Club1MemberList.add(new String(inputName));
				System.out.println(Club1MemberList);				
			} else if(clubChoice == 2) {
				
				Club2MemberList.add(new String(inputName));
									
			} else if(clubChoice == 3) {
				
				Club3MemberList.add(new String(inputName));
					
			} else if(clubChoice == 4) {
				
				Club4MemberList.add(new String(inputName));
			}	
			
			System.out.println(" Member added to " + clubAssigned + " club !!!" );
			System.out.println(" Inclusive List of all members : "  +   memberList);
		  }
		
	
		
		System.out.println(" Member List : " + memberList );
			
				
	   } else if (yesNo.equals("n")){
		  displayOptions();
		  mainListChoice = input.nextInt();	//odd to have this here again after line 63 but it works here so keep it
		 
		   
	   }
	}
	
	public static int randNum() {
		int max = 300;
		int min = 1;
		int b = (int)(Math.random()*(max-min+1)+min);  
		return(b);  
	} 
	
	@Override
	public String toString() {
		return "| clubName = |" + clubName + ", | address = |" + address + ", | lOfMembers = |" + lOfMembers + "]";
	}

}
