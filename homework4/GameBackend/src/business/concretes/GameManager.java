package business.concretes;

import java.util.List;

import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concretes.Campaign;
import entities.concretes.Game;

public class GameManager implements GameService {
	
	public GameManager(GameDao gameDao) {
		super();
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub	
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
