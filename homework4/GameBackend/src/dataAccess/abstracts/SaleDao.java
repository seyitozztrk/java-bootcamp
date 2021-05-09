package dataAccess.abstracts;

import entities.concretes.Game;
import entities.concretes.Gamer;

public interface SaleDao {
	void sell(Gamer gamer, Game game, double discount);
	void sellWithoutCampaign(Gamer gamer, Game game);
}
