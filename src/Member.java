
public abstract class Member {
	int id;
	String name;
	String club;

	public abstract void checkIn(Club club);

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

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}
	
	public Member(int id, String name, String club) {
		this.id = id;
		this.name = name;
		this.club = club;
		
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", club=" + club + "]";
	}
	
}
