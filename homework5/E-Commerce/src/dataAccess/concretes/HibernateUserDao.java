package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.IUserDao;
import database.concretes.GoogleDatabase;
import database.concretes.UserDatabase;
import entities.concretes.User;

public class HibernateUserDao implements IUserDao{

	@Override
	public void signUp(User user) {
		
		System.out.println("Kay�t i�lemi ba�ar�l�.");
		UserDatabase.users.add(user);
	}

	@Override
	public void signIn(String eMail, String password) {
		System.out.println("Siteye giri� yap�lm��t�r.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kisisine ait hesap silindi!");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " ki�isine ait hesap guncellendi!");
	}
	
	
	public void getAllDatabase() { 
		System.out.println("\n**********Sitenin �ye database'i******************");
		for(User user : UserDatabase.users) {
			System.out.println(user.getEmail() + " ->> " + user.getFirstName() );
		}
		System.out.println("**************************************************\n");
	}
	
	
}
