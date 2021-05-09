package nLayered;

import nLayered.business.abstracts.ProductService;
import nLayered.business.concretes.ProductManager;
import nLayered.core.concretes.JLoggerManagerAdapter;
import nLayered.dataAccess.concretes.AbcProductDao;
import nLayered.dataAccess.concretes.HibernateProductDao;
import nLayered.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo : spring IoC ile bu kötü kod silinecek..
		ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1,2,"elma", 12, 50);
		productService.add(product);
		
	}
}
