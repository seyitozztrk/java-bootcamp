package core.abstracts;

import GoogleAuth.GoogleVerificationAPI;

public interface IVerificationService {
	
	boolean sendVerificationCode(String email);

}
