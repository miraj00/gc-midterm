import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class MethodsTests {

	@Test
	void addMultiClubMembershipPointsTest() {	
		
		MultiClub m = new MultiClub(33, "Sam", 45, "LAND", 0);
		m.checkIn(33);
		m.checkIn(33);
	
		int expected = 2;
		assertEquals(expected, m.getMembershipPoints());
	}
	
	@Test
	void addMultiClubMembershipPointsTest2() {	
		
		MultiClub m = new MultiClub(555, "Samir", 45, "LAND", 7);
		m.checkIn(555);
		m.checkIn(555);
		m.checkIn(555);
		
		int expected = 10;
		assertEquals(expected, m.getMembershipPoints());
	}
	
	@Test
	void checkDiscountedFees() {	
		
		MultiClub m = new MultiClub(77, "Jason", 45, "LAND", 30);
		m.discountedFees(m.getFees());			
		int expected = 40;
		assertEquals(expected, m.getFees());
	}
	
	@Test
	void checkDiscountedFees2() {	
		
		MultiClub m = new MultiClub(77, "Jason", 45, "LAND", 30);
		m.discountedFees(m.getFees());			  // this sets membership fees to $ 40  and resets membership Points to 0
		int expected = 0;
		assertEquals(expected, m.getMembershipPoints());   
	}
	
	
	@Test
	void checkInWithFalseIdTest() {	
		
		SingleClub s = new SingleClub(25, "John", 30, "LAND");
	
		boolean expected = false;
		assertEquals(expected, s.checkIn(33));
	}
	
	@Test
	void checkInWithCorrectIdTest() {	
		
		SingleClub s = new SingleClub(222, "Lisa", 30, "LAND");
		
		boolean expected = true;
		assertEquals(expected, s.checkIn(222));
	}

	
	@Test
	void checkInMatchingClubNameTest() {	
		
		SingleClub s = new SingleClub(33, "John", 30, "SKY");
	
		boolean expected = false;
		assertEquals(expected, s.checkIn(33));
	}
	
	

}

