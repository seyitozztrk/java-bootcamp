package homework3_part2;

public class AdminManager {
	private UserManager userManager; //bu kısımda sorun var gibi 
	
	public AdminManager(UserManager userManager) {
		 this.userManager = userManager;
	}
	
	public void assignPerson(User person, Courses course ) {
		this.userManager.registerCourse(person, course);
	}
}
