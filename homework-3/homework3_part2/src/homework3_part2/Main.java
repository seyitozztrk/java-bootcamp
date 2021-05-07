package homework3_part2;

public class Main {
	public static void main(String[] args) {
		
		//eğitmenler
		Instructor seyit = new Instructor("seyit kahya", "seyit@gmail.com", "12345");
		Instructor seyit2 = new Instructor("seyit2 kahya", "seyit2@gmail.com", "22222");
		
		//öğrenciler
		Student ahmet1 = new Student("ahmet kaya", "ahmet@gmail.com", "11111");
		Student ahmet2 = new Student("ahmet2 kaya", "ahmet2@gmail.com", "22222");
		Student ahmet3 = new Student("ahmet3 kaya", "ahmet3@gmail.com", "33333");
		
		//ders
		Courses csharp = new ProgrammingCsharp("csharp",seyit , 3);
		
		//bu kısmı anlamadım ???? 
		AdminManager adminWorks = new AdminManager(new StudentManager());
		
		adminWorks.assignPerson(ahmet3, csharp);
		
		
		/*
		 
        Student student  = new Student("seyit ahmet", "seyit@gmail.com", "1111");
        
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        
        Instructor instructor=new Instructor("engin demirog", "engin@gmail.com", "2222");
        
        InstructorManager instructorManager= new InstructorManager();
        instructorManager.add(instructor);
		*/
	}

}
