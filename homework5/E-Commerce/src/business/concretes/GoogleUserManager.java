package business.concretes;

import java.util.List;

import business.abstracts.IUserService;
import core.abstracts.IAuthenticationService;
import core.abstracts.IVerificationService;
import dataAccess.abstracts.IUserDao;
import database.concretes.UserDatabase;
import entities.concretes.User;

public class GoogleUserManager implements IUserService{
	
	private IAuthenticationService _authentication;
	private IUserDao userDao; 
	private IVerificationService _verificationService;
	
	public GoogleUserManager(IAuthenticationService _authentication, IUserDao userDao,IVerificationService _verificationService) {
		super();
		this._authentication = _authentication;
		this.userDao = userDao;
		this._verificationService = _verificationService;
	}


	@Override
	public void signUp(User user) { //kaydol
		String[] getFirstLastName = _authentication.authenticationOfAccount(user);
		
		if(_authentication.authenticationOfAccount(user) != null) {
			
			user.setFirstName(getFirstLastName[0]);
			user.setLastName(getFirstLastName[1]);
			
			if(_verificationService.sendVerificationCode("05053335566")) {
				this.userDao.signUp(user);
			} else { 
				System.out.println("do�rulama kodunu yanl�� girdiniz ! Kay�t ba�ar�s�z ---");
			}
		} else {
			System.out.println("Kay�t ger�ekle�tirilememi�tir. "
					+ "Bilgilerinizi g�zden ge�irdikten sonra tekrar deneyiniz!");
		}
		
	}
	
	public void getAllDatabase() { 
		userDao.getAllDatabase();
	}
	

	@Override
	public void delete(User user) {
		
		this.userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		
		this.userDao.update(user);
		
	}


	@Override
	public void signIn(String eMail, String password) {  //giri� yap.
		boolean okay;
		
		for(User _user : UserDatabase.users) {
			if (_user.getEmail().equals(eMail) && _user.getPassword().equals(password)) {
				userDao.signIn(eMail, password);
				return;
			}
		}
		System.out.println("Girdi�iniz bilgilere ait bir kullan�c� bulunam�yor. Girme istedi�i ba�ar�s�z!!!");
		
	}

}
