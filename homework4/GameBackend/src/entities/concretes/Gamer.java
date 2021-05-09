package entities.concretes;

import java.util.ArrayList;
import java.util.List;

import entities.abstracts.Gamers;

public class Gamer implements Gamers {
	private int id;
	private String userName;
	private String password;
	
	private List<Game> myGames;
	
	private String tcNo;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	
	
	public Gamer() {
		
	}
	
	public Gamer(int id, String userName, String password, String tcNo, String firstName, String lastName,int dateOfBirth) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.tcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		
		this.myGames = new ArrayList<Game>();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTcNo() {
		return tcNo;
	}


	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<Game> getMyGames() {
		return myGames;
	}

	public void setMyGames(Game game) {
		this.myGames.add(game);
	}
	
	

}
