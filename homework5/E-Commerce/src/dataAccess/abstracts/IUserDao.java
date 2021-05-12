package dataAccess.abstracts;

import java.util.List;

import database.concretes.GoogleDatabase;
import entities.concretes.User;

public interface IUserDao {
	
	void signUp(User user);  //önemli
	void signIn(String eMail, String password);
	
	void delete(User user);
	void update(User user);
	
	public void getAllDatabase();

}
