package homework3_part2;

public class StudentManager extends UserManager {
	
	
	public void registerCourse(Student student, Courses course) {
		System.out.println("studentt");
		if(course.getPersonNumberLimitations() < course.studentsOfCourse.size()) {
			student.registeredCourses.add(course);	
			System.out.println("eklendi");
		} else { 
			System.out.println("Bu dersin limiti dolmuştur...");
		}
	}
	
	
	public void add (Student student) {
		System.out.println(student.getFullName() + " eğitmen eklendi ");
	}
	public void delete (Student student) {
		System.out.println(student.getFullName() + " eğitmen silindi.");
	}
	
	public void showInfo() {
		
	}
}