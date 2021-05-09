package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	void update(Game game);
	void delete(Game game);

	List<Campaign> getAll();
	
}
