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
			System.out.println("E-postan�za bir o�rulama kodu g�nderilmi�tir.");
			
			if (_verification.sendVerificationCode(user.getEmail()) == true) {
				this.userDao.signUp(user);
			} else {
				System.out.println("�zg�n�z, girmi� oldu�unuz mail taraf�ndan bir onaylama ger�ekle�tirilmedi�i i�in �yeli�iniz kabul edilememektedir.");
			}
		} else {
			System.out.println("Kay�t ger�ekle�tirilememi�tir. "
					+ "Bilgilerinizi g�zden ge�irdikten sonra tekrar deneyiniz!");
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
	
	public boolean inputValidation(User user) {
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@gmail.com";
		Pattern pattern = Pattern.compile(regex);
		 
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if (user.getPassword().length() < 6) {
			System.out.println("Parolan�z en az 6 karakter olmal�!");
			return false;
		} 
		
		if (!matcher.matches()) {
			System.out.println("L�tfen mail adresinizi uygun formatta giriniz.");
			return false;
		} 
		if(user.getFirstName().length() < 2 && user.getLastName().length() < 2 ) {
			System.out.println("�sim veya soyisim en az 2 karakterden olu�mal�d�r.");
			return false;
		} 
		
		for(User _user: UserDatabase.users) {
			if(_user.getEmail() == user.getEmail()) {
				System.out.println("Bu e-posta daha �nce kullan�lm��t�r.");
				return false;
			}
		}
		return true;
	}

}
