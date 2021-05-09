

import java.util.Scanner;

import business.abstracts.GamerService;
import business.abstracts.SalesService;
import business.concretes.GamerManager;
import business.concretes.SalesManager;
import core.concretes.GamerCheckManager;
import core.concretes.MernisCheckAdapter;
import dataAccess.concretes.AbcGamerDao;
import dataAccess.concretes.AbcSaleDao;
import dataAccess.concretes.HibernateGamerDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Gamer;

public class Main {

	public static void main(String[] args) {
	//gamer objesi oluþturuyoruz.
	Gamer gamer1 = new Gamer(1,"seyitoztrk", "12345","66046287188","SEYÝT AHMET", "ÖZTÜRK", 1996);
	Game game1 = new Game(1,"FIFA21", "football", 250, 3);
	Campaign campaign1 = new Campaign(1, "football", 15 );
	gamerBilgiGostermeSenaryosu(gamer1);
	
	gamerEklemeSenaryosu(gamer1);
	
	gamerGuncellemeSenaryosu(gamer1);
	
	gamerBilgiGostermeSenaryosu(gamer1);
	
	gamerSilmeSenaryosu(gamer1);
	
	//oyun satýþý senaryosu
	gameOyunSatisi(gamer1, game1, campaign1);
	
	gamerBilgiGostermeSenaryosu(gamer1);
	
	gameOyunSatisi(gamer1, game1, campaign1);
	
	gamerBilgiGostermeSenaryosu(gamer1);
	
	gameOyunSatisi(gamer1, game1, campaign1);
	gamerBilgiGostermeSenaryosu(gamer1);
	
	gameOyunSatisi(gamer1, game1, campaign1);
	
	gamerBilgiGostermeSenaryosu(gamer1);


	}
	
	public static void gameOyunSatisi(Gamer gamer, Game game, Campaign campaign) {
		SalesService salesService = new SalesManager(new AbcSaleDao());
		salesService.sell(gamer, game, campaign);
	}
	
	
	
	public static void gamerEklemeSenaryosu(Gamer gamer) {
		System.out.println("Oyuncu kayýt etme senaryosu baþlatýlýyor ....");
		//oyuncu ekleme senaryosu 
		
		GamerService gamerManager = new GamerManager(new GamerCheckManager(), new HibernateGamerDao());
		gamerManager.save(gamer);
	}
	
	public static void gamerSilmeSenaryosu(Gamer gamer) {
		System.out.println("Oyuncu silme senaryosu baþlatýlýyor ....");
		//oyuncu silme senaryosu 
		GamerService gamerManager = new GamerManager(new MernisCheckAdapter(), new AbcGamerDao());
		
		String password = sifreIste();
		
		//oyuncu silme senaryosu
		gamerManager.delete(gamer, password);
	}
	
	public static void gamerGuncellemeSenaryosu(Gamer gamer) {
		System.out.println("Oyuncu bilgileri guncelleme senaryosu baþlatýlýyor ....");
		//oyuncu silme senaryosu 
		GamerService gamerManager = new GamerManager(new MernisCheckAdapter(), new HibernateGamerDao());
		
		String password = sifreIste();
		String[] newUserNameAndPassword = {"seyit_ozturk", "seyit123"};
		gamerManager.update(gamer, password,newUserNameAndPassword);
		
	}
	
	public static void gamerBilgiGostermeSenaryosu(Gamer gamer) {
		System.out.println("Oyuncu bilgileri goruntuleme senaryosu baþlatýlýyor ....");
		//oyuncu silme senaryosu 
		GamerService gamerManager = new GamerManager(new MernisCheckAdapter(), new HibernateGamerDao());
		
		gamerManager.displayInfo(gamer);
		
	}
	
	public static String sifreIste() {
		//kullanýcýdan bir þifre istiyoruz...
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen guncelleme islemine devam etmek icin sifrenizi giriniz : ");
		String password = scan.nextLine();
		return password;

	}

}









