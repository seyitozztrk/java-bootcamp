package nLayered.dataAccess.abstracts;

import java.util.List;

import nLayered.entities.concretes.Product;

public interface ProductDao {
	
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	// �nternet sitesinde �r�ne ait resime t�klad���m�zda �r�n�n id'sini al�r�z. 
	// B�ylelikle �r�ne ait sayfaya gitmek ister isek bu id vas�tas� ile gidilebilir.
	
	Product get(int id);
	List<Product> getAll();
	
}
