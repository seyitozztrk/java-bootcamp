package dataAccess.concretes;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class AbcGamerDao implements GamerDao{

	@Override
	public void save(Gamer gamer) {
		System.out.println("ABC Dao ile kullanici sisteme kayit edilmistir. Kullanici bilgileri :" 
						+ gamer.getFirstName() +" " +gamer.getLastName() );
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("ABC Dao ile " + gamer.getFirstName() 
		+ " isimli kullanýcýnýn silme islemi basarili bir sekilde gerceklestirilmistir." );
		
	}

	@Override
	public void update(Gamer gamer, String[] updateUserNameAndPassword) {
		
		gamer.setUserName(updateUserNameAndPassword[0]);
		gamer.setPassword(updateUserNameAndPassword[1]);
		
		System.out.println("ABC Dao ile " + gamer.getFirstName() 
	+ " isimli kullanýcýnýn guncelleme islemi basarili bir sekilde gerceklestirilmistir." );
	
	}

	@Override
	public void getInfoOfGamer(Gamer gamer) {

		System.out.println("ABC Dao ile bu bilgiler getirilmistir. \n " 
							+"User Name : " + gamer.getUserName() 
							+"\nPassword : " + gamer.getPassword() 
							+"\nGames : " + gamer.getMyGames()
						);
		
		
	}
	

}






