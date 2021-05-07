package homework3_part2;

import java.util.ArrayList;
import java.util.List;

public class Student extends User{
	
	List<Courses> registeredCourses; 
	
	public Student(String fullName, String email, String password) {
		super(fullName, email, password);
		this.registeredCourses = new ArrayList<Courses>();
	}

	

}
