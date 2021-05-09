package nLayered.business.concretes;

import java.util.List;

import nLayered.business.abstracts.ProductService;
import nLayered.core.abstracts.LoggerService;
import nLayered.dataAccess.abstracts.ProductDao;
import nLayered.entities.concretes.Product;

public class ProductManager implements ProductService {
	//dependency injection : gev�ek ba�l�l�k
	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		
		if(product.getCategoryId() == 1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor ... ");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi : " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
