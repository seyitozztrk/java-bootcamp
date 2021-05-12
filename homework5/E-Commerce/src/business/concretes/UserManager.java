package business.concretes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import business.abstracts.IUserService;
import core.abstracts.IAuthenticationService;
import core.abstracts.IVerificationService;
import dataAccess.abstracts.IUserDao;
import database.concretes.UserDatabase;
import entities.concretes.User;

public class UserManager implements IUserService{
	
	private IAuthenticationService _authentication;
	private IVerificationService _verification;
	private IUserDao userDao; 

	public UserManager(IAuthenticationService _authentication, IUserDao userDao, IVerificationService _verification) {
		super();
		this._authentication = _authentication;
		this.userDao = userDao;
		this._verification = _verification;
	}
	
	public void getAllDatabase() { 
		userDao.getAllDatabase();
	}
	
	
	@Override
	public void signUp(User user) { //kaydol
		if(this.inputValidation(user)) {
			//GoogleDatabase.usersOfGoogle.put(user.getEmail(), user.getPassword());
			System.out.println("E-postanýza bir oðrulama kodu gönderilmiþtir.");
			
			if (_verification.sendVerificationCode(user.getEmail()) == true) {
				this.userDao.signUp(user);
			} else {
				System.out.println("Üzgünüz, girmiþ olduðunuz mail tarafýndan bir onaylama gerçekleþtirilmediði için üyeliðiniz kabul edilememektedir.");
			}
		} else {
			System.out.println("Kayýt gerçekleþtirilememiþtir. "
					+ "Bilgilerinizi gözden geçirdikten sonra tekrar deneyiniz!");
		}
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
	public void signIn(String eMail, String password) {  //giriþ yap.
		boolean okay;
		for(User _user : UserDatabase.users) {
			if (_user.getEmail().equals(eMail) && _user.getPassword().equals(password)) {
				userDao.signIn(eMail, password);
				return;
			}
		}
		System.out.println("Girdiðiniz bilgilere ait bir kullanýcý bulunamýyor. Girme istediði baþarýsýz!!!");
		
	}
	
	public boolean inputValidation(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@gmail.com";
		Pattern pattern = Pattern.compile(regex);
		 
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if (user.getPassword().length() < 6) {
			System.out.println("Parolanýz en az 6 karakter olmalý!");
			return false;
		} 
		
		if (!matcher.matches()) {
			System.out.println("Lütfen mail adresinizi uygun formatta giriniz.");
			return false;
		} 
		if(user.getFirstName().length() < 2 && user.getLastName().length() < 2 ) {
			System.out.println("Ýsim veya soyisim en az 2 karakterden oluþmalýdýr.");
			return false;
		} 
		
		for(User _user: UserDatabase.users) {
			if(_user.getEmail() == user.getEmail()) {
				System.out.println("Bu e-posta daha önce kullanýlmýþtýr.");
				return false;
			}
		}
		return true;
	}

}
