package homework3_part2;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {
	List<Courses> givenCourses;
	
	public Instructor(String fullName, String email, String password) {
		super(fullName, email, password);
		this.givenCourses = new ArrayList<Courses>();
	}
}
