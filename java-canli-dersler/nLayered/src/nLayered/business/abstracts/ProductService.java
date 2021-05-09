package nLayered.business.abstracts;

import java.util.List;

import nLayered.entities.concretes.Product;

public interface ProductService {
	
	void add(Product product);
	List<Product> getAll();

}
