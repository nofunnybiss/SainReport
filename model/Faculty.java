package model;

public class Faculty extends Person {

	//Faculty has a Rank, Office Number and Rank

	private String rank;
	int officenum;

	public Faculty(String name, int id, String username,
			String password, String address,
			String rank, int officenum) {
		super(name, id, username, password, address);
		this.rank = rank;
		this.officenum = officenum;
	}

	//getters and seters

	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public int getOfficenum() {
		return officenum;
	}
	public void setOfficenum(int officenum) {
		this.officenum = officenum;
	}



}