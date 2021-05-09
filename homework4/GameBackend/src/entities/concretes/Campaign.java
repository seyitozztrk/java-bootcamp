package entities.concretes;

import entities.abstracts.Campaigns;

public class Campaign implements Campaigns{
	
	private int id;
	private String discountToTypeOfGame;
	private double amountOfDiscount;
	
 	public Campaign() {
 		
 	}
	
	public Campaign(int id, String discountToTypeOfGame, double amountOfDiscount) {
		super();
		this.id = id;
		this.discountToTypeOfGame = discountToTypeOfGame;
		this.amountOfDiscount = amountOfDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscountToTypeOfGame() {
		return discountToTypeOfGame;
	}

	public void setDiscountToTypeOfGame(String discountToTypeOfGame) {
		this.discountToTypeOfGame = discountToTypeOfGame;
	}

	public double getAmountOfCampaign() {
		return amountOfDiscount;
	}

	public void setAmountOfCampaign(double amountOfCampaign) {
		this.amountOfDiscount = amountOfCampaign;
	}
	
	
	
}
