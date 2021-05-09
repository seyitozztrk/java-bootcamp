package dataAccess.concretes;

import dataAccess.abstracts.SaleDao;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class AbcSaleDao implements SaleDao{

	@Override
	public void sell(Gamer gamer, Game game, double discount) {
		double priceCutting = game.getPrice() * discount / 100;
		
		gamer.setMyGames(game);
		game.setAmountOfStock();
		
		System.out.println("ABC dao ile " + gamer.getFirstName() 
		+ " isimli oyuncuya " + game.getName() + "oyunu sat�lm��t�r." 
		+ "normal fiyat� " + game.getPrice() 
		+ " TL olan bu �r�n " + (game.getPrice() - priceCutting) 
		+" TL fiyata satilmistir... ");
		
	}

	@Override
	public void sellWithoutCampaign(Gamer gamer, Game game) {
		
		gamer.setMyGames(game);
		game.setAmountOfStock();
		
		System.out.println("Hibernate dao ile " + gamer.getFirstName() 
		+ " isimli oyuncuya " + game.getName() + "oyunu sat�lm��t�r.");
		
	}
	

}
