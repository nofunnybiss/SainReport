package main;


import java.util.ArrayList;
import java.util.List;

import controller.LoginWindowController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.Administrator;
import model.Course;
import model.CoursesCompleted;
import model.Degree;
import model.Faculty;
import model.Major;
import model.MajorBag;
import model.Person;
import model.PersonBag;
import model.Student;
import view.LoginScreen;
import view.MainScreen;






public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		LoginScreen loginWindow = new LoginScreen();
		PersonBag personbag = new PersonBag();

		//Put Courses int the DataBase
		CoursesCompleted mycourse1 = new CoursesCompleted("Advanced Programming", "242", "Computer Science", 4.0, "CST", "IP");
		CoursesCompleted mycourse2 = new CoursesCompleted("Discrete Math", "205", "Math Elective", 4.0, "MAT", "B");
		CoursesCompleted mycourse3 = new CoursesCompleted("Us History", "121", "Humanities", 4.0, "HUM", "B");
		CoursesCompleted mycourse4 = new CoursesCompleted("Data Structures", "246", "Computer Science", 4.0, "CST", "B");
		CoursesCompleted mycourse5 = new CoursesCompleted("Physics I", "130", "Laboratory Science", 4.0, "PHY", "IP");
		CoursesCompleted mycourse6 = new CoursesCompleted("Calculus 2", "142", "Math Elective", 4.0, "MAT", "A");
		CoursesCompleted mycourse7 = new CoursesCompleted("Engineering", "101", "Other", 4.0, "ENG", "C");
		CoursesCompleted mycourse8 = new CoursesCompleted("Biology", "150", "Laboratory Science", 4.0, "BIO", "W");
		List<CoursesCompleted> coursesArray = new ArrayList<CoursesCompleted>();
		coursesArray.add(mycourse1);
		coursesArray.add(mycourse2);
		coursesArray.add(mycourse3);
		coursesArray.add(mycourse4);
		coursesArray.add(mycourse5);
		coursesArray.add(mycourse6);
		coursesArray.add(mycourse7);
		coursesArray.add(mycourse8);

		Course course1 = new Course("Advanced Programming in Java", "242", "Computer Science", 4.0, "CST");
		Course course2 = new Course("Discrete Math", "205", "Math Elective", 4.0, "MAT");
		Course course3 = new Course("Psychology of the Human Brain", "226", "Psychology", 4.0, "PSY");
		Course course4 = new Course("Data Structures", "246", "Computer Science", 4.0, "CST");
		Course course5 = new Course("Physics I", "130", "Laboratory Science", 4.0, "PHY");
		Course course6 = new Course("Calculus 2", "142", "Math Elective", 4.0, "MAT");
		Course course7 = new Course("Engineering", "101", "Other", 4.0, "EGN");
		Course course8 = new Course("Modern Biology", "150", "Laboratory Science", 4.0, "BIO");



		List<Course> courses = new ArrayList<Course>();
		courses.add(course1);
		courses.add(course3);
		courses.add(course6);
		courses.add(course7);
		List<String> types = new ArrayList<String>();
		types.add("Laboratory Science");
		types.add("Math Elective");
		types.add("Humanities");
		types.add("Computer Science");
		types.add("Physical Education");
		Major major1 = new Major("ComputerScience", courses, types, 2.0, 65.5); // Create Computer Science Major


		List<Course> courses2 = new ArrayList<Course>();
		courses2.add(course8);
		List<String> types2 = new ArrayList<String>();
		types2.add("Psychology Elective");
		types2.add("Humanities Elective");
		types2.add("English Elective");
		types2.add("Physical Education");
		Major major2 = new Major("Psychology", courses2, types2, 2.0, 61);


		List<Major> asMajors = new ArrayList<Major>();
		asMajors.add(major1);

		List<Major> aaMajors = new ArrayList<Major>();
		aaMajors.add(major2);

		Degree degreeAS = new Degree("AS", asMajors, 30);
		Degree degreeAA = new Degree("AA", aaMajors, 30);

		MajorBag allMajors = new MajorBag();
		allMajors.getMajors().add(major1);
		allMajors.getMajors().add(major2);




		Student st1 = new Student("John Kennedy", 543243, "Student1",
				"111",  "8 WowZA lane",
				"Competer Science A.S", degreeAS, major1, coursesArray,
				3.5, 2.9, 3.2);

		Student st2 = new Student("Dan corona", 432433, "Student2",
				"112",  "32 Banna lane",
				"Psychology", degreeAA, major2, coursesArray,
				2.5, 3.9, 4.0);

		Faculty fac = new Faculty("Ben  Chen" ,  18753, "LionTamer",
				"222", "321 CompSci Court",
				"Professor of Comp Sci", 207);

		Administrator admin = new Administrator("Dave" ,  875309, "Admin",
				"333", "23 Dean St",
				"Admin", 213);


		personbag.addPerson(st1);
		personbag.addPerson(st2);
		personbag.addPerson(fac);
		personbag.addPerson(admin);

		LoginWindowController controller = new LoginWindowController(personbag, allMajors,  loginWindow);
	}


}