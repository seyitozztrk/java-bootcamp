package database.concretes;


import java.util.ArrayList;
import java.util.List;

import database.abstracts.IGoogleDatabase;
import entities.concretes.User;

public class GoogleDatabase implements IGoogleDatabase {
	
	public static List<User> googleUsers = new ArrayList<User>();
	
}
