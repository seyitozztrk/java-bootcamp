package dataAccess.concretes;

import dataAccess.abstracts.GamerDao;
import entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao {

	@Override
	public void save(Gamer gamer) {
		System.out.println("Hibernate Dao ile kullan�c� sisteme kay�t edilmi�tir. Kullan�c� bilgileri :" 
				+ gamer.getFirstName() +" " +gamer.getLastName() );
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Hibernate Dao ile " + gamer.getFirstName() 
		+ " isimli kullan�c�n�n silme i�lemi ba�ar�l� bir �ekilde ger�ekle�tirilmi�tir." );
		
	}

	@Override
	public void update(Gamer gamer, String[] updateUserNameAndPassword) {
		
		gamer.setUserName(updateUserNameAndPassword[0]);
		gamer.setPassword(updateUserNameAndPassword[1]);
		
		System.out.println("Hibernate Dao ile " + gamer.getFirstName() 
		+ " isimli kullan�c�n�n guncelleme islemi basarili bir sekilde gerceklestirilmistir." );
		
		
	}

	@Override
	public void getInfoOfGamer(Gamer gamer) {
		System.out.println("Hibernate Dao ile bu bilgiler getirilmistir. \n " 
							+"User Name : " + gamer.getUserName() 
							+"\nPassword : " + gamer.getPassword() 
							+"\nGames : " + gamer.getMyGames()
						);
		
	}
	

}
