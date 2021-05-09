package business.abstracts;



import entities.concretes.Gamer;

public interface GamerService {
	
	void save(Gamer gamer);
	void delete(Gamer gamer, String password);
	void update(Gamer gamer, String password, String[] updateUserNameAndPassword);
	void displayInfo(Gamer gamer);
}
