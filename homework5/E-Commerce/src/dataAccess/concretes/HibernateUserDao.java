package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.IUserDao;
import database.concretes.GoogleDatabase;
import database.concretes.UserDatabase;
import entities.concretes.User;

public class HibernateUserDao implements IUserDao{

	@Override
	public void signUp(User user) {
		
		System.out.println("Kayýt iþlemi baþarýlý.");
		UserDatabase.users.add(user);
	}

	@Override
	public void signIn(String eMail, String password) {
		System.out.println("Siteye giriþ yapýlmýþtýr.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " kisisine ait hesap silindi!");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " kiþisine ait hesap guncellendi!");
	}
	
	
	public void getAllDatabase() { 
		System.out.println("\n**********Sitenin üye database'i******************");
		for(User user : UserDatabase.users) {
			System.out.println(user.getEmail() + " ->> " + user.getFirstName() );
		}
		System.out.println("**************************************************\n");
	}
	
	
}
