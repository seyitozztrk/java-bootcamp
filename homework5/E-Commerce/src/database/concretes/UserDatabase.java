package database.concretes;

import java.util.ArrayList;
import java.util.List;

import database.abstracts.IDatabases;
import entities.concretes.User;

public class UserDatabase implements IDatabases {
	
	public static List<User> users = new ArrayList<User>();

}
