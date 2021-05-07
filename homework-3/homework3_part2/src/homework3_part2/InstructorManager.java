package homework3_part2;

public class InstructorManager extends UserManager {

	
	public void registerCourse(Instructor instructor, Courses course) {
		if (course.getInstructor().getFullName() == " "  ) {
			instructor.givenCourses.add(course);	
		} else { 
			System.out.println("Bu dersin hocas� mevcuttur...");
		}
	}
	
	
	
	public void add (Instructor instructor) {
		System.out.println(instructor.getFullName() + " e�itmen eklendi ");
	}
	public void delete (Instructor instructor) {
		System.out.println(instructor.getFullName() + " e�itmen silindi.");
	}
}
