package homework3_part2;

public class StudentManager extends UserManager {
	
	
	public void registerCourse(Student student, Courses course) {
		System.out.println("studentt");
		if(course.getPersonNumberLimitations() < course.studentsOfCourse.size()) {
			student.registeredCourses.add(course);	
			System.out.println("eklendi");
		} else { 
			System.out.println("Bu dersin limiti dolmu�tur...");
		}
	}
	
	
	public void add (Student student) {
		System.out.println(student.getFullName() + " e�itmen eklendi ");
	}
	public void delete (Student student) {
		System.out.println(student.getFullName() + " e�itmen silindi.");
	}
	
	public void showInfo() {
		
	}
}