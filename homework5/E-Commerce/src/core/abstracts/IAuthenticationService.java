package core.abstracts;

import entities.concretes.User;

public interface IAuthenticationService {
	
	String[] authenticationOfAccount(User user);

	
}
