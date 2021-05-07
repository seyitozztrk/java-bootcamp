package homework3_part2;

public class UserManager {
	
	public void add (User user) {
		System.out.println(user.getFullName() + " eðitmen eklendi ");
	}
	public void delete (User user) {
		System.out.println(user.getFullName() + " eðitmen silindi.");
	}
	
	public void registerCourse(User user, Courses course) {
		System.out.println("Ders eklendi ... ");
	}
	
}
