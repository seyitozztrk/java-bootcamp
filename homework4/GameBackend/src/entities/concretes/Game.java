package entities.concretes;

import entities.abstracts.Games;

public class Game implements Games{
	
	private int id;
	private String name;
	private String typeOfGame;
	private double price;
	private int amountOfStock;
	
	public Game() {
		
	}
	
	public Game(int id, String name, String typeOfGame, double price, int amountOfStock) {
		super();
		this.id = id;
		this.name = name;
		this.typeOfGame = typeOfGame;
		this.price = price;
		this.amountOfStock = amountOfStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfGame() {
		return typeOfGame;
	}

	public void setTypeOfGame(String typeOfGame) {
		this.typeOfGame = typeOfGame;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmountOfStock() {
		return amountOfStock;
	}

	public void setAmountOfStock() {
		this.amountOfStock -= 1;
	}
	
	
	

}
