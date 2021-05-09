package dataAccess.abstracts;

import entities.concretes.Gamer;

public interface GamerDao {
	
	void save(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer, String[] updateUserNameAndPasswords);
	void getInfoOfGamer(Gamer gamer);

}
