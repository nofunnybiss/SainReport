package model;

public class CoursesCompleted extends Course {


	private String grade;

	// Constructors
	public CoursesCompleted(String courseName, String courseNum, String coursetype,
			double credits, String subject, String grade) {
		super(courseName, courseNum, coursetype, credits, subject);
		this.grade = grade;
	}
	public CoursesCompleted() {
		// No Argument Constructor
	}

	// Getters and Setters
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String toStringForRequired() {
		return "Subj: " + getSubject() + " " + getCourseNum() + "     Grade: "
				+ grade + "  Area Req: " + getCoursetype();
	}

	public String toStringForOther() {
		return "Subj: " + getSubject() + " " + getCourseNum() + "     Grade: "
				+ grade;
	}

	public String toStringForFailed() {
		return "Subj: " + getSubject() + " " + getCourseNum() + "     Grade: "
				+ grade;
	}







}