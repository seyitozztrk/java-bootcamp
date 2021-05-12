package core.concretes;

import GoogleAuth.GoogleVerificationAPI;
import core.abstracts.IVerificationService;

public class GoogleVerification implements IVerificationService{
	

	@Override
	public boolean sendVerificationCode(String email) {
		
		GoogleVerificationAPI googleVerificationAPI = new GoogleVerificationAPI();
		return googleVerificationAPI.sendVerificationCode(email);
		 
	}
	

}
