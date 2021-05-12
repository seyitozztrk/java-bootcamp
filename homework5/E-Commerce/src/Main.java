import business.abstracts.IUserService;
import business.concretes.GoogleUserManager;
import business.concretes.UserManager;
import core.concretes.GoogleAuthenticationServiceAdapter;
import core.concretes.GoogleVerification;
import core.concretes.SmsVerification;
import dataAccess.concretes.HibernateUserDao;
import database.concretes.GoogleDatabase;
import entities.concretes.User;
class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoogleDatabase googleDatabase = new GoogleDatabase();
		googleAddPerson(googleDatabase);
		//google ile kayýt olunacak kullanýcýlar 
		User user1 = new User("ali@gmail.com", "123456", "", "");
		User user2 = new User("veli@gmail.com", "123456", "", "");
		User user3 = new User("ali5@gmail.com", "123456","", "");
	
		IUserService googleUserService = 
			new GoogleUserManager(new GoogleAuthenticationServiceAdapter(), new HibernateUserDao(), new SmsVerification());
		googleUserService.signUp(user1); //kayýt1
		googleUserService.getAllDatabase();
		googleUserService.signUp(user2); //kayýt2
		googleUserService.getAllDatabase();
		googleUserService.signUp(user3); //kayýt3
		googleUserService.getAllDatabase();
		//normal kayýt
		IUserService defaultUserService = 
			new UserManager(new GoogleAuthenticationServiceAdapter(), new HibernateUserDao(), new GoogleVerification());
		User user4 = new User("soner@gmail.com", "123456","soner", "Ayaz");
		User user5 = new User("soner@gmail.com", "123456","soner", "Ayaz");
		User user6 = new User("soner3@gmail.com", "123456","soner3", "Ayaz");
		
		defaultUserService.signUp(user4); //kayýt4
		defaultUserService.getAllDatabase();
		defaultUserService.signUp(user5); //kayýt5
		defaultUserService.getAllDatabase();
		defaultUserService.signUp(user6); //kayýt6
		defaultUserService.getAllDatabase();
		
		
		defaultUserService.signIn("ali5@gmail.com", "123456");
		
		
		
		
		
	}
	
	
	
	public static void googleAddPerson(GoogleDatabase googleDatabase) {
		
		User user1 = new User("ali@gmail.com", "123456","Ali1", "Ayaz1");
		User user2 = new User("ali2@gmail.com", "123456","Ali2", "Ayaz2");
		User user3 = new User("ali3@gmail.com", "123456","Ali3", "Ayaz3");
		User user4 = new User("ali4@gmail.com", "123456","Ali4", "Ayaz4");
		User user5 = new User("ali5@gmail.com", "123456","Ali5", "Ayaz5");
		User user6 = new User("ali6@gmail.com", "123456","Ali6", "Ayaz6");
		
		
		googleDatabase.googleUsers.add(user1);
		googleDatabase.googleUsers.add(user2);
		googleDatabase.googleUsers.add(user3);
		googleDatabase.googleUsers.add(user4);
		googleDatabase.googleUsers.add(user5);
		googleDatabase.googleUsers.add(user6);
		
	}
	

}
