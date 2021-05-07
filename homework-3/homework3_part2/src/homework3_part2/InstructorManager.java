package homework3_part2;

public class InstructorManager extends UserManager {

	
	public void registerCourse(Instructor instructor, Courses course) {
		if (course.getInstructor().getFullName() == " "  ) {
			instructor.givenCourses.add(course);	
		} else { 
			System.out.println("Bu dersin hocasý mevcuttur...");
		}
	}
	
	
	
	public void add (Instructor instructor) {
		System.out.println(instructor.getFullName() + " eðitmen eklendi ");
	}
	public void delete (Instructor instructor) {
		System.out.println(instructor.getFullName() + " eðitmen silindi.");
	}
}
