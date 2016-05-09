package model;

import java.util.List;

public class Student extends Person {

	//Data Fields
	private String program;
	private Degree degree;
	private Major major;
	private List<CoursesCompleted> courses;
	private double cumulativeGpa;
	private double majorGPA;
	private double programGPA;

	//Constructors
		public Student(String name, int id, String username,
				String password, String address,
				String program, Degree degree, Major major, List<CoursesCompleted> courses,
				double cumulativeGpa, double majorGPA, double programGPA) {
			super(name, id, username, password, address);
			this.program = program;
			this.degree = degree;
			this.major = major;
			this.courses = courses;
			this.cumulativeGpa = cumulativeGpa;
			this.majorGPA = majorGPA;
			this.programGPA = programGPA;
		}

	//Getters and Setters
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	public Major getMajor() {
		return major;
	}
	public void setMajor(Major major) {
		this.major = major;
	}

	public List<CoursesCompleted> getCourses() {
		return courses;
	}
	public void setCourses(List<CoursesCompleted> courses) {
		this.courses = courses;
	}
	public double getCumulativeGpa() {
		return cumulativeGpa;
	}
	public void setCumulativeGpa(double cumulativeGpa) {
		this.cumulativeGpa = cumulativeGpa;
	}
	public double getMajorGPA() {
		return majorGPA;
	}
	public void setMajorGPA(double majorGPA) {
		this.majorGPA = majorGPA;
	}
	public double getProgramGPA() {
		return programGPA;
	}
	public void setProgramGPA(double programGPA) {
		this.programGPA = programGPA;
	}


	public Student(String name, int id, String username,
			String password, String address) {
		super(name, id, username, password, address);
		// Overloaded Constructor
	}
	public Student() {
		// No Argument Constructor
	}




}