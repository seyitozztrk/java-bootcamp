package core.concretes;

import core.abstracts.CustomerCheckService;
import entities.concretes.Gamer;

public class GamerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		return true;
	}

}
