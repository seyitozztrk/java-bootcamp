package nLayered.dataAccess.abstracts;

import java.util.List;

import nLayered.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	// Ýnternet sitesinde ürüne ait resime týkladýðýmýzda ürünün id'sini alýrýz. 
	// Böylelikle ürüne ait sayfaya gitmek ister isek bu id vasýtasý ile gidilebilir.
	
	Product get(int id);
	List<Product> getAll();
	
}
