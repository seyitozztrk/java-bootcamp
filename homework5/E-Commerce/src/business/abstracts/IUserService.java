package business.abstracts;

import entities.concretes.User;

public interface IUserService  {
	void signUp(User user);
	void signIn(String eMail, String password);
	
	void delete(User user);
	void update(User user);
	
	void getAllDatabase();
}
