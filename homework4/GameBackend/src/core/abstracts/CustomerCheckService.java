package core.abstracts;

import entities.concretes.Gamer;

public interface CustomerCheckService {
	
	boolean CheckIfRealPerson(Gamer gamer);

}
