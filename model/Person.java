package model;

public class Person {

	private String name;
	private int id;
	private String username;
	private String password;
	private String address;

	public Person(){};

	public Person(String name, int id, String username, String password, String address) {
		super();
		this.name = name;
		this.id = id;
		this.username = username;
		this.password = password;
		this.address = address;
	}

	//Getters and Setters

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}







}
