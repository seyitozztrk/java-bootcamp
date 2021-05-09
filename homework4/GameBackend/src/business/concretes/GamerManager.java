package business.concretes;

import business.abstracts.GamerService;
import core.abstracts.CustomerCheckService;
import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class GamerManager implements GamerService{
	private CustomerCheckService _checkService;
	private GamerDao gamerDao;
	
	public GamerManager(CustomerCheckService _checkService, GamerDao gamerDao) {
		super();
		this._checkService = _checkService;
		this.gamerDao = gamerDao;
	}

	@Override
	public void save(Gamer gamer) {
		
		if (_checkService.CheckIfRealPerson(gamer)) {
			
			this.gamerDao.save(gamer);
		} else {
			System.out.println("Kayit basarisiz. Lutfen kisisel bilgilerinizi dogru bir sekilde giriniz..");
		}	
		
		System.out.println("**********************KAYIT SENARYOSU BITMISTIR***********************************");
	}

	@Override
	public void delete(Gamer gamer, String password) {
		if (gamer.getPassword().equals(password)) {
			this.gamerDao.delete(gamer);
		} else {
			System.out.println("Silme islemi gerceklestirilememistir. Lütfen sifrenizi dogru giriniz.. ");
		}
		
		System.out.println("**********************SILME SENARYOSU BITMISTIR***********************************");
		
	}

	@Override
	public void update(Gamer gamer, String password, String[] updateUserNameAndPassword) {
		if (gamer.getPassword().equals(password)) {
			this.gamerDao.update(gamer, updateUserNameAndPassword );
		} else {
			System.out.println("Silme islemi gerceklestirilememistir. Lütfen sifrenizi dogru giriniz.. ");
		}
		
		System.out.println("**********************SILME SENARYOSU BITMISTIR***********************************");
	}

	@Override
	public void displayInfo(Gamer gamer) {
		
		this.gamerDao.getInfoOfGamer(gamer);
		System.out.println("**********************BILGI GORUNTULEME SENARYOSU BITMISTIR***********************************");
	}
	
	

}







