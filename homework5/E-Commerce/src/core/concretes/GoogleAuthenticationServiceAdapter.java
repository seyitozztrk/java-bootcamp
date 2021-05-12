package core.concretes;

import GoogleAuth.GoogleAuthentication;
import core.abstracts.IAuthenticationService;
import entities.concretes.User;

public class GoogleAuthenticationServiceAdapter implements IAuthenticationService{
	
	@Override
	public String[] authenticationOfAccount(User user) {

		GoogleAuthentication googleAuth = new GoogleAuthentication();
		return googleAuth.authenticateAccount(user.getEmail(), user.getPassword());
	}
	
}
