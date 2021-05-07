package homework3_part2;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	private String courseName;
	private Instructor instructor;
	private int numberOfStudentLimitations;
	List<User> studentsOfCourse;
	
	
	public Courses(String courseName, Instructor instructor, int personNumberLimitations) {
		
		this.courseName = courseName;
		this.instructor = instructor;
		this.numberOfStudentLimitations = personNumberLimitations;
		
		this.studentsOfCourse = new ArrayList<User>();
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	public int getPersonNumberLimitations() {
		return numberOfStudentLimitations;
	}



	

}
