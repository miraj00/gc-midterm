
public abstract class Member {
	int id;
	String name;
	int fees;
	String clubType;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getClubType() {
		return clubType;
	}
	public void setClubType(String clubType) {
		this.clubType = clubType;
	}
	
	
	public Member(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	
	public Member(int id, String name, int fees, String clubType) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.clubType = clubType;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", fees=" + fees + ", clubType=" + clubType + "]";
	}

	

}
	
