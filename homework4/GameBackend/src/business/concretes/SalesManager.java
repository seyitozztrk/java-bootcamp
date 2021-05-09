package business.concretes;

import business.abstracts.SalesService;
import dataAccess.abstracts.SaleDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class SalesManager implements SalesService {

	private SaleDao saleDao;
	
	public SalesManager(SaleDao saleDao) {
		super();
		this.saleDao = saleDao;
	}

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaigns) {
		if (game.getAmountOfStock() > 0) {

			if(campaigns.getDiscountToTypeOfGame().equals(game.getTypeOfGame())) {
				this.saleDao.sell(gamer, game, campaigns.getAmountOfCampaign());
			} else {
				this.saleDao.sellWithoutCampaign(gamer, game);
			}
			
			
			
			
		} else {
			System.out.println("Üzgünüz, stokta urun kalmamis");
		}
	}
}
