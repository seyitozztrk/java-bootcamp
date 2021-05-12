package GoogleAuth;

import java.util.Scanner;

import database.concretes.GoogleDatabase;
import entities.concretes.User;

public class GoogleAuthentication {
	
	public String[] authenticateAccount(String email, String password) {
		
		for (User user: GoogleDatabase.googleUsers) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				String[] firstLastName = {user.getFirstName(), user.getLastName()};
				return firstLastName;
			}
		}
		
		return null;
	}
	
	

	

}
