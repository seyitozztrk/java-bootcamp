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
		+ " isimli oyuncuya " + game.getName() + "oyunu satýlmýþtýr." 
		+ "normal fiyatý " + game.getPrice() 
		+ " TL olan bu ürün " + (game.getPrice() - priceCutting) 
		+" TL fiyata satilmistir... ");
		
	}

	@Override
	public void sellWithoutCampaign(Gamer gamer, Game game) {
		
		gamer.setMyGames(game);
		game.setAmountOfStock();
		
		System.out.println("Hibernate dao ile " + gamer.getFirstName() 
		+ " isimli oyuncuya " + game.getName() + "oyunu satýlmýþtýr.");
		
	}
	

}
