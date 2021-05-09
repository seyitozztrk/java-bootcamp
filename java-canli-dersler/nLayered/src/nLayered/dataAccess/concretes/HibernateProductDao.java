package nLayered.dataAccess.concretes;

import java.util.List;

import nLayered.dataAccess.abstracts.ProductDao;
import nLayered.entities.concretes.Product;

//hibernate : veritabanýyla iletiþim kuran java yapýsýdýr.
public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi : " + product.getName());
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
